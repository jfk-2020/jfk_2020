package Interface.Movable2;

public class MovableRectangle extends MovablePoint implements Movable{
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(int x1 , int y1 , int x2 , int y2 , int xSpeed , int ySpeed){
    }

    @Override
    public String toString() {
        return "MovableRectangle{" +
                "topLeft=" + topLeft +
                ", bottomRight=" + bottomRight +
                '}';
    }
    public void moveUp(){};
    public void moveDown(){};
    public void moveLeft(){};
    public void moveRight(){};
}
