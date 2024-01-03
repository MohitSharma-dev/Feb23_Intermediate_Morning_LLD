package TicTacToe.strategies;

import TicTacToe.models.Board;
import TicTacToe.models.Move;
import TicTacToe.models.Player;

public interface WinningStrategy {
    public boolean checkWinner(Move move, Board board);
    public void handleUndo(Board board , Move move);
}
