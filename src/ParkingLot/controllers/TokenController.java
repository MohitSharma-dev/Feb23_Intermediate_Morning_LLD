package ParkingLot.controllers;

import ParkingLot.dtos.IssueTokenRequestDTO;
import ParkingLot.dtos.IssueTokenResponseDTO;
import ParkingLot.dtos.ResponseStatus;
import ParkingLot.models.Token;
import ParkingLot.services.TokenService;

public class TokenController {
    private TokenService tokenService;

    public TokenController(TokenService tokenService){
        this.tokenService = tokenService;
    }
    public IssueTokenResponseDTO issueToken(IssueTokenRequestDTO issueTokenRequestDTO){
        IssueTokenResponseDTO response = new IssueTokenResponseDTO();
        try {
            Token token = tokenService.issueToken(
                    issueTokenRequestDTO.getVehicleNumber(),
                    issueTokenRequestDTO.getVehicleOwnerName(),
                    issueTokenRequestDTO.getGateId(),
                    issueTokenRequestDTO.getVehicleType()
            );
            response.setToken(token);
            response.setResponseStatus(ResponseStatus.SUCCESS);
        } catch (Exception ex){
            response.setResponseStatus(ResponseStatus.FAILURE);
            response.setFailureMessage("Something went wrong!");
        }

        return response;
    }
}

// 1. Need to interact with the client
// 2. When request comes, Validations can happen in controller
// 3. It needs to call the service and send the parameters
// 4. receive the output and accordingly create your response