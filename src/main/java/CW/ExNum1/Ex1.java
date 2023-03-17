package CW.ExNum1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {

        /*
        Реализуйте pow(x, n), который вычисляет x, возведенный в степень n (т.е. xn).
        Example 1:
        Input: x = 2.00000, n = 10
        Output: 1024.00000
         */

        DecimalFormat decimalFormat = new DecimalFormat("#.####");
        double x = ReadDouble("Введите значение числа x: ");
        int n = ReadInt("Введите значение степени n: ");
        System.out.println("x = " + x);
        System.out.println("n = " + n);

        double result = PowXByN(x, n);
        System.out.println("xⁿ = " + decimalFormat.format(result));


    }

    /**
     * Метод выводит вложенное сообщение и считывает переменную типа double
     *
     * @param m : Вложенное сообщение
     * @return : Возвращает переменную типа double
     */
    static double ReadDouble(String m) {

        System.out.print(m);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }

    /**
     * Метод выводит вложенное сообщение и считывает переменную типа int
     *
     * @param m : Вложенное сообщение
     * @return : Возвращает переменную типа int
     */
    static int ReadInt(String m) {

        System.out.print(m);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    /**
     * Метод возводит переменную x в степень n
     *
     * @param x : Вложенная переменная типа double
     * @param n : Вложенная переменная типа int
     * @return : Возвращает переменную типа double
     */
    static double PowXByN(double x, int n) {

        double res = 1;
        int funcLength = Math.abs(n);
        for (int i = 0; i < funcLength; i++) {
            res *= x;
        }
        if (n >= 0) {
            return res;
        } else {
            return 1 / res;
        }
    }

}


