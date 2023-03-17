package CW.ExNum2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {

        /*
        Дана последовательность из N целых чисел.
        Найти сумму чисел, оканчивающихся на 5, перед которыми идет четное число
        */

        int size = ReadInt("Укажите размер массива: ");
        int minOfCollection = ReadInt("Укажите минимальный порог массива: ");
        int maxOfCollection = ReadInt("Укажите максимальный порог массива: ");

        int[] collection = FillCollection(size, minOfCollection, maxOfCollection);
        PrintCollection(collection, "Начальный массив : ");

        new FindRequiredValues(collection);

    }

    /**
     * Метод печатает вложенное сообщение и считывает значение типа int
     *
     * @param m : Вложенное сообщение
     * @return : Возвращает значение типа int
     */
    static int ReadInt(String m) {

        System.out.print(m);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    /**
     * Метод создает и заполняет массив числами в пределах указанных пользователем
     *
     * @param size : Задает размер массива
     * @param min : Задает минимальный порог массива
     * @param max : Задает максимальный порог массива
     * @return : Возвращает заполненный массив
     */
    static int[] FillCollection(int size, int min, int max) {

        int[] collection = new int[size];
        Random random = new Random();
        return random.ints(min, (max + 1)).limit(collection.length).toArray();
    }

    /**
     * Метод печатает вложенное сообщение, а затем массив
     *
     * @param collection : Вложенный массив данных
     * @param m : Вложенное сообщение
     */
    static void PrintCollection(int[] collection, String m) {

        System.out.println(m + Arrays.toString(collection));
    }


}
