package HW.ExNum3;

import java.util.Arrays;
import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {

        /*
        Дан массив целых чисел.
        Заменить отрицательные элементы на сумму индексов двузначных элементов массива.
         */

        int size = ReadInt("Укажите размер массива: ");
        int[] collection = FillCollection(size);
        PrintCollection(collection, "Начальный массив: ");

        int[] collection2 = ReplacingCollection(collection);
        PrintCollection(collection2, "Отработанный массив: ");

    }

    /**
     * Метод печатает вложенное сообщение и считывает переменную типа int
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
     * @param m          : Вложенное сообщение
     */
    static void PrintCollection(int[] collection, String m) {

        System.out.println(m + Arrays.toString(collection));
    }

    /**
     * Метод ищет сумму индексов двухзначных элементов.
     * Заменяет отрицательные элементы на сумму индексов двухзначных элементов
     *
     * @param collection1 : Вложенный массив данных
     * @return : Массив с замененными элементами
     */
    static int[] ReplacingCollection(int[] collection1) {

        int[] collection2 = new int[collection1.length];
        int count = 0;
        for (int i = 0; i < collection1.length; i++) {
            if ((collection1[i] > 9 && collection1[i] < 99) || (collection1[i] < -9 && collection1[i] > -99)) {
                count += i;
            }
        }
        for (int j = 0; j < collection1.length; j++) {
            if (collection1[j] < 0) {
                collection2[j] = count;
            } else {
                collection2[j] = collection1[j];
            }
        }
        return collection2;
    }


}
