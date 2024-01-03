package TicTacToe.controllers;

import TicTacToe.Exceptions.InvalidBotCountException;
import TicTacToe.models.Game;
import TicTacToe.models.GameState;
import TicTacToe.models.Player;
import TicTacToe.strategies.WinningStrategy;

import java.util.List;

public class GameController {
    public Game startGame(int dimension,
                          List<Player> players,
                          List<WinningStrategy> winningStrategies)
    throws InvalidBotCountException {
        // create the object of the game
        // validate the parameters
        return Game.getBuilder()
                .setDimension(dimension)
                .setPlayers(players)
                .setWinningStrategies(winningStrategies)
                .build();

        // Game.getBuilder().addPlayer().addPlayer().addwinn
    }
    public void displayBoard(Game game){
        game.printBoard();
    }
    public void makeMove(Game game){
        game.makeMove();
    }

    public GameState checkState(Game game){
        return game.getGameState();
    }

    public Player getWinner(Game game){
        return game.getWinner();
    }

    public void undo(Game game){
        game.undo();
    }
}

// Client -> GameController -> Services/Models
// 1. start the Game
// 2. While the game state is IN_PROGRESS
    // 2.1. Display the board
    // 2.2. Make the move

// 3. Based on the game state you will return the result
    // DRAW : Mention the draw result
    // Winner : Get the winner and return


// 4. Undo

// No of players :