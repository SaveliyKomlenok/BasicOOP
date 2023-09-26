package classes;

import services.MainService;
import util.ExceptionHandler;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        ExceptionHandler exceptionHandler = new ExceptionHandler();
        Scanner sin = new Scanner(System.in);
        int switchValue = 0;

        initMenu();
        switchValue = exceptionHandler.checkInteger("\nВаш выбор: ",0,1);
        switch (switchValue) {
            case 1 -> MainService.generateNecklace();
            case 0 -> {
                return;
            }
        }

        while (true) {
            mainMenu();
            switchValue = exceptionHandler.checkInteger("\nВаш выбор: ",0,6);
            switch (switchValue) {
                case 1 -> MainService.generateNecklace();
                case 2 -> MainService.showNecklace();
                case 3 -> MainService.showTotalWeight();
                case 4 -> MainService.showTotalWorth();
                case 5 -> MainService.showSortedStonesByPrice();
                case 6 -> MainService.showFoundStone();
                case 0 -> {
                    return;
                }
            }
        }
    }

    public static void initMenu(){
        System.out.print("""
                      \n1) Отобрать камни для ожерелья\s
                      0) Выйти из программы\s""");
    }

    public static void mainMenu(){
        System.out.print("""
                      \n1) Отобрать камни для ожерелья\s
                      2) Список камней в ожерелья\s
                      3) Подсчитать общий вес (в каратах)\s
                      4) Подсчитать общую стоимость\s
                      5) Провести сортировку камней ожерелья на основе ценности\s
                      6) Найти камни в ожерелье по диапазону прозрачности\s
                      0) Выйти из программы\s""");
    }
}