package TicTacToe.models;

import TicTacToe.Exceptions.InvalidBotCountException;
import TicTacToe.strategies.WinningStrategy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Game {
    private Board board;
    private List<Player> players;
    private List<Move> moves;
    private GameState gameState;
    private int nextPlayerMoveIndex;
    private Player winner;
    private List<WinningStrategy> winningStrategies;

    private Game(int dimension, List<Player> players , List<WinningStrategy> winningStrategies){
        this.board = new Board(dimension);
        this.players = players;
        this.winningStrategies = winningStrategies;
        this.gameState = GameState.IN_PROGRESS;
        this.nextPlayerMoveIndex = 0;
        this.winner = null;
        this.moves = new ArrayList<>();
    }

    public static Builder getBuilder(){
        return new Builder();
    }
    public static class Builder {
        private int dimension;
        private List<Player> players;
        private List<WinningStrategy> winningStrategies;

        public Builder setDimension(int dimension) {
            this.dimension = dimension;
            return this;
        }

        public Builder setPlayers(List<Player> players) {
            this.players = players;
            return this;
        }

        public Builder setWinningStrategies(List<WinningStrategy> winningStrategies) {
            this.winningStrategies = winningStrategies;
            return this;
        }

        public Builder addPlayer(Player player){
            this.players.add(player);
            return this;
        }
        public Builder addWinningStrategy(WinningStrategy winningStrategy){
            this.winningStrategies.add(winningStrategy);
            return this;
        }

        public void validate() throws InvalidBotCountException{
            // we can break this code into multiple functions to maintain
            // code readability and SRP
            // validate Bot count
            int botCount = 0;
            for(Player player : players){
                if(player.getPlayerType().equals(PlayerType.BOT)){
                    botCount+=1;
                }
            }
            if(botCount > 1){
                throw new InvalidBotCountException();
            }
            // validate players count
            if(players.size() != dimension - 1){
                throw new RuntimeException();
            }
            // validate unique symbol for every player
            // To-do
            Map<Character , Integer> symbolCounts = new HashMap<>();
            for(Player player : players){
                if(!symbolCounts.containsKey(player.getSymbol().getSymbol())) {
                    symbolCounts.put(player.getSymbol().getSymbol(), 1);
                } else {
                    throw new RuntimeException();
                }

            }
        }
        public Game build() throws InvalidBotCountException{
            // validations
            validate();
            return new Game(this.dimension,
                    this.players,
                    this.winningStrategies);
        }
    }
    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public List<Move> getMoves() {
        return moves;
    }

    public void setMoves(List<Move> moves) {
        this.moves = moves;
    }

    public GameState getGameState() {
        return gameState;
    }

    public void setGameState(GameState gameState) {
        this.gameState = gameState;
    }

    public int getNextPlayerMoveIndex() {
        return nextPlayerMoveIndex;
    }

    public void setNextPlayerMoveIndex(int nextPlayerMoveIndex) {
        this.nextPlayerMoveIndex = nextPlayerMoveIndex;
    }

    public Player getWinner() {
        return winner;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }

    public List<WinningStrategy> getWinningStrategies() {
        return winningStrategies;
    }

    public void setWinningStrategies(List<WinningStrategy> winningStrategies) {
        this.winningStrategies = winningStrategies;
    }

    public void printBoard(){
        board.printBoard();
    }

    public boolean validateMove(Move move){
        int row = move.getCell().getRow();
        int col = move.getCell().getCol();

        if(row >= board.getSize()){
            return false;
        }
        if(col >= board.getSize()){
            return false;
        }

        return board.getBoard().get(row).get(col).getCellState().equals(CellState.EMPTY);
    }
    public void makeMove(){
        Player currentMovePlayer = players.get(nextPlayerMoveIndex);
        System.out.println("It is " + currentMovePlayer.getName() + "'s turn. Please make your move");
        Move move = currentMovePlayer.makeMove(board);

        if(!validateMove(move)){
            System.out.println("Invalid Move! Please try again");
            return;
        }

        int row = move.getCell().getRow();
        int col = move.getCell().getCol();

        Cell cellToBeUpdated = board.getBoard().get(row).get(col);
        cellToBeUpdated.setCellState(CellState.FILLED);
        cellToBeUpdated.setPlayer(currentMovePlayer);

        Move finalMoveObject = new Move(cellToBeUpdated , currentMovePlayer);
        moves.add(finalMoveObject);

        nextPlayerMoveIndex += 1;
        nextPlayerMoveIndex %= players.size();

        if(checkWinner(board, finalMoveObject)){
            gameState = GameState.SUCCESS;
            winner = currentMovePlayer;
        } else if(moves.size() == board.getSize() * board.getSize()){
            gameState = GameState.DRAW;
        }

    }

    public boolean checkWinner(Board board , Move move){
        for(WinningStrategy winningStrategy : winningStrategies){
            if(winningStrategy.checkWinner(move.getPlayer() , board)) {
                return true;
            }
        }
        return false;
    }
}

// Code Models from our class diagram
// code controllers
// set up the main in the client
    // gameController stateless and Game stateful
// startGame
    // builder design pattern
    // multi-valued attributes : addPlayer()
    // validate() method

// To-do :
    // complete validate()
    // try to attempt different methods in gameController


