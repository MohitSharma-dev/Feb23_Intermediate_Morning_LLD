package ParkingLot.repositories;

import ParkingLot.models.Gate;
import ParkingLot.models.ParkingLot;

import javax.swing.text.html.Option;
import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;

public class ParkingLotRepository {
     private Map<Long, ParkingLot> parkingLots = new TreeMap<>();
     public ParkingLot findParkingLotByGate(Gate gate){
         for(ParkingLot parkingLot : parkingLots.values()){
             if(parkingLot.getGates().contains(gate)){
                 return parkingLot;
             }
         }
        return null;
    }
}
