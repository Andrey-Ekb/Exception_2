/*
 * Разработайте программу, которая выбросит Exception, когда пользователь 
 * вводит пустую строку. Пользователю должно показаться сообщение, что пустые 
 * строки вводить нельзя.
 */

import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args){
        checkingString();
    }

    private static void checkingString() {
        String stroka;

        System.out.print("Введите строку: ");
        Scanner scanner = new Scanner(System.in);
        stroka=scanner.nextLine();
        // System.out.println(stroka);
        if(stroka.isEmpty()) {
                throw new IllegalArgumentException(" Пустая строка ");
        } else{
            System.out.println("Есть техт");
        }
    }
}
