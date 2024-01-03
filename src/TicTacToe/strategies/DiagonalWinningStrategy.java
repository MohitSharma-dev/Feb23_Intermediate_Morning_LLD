package TicTacToe.strategies;

import TicTacToe.models.Board;
import TicTacToe.models.Player;

public class DiagonalWinningStrategy implements WinningStrategy{
    @Override
    public boolean checkWinner(Player player, Board board) {
        return false;
    }
}
