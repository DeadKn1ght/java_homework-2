package task0;


public class task0 {
    public static void main(String[] args) {
        Vector vector1 = new Vector(1.0 , 1.0 , 1.0);
        Vector vector2 = new Vector(1.0 , 2.0 , 1.0);
        System.out.println(vector1);
        System.out.println(vector2);
        System.out.println("Lenght of Vector =" +vector1.lenghtVector());
        System.out.println("Scalar Multiplication of vectors =" +vector1.scalarMulti(vector2));
        System.out.println("Vector multiplication of vectors = " + vector1.vectorMulti(vector2));
        System.out.println("Cosinus of angle = " + vector1.cosVector(vector2));
        System.out.println("Summ of vectors = " + vector1.vectorSumm(vector2));
        System.out.println("Difference of vectors = " + vector1.vectorDifference(vector2));
    }
}
