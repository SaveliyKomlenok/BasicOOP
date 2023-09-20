package Services;

import models.Stone;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class NecklaceService {
    public static double calculateTotalWeight(List<Stone> stoneList){
        double totalWeight = 0;
        for (Stone stone: stoneList){
            totalWeight += stone.getWeight();
        }
        return totalWeight;
    }

    public static double calculateTotalWorth(List<Stone> stoneList){
        double totalWorth = 0;
        for (Stone stone: stoneList){
            totalWorth += stone.getWeight() * stone.getWorth();
        }
        return totalWorth;
    }

    public static void sortStonesByWorth(List<Stone> stoneList){
        stoneList.sort(new Comparator<Stone>() {
            @Override
            public int compare(Stone o1, Stone o2) {
                return Double.compare(o1.getWorth(), o2.getWorth());
            }
        });
    }

    public static List<Stone> findStonesByTransparencyRange(List<Stone> stoneList, int leftRange, int RightRange){
        List<Stone> newStoneList = new ArrayList<>();
        for (Stone stone: stoneList){
            if(stone.getTransparency() >= leftRange && stone.getTransparency() <= RightRange){
                newStoneList.add(stone);
            }
        }
        return newStoneList;
    }
}
