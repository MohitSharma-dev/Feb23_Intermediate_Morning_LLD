package ParkingLot.strategies;

import ParkingLot.models.SlotAssignmentStrategyType;

public class SlotAssignmentStrategyFactory {
    public static SlotAssignmentStrategy getSlotAssignmentStrategyByType(SlotAssignmentStrategyType slotAssignmentStrategyType){
        return new RandomSlotAssignmentStrategy();
    }
}
