package com.company.advJ.models;

public class MovablePoint extends Point implements Movable{

    private int xSpeed;
    private int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public int getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(int xSpeed) {
        this.xSpeed = xSpeed;
    }

    public int getySpeed() {
        return ySpeed;
    }

    public void setySpeed(int ySpeed) {
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                "xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                "} " + super.toString();
    }

    @Override
    public void moveUp() {

        this.setY(getY()-ySpeed);

    }

    @Override
    public void moveDown() {

        this.setY(getY()+ySpeed);

    }

    @Override
    public void moveLeft() {

        this.setX(getX()+xSpeed);

    }

    @Override
    public void moveRight() {

        this.setX(getX()-xSpeed);

    }
}
