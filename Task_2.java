/*
 * исправьте данный код 
 */

public class Task_2 {
    public static void main(String[] args){
        try {
            int[] intArray = new int[]{1,2,3,4,5,6,7,8};
            int d = 0;
            int catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Catching exception: " + e);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }
        System.out.println("Выход");
    }
}