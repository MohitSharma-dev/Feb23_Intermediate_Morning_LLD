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
import java.util.Scanner;

public class Client {

    public static void main(String[] args) throws InvalidBotCountException {
        Scanner sc = new Scanner(System.in);
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
                System.out.println("Do anyone wants to undo ? (y/n)");
                String undoAnswer = sc.next();
                if(undoAnswer.equals("y")){
                    gameController.undo(game);
                }
                gameController.displayBoard(game);
            }

            System.out.println("The Game is finished!");
            GameState gameState = gameController.checkState(game);

            if(gameState.equals(GameState.DRAW)){
                System.out.println("The Result is DRAW!!!!");
            } else {
                System.out.println("The Winner is " + gameController.getWinner(game).getName());
            }

        } catch (Exception e){
            throw e;
//            System.out.println("Game has stopped working!");
        }

    }
}
