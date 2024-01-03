package TicTacToe;

import TicTacToe.Exceptions.InvalidBotCountException;
import TicTacToe.controllers.GameController;
import TicTacToe.models.*;
import TicTacToe.strategies.ColWinningStrategy;
import TicTacToe.strategies.DiagonalWinningStrategy;
import TicTacToe.strategies.RowWinningStrategy;
import TicTacToe.strategies.WinningStrategy;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) throws InvalidBotCountException {
        GameController gameController = new GameController();
        System.out.println("Game is starting");

        try {
            int dimensionsForGame = 3;
            List<Player> players = new ArrayList<>();

            players.add(new Player(1 , "Mohit", PlayerType.HUMAN , new Symbol('X')));
            players.add(new Bot(2, "GPT" , new Symbol('O'), BotDifficultyLevel.EASY));

            List<WinningStrategy> winningStrategies = List.of(
                    new ColWinningStrategy(),
                    new RowWinningStrategy(),
                    new DiagonalWinningStrategy()
            );

            Game game = gameController.startGame(
                    dimensionsForGame,
                    players,
                    winningStrategies
            );
            gameController.displayBoard(game);
            while(gameController.checkState(game).equals(GameState.IN_PROGRESS)){
                gameController.makeMove(game);
                gameController.displayBoard(game);
            }

        } catch (Exception e){
            throw e;
//            System.out.println("Game has stopped working!");
        }


//        if(gameController.checkState(game1).equals(GameState.DRAW)){
//            System.out.println("Game ends in a DRAW!");
//        } else if (gameController.checkState(game1).equals(GameState.SUCCESS)){
//            System.out.println("Winner is : " + gameController.getWinner(game1).getName());
//        }
    }
}
