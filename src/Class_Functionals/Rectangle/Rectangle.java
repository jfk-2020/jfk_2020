package Class_Functionals.Rectangle;

public class Rectangle {


    private int width;
    private int lenght;


    public Rectangle(int rectangleSideWidth, int rectangleSideLenght) {
        width = rectangleSideWidth;
        lenght = rectangleSideLenght;
    }

    public int аrеа() {
        return width * lenght;
    }
    public int sidesSum() {
        return (width + lenght) * 2;
    }
}
