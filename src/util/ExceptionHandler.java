package util;

import exceptions.OutOfRangeException;
import java.util.Scanner;

public class ExceptionHandler {
    public Integer checkInteger(String message, int leftRange, int rightRange){
        System.out.print(message);
        while (true){
            Scanner scanner = new Scanner(System.in);
            try{
                int number = scanner.nextInt();
                if(number < leftRange || number > rightRange)
                    throw new OutOfRangeException("\n" + "Введите число в диапазоне от " + leftRange + " до " + rightRange);
                return number;
            } catch (OutOfRangeException exception){
                System.out.print(exception.getMessage());
            } catch (RuntimeException exception){
                System.out.print("\nНеверный ввод числа");
            }
            System.out.print("\nПовторите попытку: ");
        }
    }
}