package lld.algoMaster.snakeLadder;

import lld.algoMaster.snakeLadder.domain.Board;
import lld.algoMaster.snakeLadder.domain.Player;
import lld.algoMaster.snakeLadder.enums.GameStatus;

import java.util.Map;

public class Game {
    private Board board;
    private Map<Player, Integer> playerPositions;
    private Player currentPlayer;
    private Player winner;
    private GameStatus gameStatus;

    public Game(){

    }

    public void initializeGame(){

    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public Player getCurrentPlayer() {
        return currentPlayer;
    }

    public void setCurrentPlayer(Player currentPlayer) {
        this.currentPlayer = currentPlayer;
    }

    public GameStatus getGameState() {
        return gameStatus;
    }

    public void setGameState(GameStatus gameState) {
        this.gameStatus = gameState;
    }
}
