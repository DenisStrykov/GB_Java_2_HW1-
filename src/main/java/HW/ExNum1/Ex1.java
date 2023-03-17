package HW.ExNum1;


import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {

        /*
        Дана последовательность N целых чисел.
        Найти сумму простых чисел.
         */

        int size = ReadInt("Задайте размер массива: ");
        int[] collection = FillCollection(size);
        PrintCollection(collection, "Начальный массив: ");

        FindRequiredValues(collection);

    }

    /**
     *Метод печатает вложенное сообщение и считывает переменную типа int
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
     * Метод заполняет массив переменными типа int, считывая их с консоли
     *
     * @param size : Задает размер массива
     * @return : Возвращает заполненный массив типа int[]
     */
    static int[] FillCollection(int size) {

        int[] collection = new int[size];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < collection.length; i++) {
            System.out.print("Введите " + (i + 1) + " элемент массива: ");
            collection[i] = scanner.nextInt();
        }
        return collection;
    }

    /**
     * Метод печатает вложенное сообщение и вложенный массив данных
     *
     * @param collection : Вложенный массив данных
     * @param m : Вложенное сообщение
     */
    static void PrintCollection(int[] collection, String m) {

        System.out.println(m + Arrays.toString(collection));
    }

    /**
     * Метод печатает простые числа и их сумму
     *
     * @param collection : Вложенный массив данных
     */
    static void FindRequiredValues(int[] collection) {

        int sum = 0;
        int count = 1;
        for (int i = 0; i < collection.length; i++) {
            if (isPrime(collection[i])) {
                System.out.println(count + " простое число: " + collection[i]);
                sum += collection[i];
                count++;
            }
        }
        System.out.println("Сумма простых чисел в данном массиве: " + sum);
    }

    /**
     * Метод распознает, является ли число простым
     *
     * @param number : Вложенное число
     * @return : Возвращает истину, если утверждение верно. Ложь, если нет.
     */
    static boolean isPrime(int number) {

        BigInteger bigInteger = BigInteger.valueOf(number);
        return bigInteger.isProbablePrime(100);
    }

}
