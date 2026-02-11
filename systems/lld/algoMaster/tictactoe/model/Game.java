package lld.algoMaster.tictactoe.model;

public class Game {

    private GameStatus gameStatus;
    private Board board;
    private Player[] players;

    public Game(GameStatus gameStatus, int size) {
        this.gameStatus = gameStatus;
        this.board = new Board(size);
        this.players = new Player[2];
    }

    public GameStatus getGameStatus() {
        return gameStatus;
    }

    public void setGameStatus(GameStatus gameStatus) {
        this.gameStatus = gameStatus;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }
}
