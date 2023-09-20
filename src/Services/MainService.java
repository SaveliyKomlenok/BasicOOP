package Services;

import models.Necklace;

import java.util.Scanner;

public class MainService {
    static Necklace necklace = new Necklace();
    static Scanner sin = new Scanner(System.in);

    public static void generateNecklace(){
        System.out.print("\nВведите количество камней для ожерелья(от 5 до 100): ");
        int numberOfStones = sin.nextInt();
        if(numberOfStones >= 5 && numberOfStones <=100){
            necklace.createNecklace(necklace, numberOfStones);
            System.out.println(necklace);
        }else{
            System.out.println("\nНеверный ввод");
        }
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
        System.out.print("\nВведите диапазон прозрачности(0 - 100) \nОт: ");
        int leftRangeOfTransparency = sin.nextInt();
        System.out.print( "До: " );
        int rightRangeOfTransparency = sin.nextInt();

        if(leftRangeOfTransparency >= 0 && rightRangeOfTransparency >= 0 &&
                rightRangeOfTransparency <= 100 && leftRangeOfTransparency <= rightRangeOfTransparency){
            if(NecklaceService.findStonesByTransparencyRange(necklace.getStoneList(), leftRangeOfTransparency, rightRangeOfTransparency).isEmpty()){
                System.out.println("\nКамни с заданным диапазоном прозрачности отсутствуют");
            }
            else {
                System.out.println(NecklaceService.findStonesByTransparencyRange
                        (necklace.getStoneList(), leftRangeOfTransparency, rightRangeOfTransparency));
            }
        }
        else{
            System.out.println("\nНеверный ввод");
        }
    }
}
