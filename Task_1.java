
/*
Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает
введенное значение. Ввод текста вместо числа не должно приводить к падению приложения, вместо этого,
необходимо повторно запросить у пользователя ввод данных.
 */

import java.util.Scanner;

public class Task_1 {

    public static void main(String[] args){
        System.out.println("Пользователь ввел : " + num());
    } 

    public static float num() { 
        float number = 0;
        boolean getOut = false;
        while (!getOut){
            System.out.print("Введите дробное число (типа float): ");
            try (Scanner scanner = new Scanner(System.in)) {
                try{
                    number = Float.parseFloat(scanner.next());
                    getOut=true;
                }catch (IllegalArgumentException e){
                    System.out.println("Введите правильно число");
                    number=0;
                    getOut=false;
                }
            }
        }
        return number;
    }
}
