package models;

import Services.StoneService;

import java.util.*;

public class Necklace {
    List<Stone> stoneList = new ArrayList<>();
    public List<Stone> getStoneList() {
        return stoneList;
    }
    public void setStoneList(List<Stone> stoneList) {
        this.stoneList = stoneList;
    }
    @Override
    public String toString() {
        return "\n Ожерелье {" +
                " Список камней = " + stoneList +
                '}';
    }
    public void createNecklace(Necklace necklace, int numberOfStones){
        List<Stone> stones = new ArrayList<>();
        for(int i = 0; i < numberOfStones; i++){
            stones.add(StoneService.createStone());
        }
        necklace.setStoneList(stones);
    }
}
