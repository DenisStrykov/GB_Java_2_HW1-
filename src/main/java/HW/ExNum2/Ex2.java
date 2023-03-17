package HW.ExNum2;

import java.util.Arrays;
import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {

        /*
         Дана последовательность из N целых чисел.
         Верно ли, что последовательность является возрастающей.
         */


        int size = ReadInt("Укажите размер массива: ");
        int[] collection = FillCollection(size);
        PrintCollection(collection, "Начальный массив: ");
        if (IsCollectionGrowing(collection)) {
            System.out.println("Последовательность является возрастающей");
        } else {
            System.out.println("Последовательность не является возрастающей");
        }

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
     * Метод проверяет, является ли последовательность возрастающей
     *
     * @param collection : Вложенный массив данных
     * @return : True - если возрастающий / False - если нет
     */
    static boolean IsCollectionGrowing(int[] collection) {

        for (int i = 0; i < collection.length - 1; i++) {
            if (collection[i] > collection[i + 1]) {
                return false;
            }
        }
        return true;
    }

}
