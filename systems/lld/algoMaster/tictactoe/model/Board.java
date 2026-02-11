package lld.algoMaster.tictactoe.model;

import java.util.Arrays;

public class Board {
    private int size;
    private int count;
    private Symbol[][] playingBoard;

    public Board(int size) {
        this.size = size;
        this.count = 0;
        this.playingBoard = new Symbol[size][size];
        for (int i=0; i<size; i++){
            Arrays.fill(this.playingBoard[i], Symbol.EMPTY);
        }
    }

    public void placeSymbol(int row, int col, Symbol symbol){
        // validate row and col limit
        // validate the symbol
        playingBoard[row][col] = symbol;
        count++;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Symbol[][] getPlayingBoard() {
        return playingBoard;
    }

}
