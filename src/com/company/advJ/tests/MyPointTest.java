package com.company.advJ.tests;

import com.company.advJ.models.MyPoint;

public class MyPointTest {

    public static void main(String[] args) {

        MyPoint p1 = new MyPoint();
        System.out.println(p1);
        p1.setX(12);
        p1.setY(7);
        System.out.println("x is: " + p1.getX());
        System.out.println("y is: " + p1.getY());

        p1.setXY(12, 32);
        System.out.println(p1.getXY()[0]);
        System.out.println(p1.getXY()[1]);
        System.out.println(p1);
        MyPoint p2 = new MyPoint(12, 4);
        System.out.println(p2);

        System.out.println(p1.distance(p2));
        System.out.println(p2.distance(p1));
        System.out.println(p1.distance(10, 7));
        System.out.println(p1.distance());

        MyPoint[] points = new MyPoint[10];
        for (int i = 0; i < points.length; i++) {
            points[i] = new MyPoint(i+1, i+1);
            System.out.println(points[i]);
        }

    }

}
