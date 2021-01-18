package com.company.advJ.tests;

import com.company.advJ.models.MyCircle;
import com.company.advJ.models.MyPoint;

public class MyCircleTest {

    public static void main(String[] args) {

        MyCircle centerCircle = new MyCircle();
        MyCircle withXY = new MyCircle(2,4, 4);
        MyPoint circleCenter = new MyPoint(5,5);
        MyCircle circleFromPoint = new MyCircle(circleCenter, 2);

        MyCircle[] array = {centerCircle, withXY, circleFromPoint};

        int matchCounter = 1;

        for (MyCircle circle:
             array) {

            System.out.println("Circle with center: " + circle.getCenter());
            for (int i = matchCounter; i < array.length; i++) {

                System.out.println("Distance to circle with center " + array[i].getCenter() + " is " + circle.distance(array[i]));

            }

            matchCounter+=1;
        }

    }

}
