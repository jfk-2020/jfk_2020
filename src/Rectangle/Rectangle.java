package Rectangle;

public class Rectangle {


    private int width;
    private int lenght;


    public Rectangle(int rectangleSideWidth, int rectangleSideLenght) {
        width = rectangleSideWidth;
        lenght = rectangleSideLenght;
    }

    public int ареа() {
        return width * lenght;
    }
}
