package Interface.Movable;

public class MovableCircle extends MovablePoint implements Movable{

    private int radius;
    private MovablePoint center;

    public MovableCircle ( int x , int y , int xSpeed , int ySpeed , int radius){
        super(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "MovableCircle{" +
                "radius=" + radius +
                ", center=" + center +
                '}';
    }

    @Override
    public void moveRight() {super.moveRight();
    }

    @Override
    public void moveLeft() {
        super.moveLeft();
    }

    @Override
    public void moveDown() {
        super.moveDown();
    }

    @Override
    public void moveUp() {
        super.moveUp();
    }

}
