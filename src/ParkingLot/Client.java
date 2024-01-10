package ParkingLot;

import ParkingLot.controllers.TokenController;
import ParkingLot.models.Token;
import ParkingLot.repositories.GateRepository;
import ParkingLot.repositories.ParkingLotRepository;
import ParkingLot.repositories.TokenRepository;
import ParkingLot.repositories.VehicleRepository;
import ParkingLot.services.TokenService;

public class Client {
    public static void main(String[] args) {
        ParkingLotRepository parkingLotRepository = new ParkingLotRepository();
        TokenRepository tokenRepository = new TokenRepository();
        GateRepository gateRepository = new GateRepository();
        VehicleRepository vehicleRepository = new VehicleRepository();

        TokenService tokenService = new TokenService(
                gateRepository,
                vehicleRepository,
                parkingLotRepository,
                tokenRepository
        );

        TokenController tokenController = new TokenController(tokenService);
//        tokenController.issueToken();
    }
}
// Controllers , repo , services
// Controller -> service -> repo
