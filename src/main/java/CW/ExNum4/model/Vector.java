package CW.ExNum4.model;

public class Vector {

    private Double x;
    private Double y;
    private Double z;

    public Vector(Double x, Double y, Double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vector() {
    }

    public Double getX() {
        return x;
    }

    public void setX(Double x) {
        this.x = x;
    }

    public Double getY() {
        return y;
    }

    public void setY(Double y) {
        this.y = y;
    }

    public Double getZ() {
        return z;
    }

    public void setZ(Double z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return "Vector{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }

    /**
     * Метод вычисляет длину вектора
     *
     * @return : Возвращает длину вектора типа double
     */
    public double lengthVector() {

        return Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2) + Math.pow(this.z, 2));
    }

    /**
     * Метод вычисляет скалярное произведение векторов
     *
     * @param vector2 : Вложенный объект класса Vector
     * @return : Скалярное произведение типа double
     */
    public double scalarMulti(Vector vector2) {

        return ((this.x * vector2.x) + (this.y * vector2.y) + (this.z * vector2.z));
    }

    /**
     * метод вычисляет векторное произведение с другим вектором
     *
     * @param vector2 : Вложенный объект класса Vector
     * @return : Векторное произведение типа объекта класса Vector
     */
    public Vector vectorMulti(Vector vector2) {

        return new Vector(
                ((this.y * vector2.z) - (this.z * vector2.y)),
                ((this.z * vector2.x) - (this.x * vector2.z)),
                ((this.x * vector2.y) - (this.y * vector2.x))
        );
    }

    /**
     * Метод вычисляет угол между векторами (косинус угла)
     *
     * @param vector2 : Вложенный объект класса Vector
     * @return : Косинус угла типа double
     */
    public double cosVector(Vector vector2) {

        return scalarMulti(vector2) / (lengthVector() * vector2.lengthVector());
    }

    /**
     * Метод находит сумму двух векторов
     *
     * @param vector2 : Вложенный объект класса Vector
     * @return : Произведение векторов типа объекта класса Vector
     */
    public Vector vectorSum(Vector vector2) {

        return new Vector(
                this.x + vector2.x,
                this.y + vector2.y,
                this.z + vector2.z
        );
    }

    /**
     * Метод находит разницу двух векторов
     *
     * @param vector2 : Вложенный объект класса Vector
     * @return : Разница векторов типа объекта класса Vector
     */
    public Vector vectorDiff(Vector vector2) {

        return new Vector(
                this.x - vector2.x,
                this.y - vector2.y,
                this.z - vector2.z
        );
    }
}
