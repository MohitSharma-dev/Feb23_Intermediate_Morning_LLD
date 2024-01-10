package ParkingLot.services;

import ParkingLot.models.*;
import ParkingLot.repositories.GateRepository;
import ParkingLot.repositories.ParkingLotRepository;
import ParkingLot.repositories.TokenRepository;
import ParkingLot.repositories.VehicleRepository;
import ParkingLot.strategies.SlotAssignmentStrategyFactory;

import java.util.Date;
import java.util.Optional;

public class TokenService {
    private GateRepository gateRepository;
    private VehicleRepository vehicleRepository;
    private ParkingLotRepository parkingLotRepository;
    private TokenRepository tokenRepository;

    public TokenService(
            GateRepository gateRepository,
            VehicleRepository vehicleRepository,
            ParkingLotRepository parkingLotRepository,
            TokenRepository tokenRepository
    ){
        this.gateRepository = gateRepository;
        this.vehicleRepository = vehicleRepository;
        this.parkingLotRepository = parkingLotRepository;
        this.tokenRepository = tokenRepository;
    }
    public Token issueToken(
            String vehicleNumber,
            String vehicleOwnerName,
            Long gateId,
            VehicleTypes vehicleType
    ){
        // 1. Create a token object
        Token token = new Token();
        token.setEntryTime(new Date());

        Optional<Gate> gateOptional= gateRepository.findGateById(gateId);
        if(gateOptional.isEmpty()){
            throw new RuntimeException();
        }
        Gate gate = gateOptional.get();
        token.setGeneratedAt(gate);
        token.setGeneratedBy(gate.getCurrentOperator());

        Optional<Vehicle> vehicleOptional = vehicleRepository.findVehicleByNumber(vehicleNumber);
        Vehicle savedVehicle;
        if(vehicleOptional.isEmpty()){
            Vehicle vehicle = new Vehicle();
            vehicle.setOwnerName(vehicleOwnerName);
            vehicle.setVehicleType(vehicleType);
            vehicle.setVehicleNumber(vehicleNumber);
            savedVehicle = vehicleRepository.saveVehicle(vehicle);
        } else {
            savedVehicle = vehicleOptional.get();
        }
        token.setVehicle(savedVehicle);
        // 2. Assign a spot
        SlotAssignmentStrategyType slotAssignmentStrategyType =  parkingLotRepository
                                                                    .findParkingLotByGate(gate)
                                                                    .getSlotAssignmentStrategyType();
        ParkingSlot parkingSlot = SlotAssignmentStrategyFactory.getSlotAssignmentStrategyByType(slotAssignmentStrategyType)
                .getSlot(gate, vehicleType);

        token.setParkingSlot(parkingSlot);
        parkingSlot.setParkingSlotStatus(ParkingSlotStatus.FILLED);
        Token savedToken = tokenRepository.saveToken(token);
        savedToken.setNumber("TICKET - " + savedToken.getId());
        // 3. return token
        return savedToken;
    }
}

// DTO : Client -> Controller
// Why not DTO's in service ?


// 1. Complete vehicleRepo
// 2. Complete client and make the proper call by first ingesting some data
// 3. Complete RandomSlot Strategy
// 4. Give an attempt to generateBill