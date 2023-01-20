// Реализовать простой калькулятор

import java.util.Scanner;

public class dz3 {

    static int iScannerInt() {
        Scanner iScanner = new Scanner(System.in);
        int num = iScanner.nextInt();
        return num;
    }

    static String iScannerOperations() {
            Scanner op = new Scanner(System.in);
            String operations = op.nextLine();
            return operations;
    }

    public static void main(String[] args) {
        System.out.printf("Введите первое число: ");
        int num1 = iScannerInt();
        System.out.printf("Введите оператор: ");
        String operations = iScannerOperations();
        System.out.printf("Введите второе число: ");
        int num2 = iScannerInt(); 
        int result = 0;
        switch (operations) {
            case "+":
                result = num1+num2;
                break;
            case "-":
                result = num1-num2;
                break;
            case "*":
                result = num1*num2;
                break;
            case "/":
                result = num1/num2;
                break;
            default:
                System.out.println("Неверная операция. Повторите ввод.");
        }
        System.out.printf("Результат: %s %s %s = %s", num1, operations, num2, result);
    }
}