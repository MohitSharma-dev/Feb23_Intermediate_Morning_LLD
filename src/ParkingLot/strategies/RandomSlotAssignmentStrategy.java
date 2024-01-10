package ParkingLot.strategies;

import ParkingLot.models.Gate;
import ParkingLot.models.ParkingSlot;
import ParkingLot.models.VehicleTypes;

public class RandomSlotAssignmentStrategy implements SlotAssignmentStrategy{
    @Override
    public ParkingSlot getSlot(Gate gate, VehicleTypes vehicleType) {
        // using gate -> Parking Lot
        // using Parking lot -> floors
        // on the floors -> slots
        // choose an empty slot of corresponding vehicle type
        return null;
    }
}
