
// Задано уравнение вида x + y = z Требуется восстановить выражение до верного равенства. Предложить хотя бы одно решение или сообщить, что его нет.

import java.util.Scanner;

public class dz4 {
    static String iScannerStr() {
        Scanner iScanner = new Scanner(System.in);
        String line = iScanner.nextLine();
        iScanner.close();
        return line;
    }

    public static void main(String[] args) {       
        System.out.printf("Введите уравнение через пробел по формуле (x + y = z): ");
        String line = iScannerStr(); 
        String arr[] = line.split(" ");
        int num1 = Integer.parseInt(arr[0]);
        int num2 = Integer.parseInt(arr[2]);
        int num3 = Integer.parseInt(arr[4]);
        int result = 0;
        switch (arr[1]) {
            case "+":
                result = num1 + num2;
                if (result == num3) {
                    System.out.printf("Верное решение: %s %s %s %s %s\n", num1, arr[1], num2, arr[3], num3);
                    break;
                }
                if (result < num3) {
                    System.out.printf("Неверное решение: %s %s %s %s %s\n", num1, arr[1], num2, arr[3], num3);
                        while (result < num3) {
                            if (num1 > num2) 
                                num2 += 1;
                            else
                                num1 += 1;
                                result = num1+num2;     
                        }   
                        System.out.printf("Пример верного решения: %s %s %s %s %s\n", num1, arr[1], num2, arr[3], num3);
                        break;
                }
                if (result > num3) {
                    System.out.printf("Неверное решение: %s %s %s %s %s\n", num1, arr[1], num2, arr[3], num3);
                        while (result > num3) {
                            if (num1 > num2) 
                                num2 -= 1;
                            else
                                num1 -= 1;
                                result = num1+num2;     
                        }   
                        System.out.printf("Пример верного решения: %s %s %s %s %s\n", num1, arr[1], num2, arr[3], num3);
                        break;
                }

            default:
                System.out.printf("Неверный оператор (%s)",  arr[1]);
        }
    }
}