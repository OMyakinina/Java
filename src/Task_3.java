// Реализовать простой калькулятор

import java.util.Scanner;
public class Task_3 {
    public static void main(String[] args) {
        int x;
        int y;
        int z;
        char op;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите два числа: ");
        x = in.nextInt();
        y = in.nextInt();
        System.out.print("\nВведите операцию (+, -, *, /): ");
        op = in.next().charAt(0);
        switch(op) {
            case '+': z = x + y;
                break;
            case '-': z = x - y;
                break;
            case '*': z = x * y;
                break;
            case '/': z = x / y;
                break;
            default:  System.out.printf("Такой операции нет");
                return;
        }
        System.out.print("\nОтвет:\n");
        System.out.printf(x+ " " + op + " " + y + " = " + z);
    }
}
