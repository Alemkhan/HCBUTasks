package com.company.advJ.models;

public class SquareShape extends RectangleShape{

    public SquareShape() {
        super();
    }

    public SquareShape(double side) {
        super(side, side);
    }

    public SquareShape(String color, boolean filled, double side) {
        super(color, filled, side, side);
    }

    public double getSide(){
        return this.getWidth();
    }

    public void setSide(double side){
        this.setWidth(side);
        this.setLength(side);
    }


    @Override
    public void setWidth(double width) {
        this.setSide(width);

    }

    @Override
    public void setLength(double length) {
        this.setSide(length);
    }

    @Override
    public String toString() {
        return "A Square with" +
                "side="+getSide()+", which is a subclass of "+ super.toString();
    }

    @Override
    public double getArea() {
        return this.getWidth() * this.getWidth();
    }

    @Override
    public double getPerimeter() {
        return this.getWidth() * 4;
    }

}
