package services;

import classes.Necklace;
import util.ExceptionHandler;

import java.util.Scanner;

public class MainService {
    static Necklace necklace = new Necklace();
    static ExceptionHandler exceptionHandler = new ExceptionHandler();

    public static void generateNecklace(){
        int numberOfStones = exceptionHandler.checkInteger("\nВведите количество камней для ожерелья: ", 5,100);
        necklace.createNecklace(necklace, numberOfStones);
        System.out.println(necklace);
    }

    public static void showNecklace(){
        System.out.println(necklace);
    }

    public static void showTotalWeight(){
        System.out.println("\nВес ожерелья в каратах " +
                String.format("%8.3f", NecklaceService.calculateTotalWeight(necklace.getStoneList())));
    }

    public static void showTotalWorth(){
        System.out.println("\nОбщая стоимость ожерелья " +
                String.format("%8.2f", NecklaceService.calculateTotalWorth(necklace.getStoneList())));
    }

    public static void showSortedStonesByPrice(){
        NecklaceService.sortStonesByWorth(necklace.getStoneList());
        System.out.print("\nОтсортированный список камней в ожерелье " + necklace);
    }

    public static void showFoundStone(){
        System.out.print("\nВведите диапазон прозрачности");
        int left = exceptionHandler.checkInteger("\nОт: ", 0,100);
        int right = exceptionHandler.checkInteger("До: ", left,100);

        if(NecklaceService.findStonesByTransparencyRange(necklace.getStoneList(), left, right).isEmpty()){
            System.out.println("\nКамни с заданным диапазоном прозрачности отсутствуют");
        }
        else {
            System.out.println(NecklaceService.findStonesByTransparencyRange(necklace.getStoneList(), left, right));
        }
    }
}
