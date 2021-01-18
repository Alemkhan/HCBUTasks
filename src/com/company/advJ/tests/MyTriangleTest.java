package com.company.advJ.tests;

import com.company.advJ.models.MyPoint;
import com.company.advJ.models.MyTriangle;

public class MyTriangleTest {

    public static void main(String[] args) {

        MyTriangle mt1 = new MyTriangle(1,1,2,2,3,3);
        MyPoint mp1 = new MyPoint(4,2);
        MyPoint mp2 = new MyPoint(5,3);
        MyPoint mp3 = new MyPoint(4,6);
        MyTriangle mt2 = new MyTriangle(mp1,mp2,mp3);

        MyTriangle[] array = {mt1, mt2};

        for (MyTriangle myTriangle:
             array) {

            System.out.println("Triangles perimeters is " + myTriangle.getPerimeter());
            System.out.println("This triangle is " + myTriangle.getType());

        }

    }

}
