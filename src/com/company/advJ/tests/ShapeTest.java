package com.company.advJ.tests;

import com.company.advJ.models.CircleShape;
import com.company.advJ.models.RectangleShape;
import com.company.advJ.models.Shape;
import com.company.advJ.models.SquareShape;

public class ShapeTest {

    public static void main(String[] args) {

        CircleShape с1 = new CircleShape("red", false, 5.5);
        System.out.println(с1);
        System.out.println(с1.getArea());
        System.out.println(с1.getPerimeter());
        System.out.println(с1.getColor());
        System.out.println(с1.isFilled());

        RectangleShape r1 = new RectangleShape("red", false, 1.0, 2.0);
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getColor());
        System.out.println(r1.getLength());

        RectangleShape r2 = new SquareShape(6.6);
        System.out.println(r2);
        System.out.println(r2.getArea());
        System.out.println(r2.getColor());
        System.out.println(r2.getLength());

        SquareShape sq1 = new SquareShape(5);
        System.out.println(sq1);
        System.out.println(sq1.getArea());
        System.out.println(sq1.getColor());
        System.out.println(sq1.getSide());
        System.out.println(sq1.getLength());

    }

}
