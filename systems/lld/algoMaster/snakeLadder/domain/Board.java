package lld.algoMaster.snakeLadder.domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Board {

    private int size;
    Map<Integer, List<BoardEntity>> snakeLadders = new HashMap<>();

    public Board(int size, List<BoardEntity> boardEntities) {
        this.size = size;

        for(BoardEntity entity : boardEntities){
            List<BoardEntity> existing = snakeLadders.get(entity.getStart());
            existing.add(entity);
            snakeLadders.put(entity.getStart(), existing);
        }
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Map<Integer, List<BoardEntity>> getSnakeLadders() {
        return snakeLadders;
    }

    public void setSnakeLadders(Map<Integer, List<BoardEntity>> snakeLadders) {
        this.snakeLadders = snakeLadders;
    }
}
