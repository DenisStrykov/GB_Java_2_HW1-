package CW.ExNum3;

import java.util.Arrays;
import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {

        /*
        Дан массив целых чисел.
        Найти количество пар соседних элементов, где первый элемент вдвое больше второго.
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
     * Метод находит в массиве данных парные числа, в которых первое число вдвое больше второго.
     * Печатает найденную пару и печатает сколько пар было найдено.
     *
     * @param collection : Вложенный массив данных
     */
    static void FindRequiredValues(int[] collection) {

        int count = 1;
        for (int i = 0; i < collection.length - 1; i++) {
            if (collection[i + 1] == (collection[i] / 2)) {
                System.out.println(count + " пара элементов: " + "[" + collection[i] + "," + collection[i + 1] + "]");
                count++;
            }
        }
        System.out.println("Количество пар элементов,где первое число вдвое больше следующего: " + (count - 1));
    }

}
