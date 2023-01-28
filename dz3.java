// Реализовать простой калькулятор
// Дополнение семинар 2: К калькулятору из предыдущего дз добавить логирование

import java.util.Scanner;
import java.io.IOException;
import java.util.logging.*;

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

    public static void main(String[] args) throws SecurityException, IOException {
        Logger logger = Logger.getLogger(dz1.class.getName());
        FileHandler fh = new FileHandler("log_dz3.txt");
        logger.addHandler(fh);
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);

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
                logger.info("Выполнение операции: " + num1 + "+" + num2 + "=" + result);
                break;
            case "-":
                result = num1-num2;
                logger.info("Выполнение операции: " + num1 + "+" + num2 + "-" + result);
                break;
            case "*":
                result = num1*num2;
                logger.info("Выполнение операции: " + num1 + "*" + num2 + "=" + result);
                break;
            case "/":
                result = num1/num2;
                logger.info("Выполнение операции: " + num1 + "/" + num2 + "=" + result);
                break;
            default:
                logger.info("Произошла ошибка ввода");
        }
        System.out.printf("Результат: %s %s %s = %s", num1, operations, num2, result);
    }
}