package extention.extention.Cylinder.shape;

public class Square extends Rechtangle {
    public Square (){}
    public Square ( double side){
       super();
       super.setWidth(side);
    }
    public Square (double side , String color , boolean filled){
        super();
        super.setWidth(side);
        super.setColor(color);
        super.setFilled(filled);
    }
    public double getSide (){
        return getWidth();
    }
    public void setSide (double side){
       super.setWidth(side);
    }

    @Override
    public void setWidth(double side) {
        super.setWidth(side);
    }


    @Override
    public void setLength(double side) {
        super.setLength(side);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
