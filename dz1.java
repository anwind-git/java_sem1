// Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
import java.util.Scanner;

public class dz1 {

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите число: ");
        int num = iScanner.nextInt();
        iScanner.close();
        int sum = 0; 
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        
        System.out.printf("Треугольное число: %s", sum);
    }
}