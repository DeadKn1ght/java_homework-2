package task0;
public class Vector {
    private Double x;
    private Double y;
    private Double z;

    public Vector(Double x, Double y, Double z) {
        this.x = x;
        this.y = y;
        this.z = z;
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
     * @return длину вектора
     */
    public double lenghtVector() {
        return Math.sqrt(this.x * this.x + this.y * this.y + this.z * this.z);
    }

    /**
     *
     * @param vector2 для произведения
     * @return произведение векторов
     */
    public double scalarMulti(Vector vector2){
        return this.x*vector2.x+this.y*vector2.y+this.z*vector2.z;
    }

    /**
     *
     * @param vector2 второй вектор
     * @return векторное произведение
     */
    public Vector vectorMulti(Vector vector2) {
        return new Vector(this.y*vector2.z - this.z*vector2.y,this.z*vector2.x - this.x*vector2.z,this.x*vector2.y - this.y*vector2.x);
    }

    /**
     *
     * @param vector2 второй вектор
     * @return косинус угла между векторами
     */
    public double cosVector(Vector vector2) {
        return scalarMulti(vector2) / (lenghtVector()* vector2.lenghtVector());
    }

    /**
     * @vector2 второй вектор
     * @return сумма двух векторов
     */
    public Vector vectorSumm(Vector vector2) {
        return new Vector(this.x + vector2.x, this.y + vector2.y, this.z + vector2.z);
    }
    /**
     * @vector2 второй вектор
     * @return разность двух векторов
     */
    public Vector vectorDifference(Vector vector2) {
        return new Vector(this.x - vector2.x, this.y - vector2.y, this.z - vector2.z);
    }
}
