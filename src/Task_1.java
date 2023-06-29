// Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
import java.util.Scanner;
public class Task_1 {
    int n;
    public Task_1(){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число n");
        n = in.nextInt();
        in.close();

    }
public void sumFact(int n){
        int sum = 0;
        int fact = 1;
        for (int i = 1; i<=n; i++){
            sum +=i;
            fact *=i;
        }
    System.out.println("Сумма чисел от 1 до n равна: " + sum);
    System.out.println("Факториал n чисел равен " + fact);
}
}

