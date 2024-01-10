package ParkingLot.strategies;

import ParkingLot.models.Gate;
import ParkingLot.models.ParkingSlot;
import ParkingLot.models.VehicleTypes;

public interface SlotAssignmentStrategy {
    public ParkingSlot getSlot(Gate gate , VehicleTypes vehicletype);
}

// parking lot -> slots
// floors -> slots