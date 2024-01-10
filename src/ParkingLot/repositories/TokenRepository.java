package ParkingLot.repositories;

import ParkingLot.models.Token;

import java.util.Map;
import java.util.TreeMap;

public class TokenRepository {
    private Map<Long, Token> tokens = new TreeMap<>();
    private int previousId = 0;
    public Token saveToken(Token token){
        previousId += 1;
        token.setId( previousId);
        tokens.put((long) previousId , token);
        return token;
    }
}
