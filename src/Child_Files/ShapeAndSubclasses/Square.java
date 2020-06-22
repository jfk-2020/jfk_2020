package Child_Files.ShapeAndSubclasses;

public class Square extends Rectangle {

    public Square () {};

    public Square (double side) {
        super (side, side);
    }
    public Square (double side, String color, boolean filled) {
        super (side, side, color, filled);
    }
    public double getSide () {
        return getWidth();
    }
    public void setSide (double side) {
        setLength(side);
        setWidth(side);
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
        setWidth(width);
    }

    @Override
    public void setLength(double length) {
        super.setLength(length);
        setLength(length);
    }

    @Override
    public String toString(){
        return  "Square[color = " + getColor() +
                ", filled = " + isFilled() +
                ", side = " + getSide() +
                "]";
    }
}
