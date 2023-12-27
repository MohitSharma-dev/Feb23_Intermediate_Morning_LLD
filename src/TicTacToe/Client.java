package TicTacToe;

import TicTacToe.Exceptions.InvalidBotCountException;
import TicTacToe.controllers.GameController;
import TicTacToe.models.Game;
import TicTacToe.models.GameState;

import java.util.ArrayList;

public class Client {
    public static void main(String[] args) throws InvalidBotCountException {
        GameController gameController = new GameController();
        System.out.println("Game is starting");

        Game game1 = gameController.startGame(3 , new ArrayList<>() , new ArrayList<>());
//        Game game2 = gameController.startGame();
        gameController.displayBoard(game1);

        while(gameController.checkState(game1).equals(GameState.IN_PROGRESS)){
            gameController.makeMove(game1);
            gameController.displayBoard(game1);
        }

        if(gameController.checkState(game1).equals(GameState.DRAW)){
            System.out.println("Game ends in a DRAW!");
        } else if (gameController.checkState(game1).equals(GameState.SUCCESS)){
            System.out.println("Winner is : " + gameController.getWinner(game1).getName());
        }
    }
}
