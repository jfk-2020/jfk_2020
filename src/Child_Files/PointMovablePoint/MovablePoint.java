package Child_Files.PointMovablePoint;

public class MovablePoint extends Point {

    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MovablePoint (float x, float y, float xSpeed, float ySpeed) {
        super (x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MovablePoint (float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MovablePoint () {};

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float[] getSpeed () {
        return new float[] {xSpeed, ySpeed};
    }
    public String toString () {
        return  "(x = " + getX() +
                ", y = " + getY() +
                "), speed = (xs = " + getXSpeed() +
                ", ys = " + getYSpeed() + ")";
    }
    public MovablePoint move () {
        this.setXY(this.getX() + xSpeed, this.getY() + ySpeed);
        return this;
    }
}
