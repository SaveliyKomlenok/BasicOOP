import Controllers.MainMenuController;
import Services.MainService;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sin = new Scanner(System.in);
        int switchValue = 0;

        while (true) {
            MainMenuController.mainMenu();
            switchValue = sin.nextInt();
            switch (switchValue) {
                case 1 -> MainService.generateNecklace();
                case 2 -> MainService.showNecklace();
                case 3 -> MainService.showTotalWeight();
                case 4 -> MainService.showTotalWorth();
                case 5 -> MainService.showSortedStonesByPrice();
                case 6 -> MainService.showFoundStone();
                case 7 -> {
                    return;
                }
                default -> System.out.println("\nНеверный ввод, повторите попытку");
            }
        }
    }
}