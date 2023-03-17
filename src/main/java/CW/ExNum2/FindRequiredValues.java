package CW.ExNum2;


public class FindRequiredValues {

    int count = 1;
    int sum = 0;

    /**
     * Метод находит в массиве данных числа, которые заканчиваются на 5,
     * и перед которыми стоит четное число и печатает их.
     * Так же, метод находит сумму из искомых значений и печатает ее.
     *
     * @param collection : Вложенный массив данных
     */
    public FindRequiredValues(int[] collection) {

        for (int i = 1; i < collection.length; i++) {
            if ((collection[i] % 10 == 5 || collection[i] % 10 == -5) && (collection[i - 1] % 2 == 0)) {
                System.out.println(count + " искомое значение: " + collection[i]);
                sum += collection[i];
                count++;
            }
            System.out.println("Сумма искомых значений: " + sum);
        }

    }
}
