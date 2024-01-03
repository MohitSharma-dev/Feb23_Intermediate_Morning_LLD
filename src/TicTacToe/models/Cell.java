package TicTacToe.models;

public class Cell {
    private int row;
    private int col;
    private Player player;
    private CellState cellState;

    Cell(int x, int y){
        this.row = x;
        this.col = y;
        this.player = null;
        this.cellState = CellState.EMPTY;
    }
    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public CellState getCellState() {
        return cellState;
    }

    public void setCellState(CellState cellState) {
        this.cellState = cellState;
    }

    public void display(){
        if (player == null) {
            System.out.print("| - |");
        } else {
            System.out.printf("| " + player.getSymbol().getSymbol() + " |");
        }
    }
}
