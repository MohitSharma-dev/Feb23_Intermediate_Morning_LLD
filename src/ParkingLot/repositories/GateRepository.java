package ParkingLot.repositories;

import ParkingLot.models.Gate;

import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;

public class GateRepository {
    private Map<Long, Gate> gates = new TreeMap<>();
    public Optional<Gate> findGateById(Long gateId){
        if(gates.containsKey(gateId)){
            return Optional.of(gates.get(gateId));
        }
        // db.execute('Select * from gates where id = 11');
        return Optional.empty();
    }
}

