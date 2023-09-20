package Controllers;

import models.Necklace;

import java.util.Scanner;

public class MainMenuController {
    public static void mainMenu(){
        System.out.print("""
                      \n1) Отобрать камни для ожерелья\s
                      2) Список камней в ожерелья\s
                      3) Подсчитать общий вес (в каратах)\s
                      4) Подсчитать общую стоимость\s
                      5) Провести сортировку камней ожерелья на основе ценности\s
                      6) Найти камни в ожерелье по диапазону прозрачности\s
                      7) Выйти из программы
                      Ваш выбор:\s""");
    }
}
