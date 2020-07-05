package com.jfk.homeworkInterfaces.movableInterface;

public class MovableCircle implements Movable {

    private int radius;
    private MovablePoint center;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        super();
        this.radius = radius;

    }

    @Override
    public void moveUp() {

    }

    @Override
    public void moveDown() {

    }

    @Override
    public void moveLeft() {

    }

    @Override
    public void moveRight() {

    }
}
