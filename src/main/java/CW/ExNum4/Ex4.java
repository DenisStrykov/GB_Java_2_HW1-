package CW.ExNum4;

import CW.ExNum4.model.Vector;

public class Ex4 {

    public static void main(String[] args) {

        /*
        Создайте класс, который описывает вектор (в трёхмерном пространстве).
        У него должны быть:
        •	конструктор с параметрами в виде списка координат x, y, z
        •	метод, вычисляющий длину вектора. Корень можно посчитать с помощью Math.sqrt():
        •	метод, вычисляющий скалярное произведение:
        •	метод, вычисляющий векторное произведение с другим вектором:
        •	метод, вычисляющий угол между векторами (или косинус угла):
        косинус угла между векторами равен скалярному произведению векторов, деленному на произведение модулей (длин) векторов:
        •	методы для суммы и разности:
         */


        Vector vector1 = new Vector(1.0, 1.0, 1.0);
        Vector vector2 = new Vector(1.0, 2.0, 1.0);

        System.out.println(vector1);
        System.out.println(vector2);

        System.out.println("Дина первого вектора: " + vector1.lengthVector());
        System.out.println("Дина второго вектора: " + vector2.lengthVector());

        System.out.println("Скалярное произведение векторов: " + vector1.scalarMulti(vector2));

        System.out.println("Векторное произведение: " + vector1.vectorMulti(vector2));

        System.out.println("Косинус угла : " + vector1.cosVector(vector2));

        System.out.println("Сумма : " + vector1.vectorSum(vector2));
        System.out.println("Разность : " + vector1.vectorDiff(vector2));

    }

}
