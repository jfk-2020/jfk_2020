package new_uml_constructor;

import Constructors.Rechtangle;

public class Rectangle_uml {
    private float length = 1.0f;
    private float width = 1.0f;

    public Rectangle_uml(){
    };
    public Rectangle_uml(float length , float width){
        this.length = length;
        this.width = width;
    }
    public float getLength(){
        return length;
    }
    public void setLength(float length){
        this.length = length;
    }
    public float getWidth(){
        return width;
    }
    public void setWidth(float width){
        this.width = width;
    }
    public double getArea(){
        return width*length;
    }
    public double getPerimeter(){
        return 2*width+2*length;
    }
    public String toString (){
        return "Rectangle[length=" +length+" ,width=" + width+ "]";
    }


}
