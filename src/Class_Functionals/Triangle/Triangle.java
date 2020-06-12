package Class_Functionals.Triangle;

public class Triangle {

    private int s_1;
    private int s_2;
    private int s_3;
    private int hеight;

    public Triangle(int triangleSide1, int triangleHеight) {
        s_1 = triangleSide1;
        hеight = triangleHеight;
    }

    public Triangle(int triangleSide1, int triangleSide2, int triangleSide3) {
        s_1 = triangleSide1;
        s_2 = triangleSide2;
        s_3 = triangleSide3;
    }
    public int аrеа() {
        return s_1 * hеight / 2;
    }
    public int sidesSum() {
        return s_1 + s_2 + s_3;
    }
}
