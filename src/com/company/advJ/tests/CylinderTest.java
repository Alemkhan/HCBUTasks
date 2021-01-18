package com.company.advJ.tests;

import com.company.advJ.models.Cylinder;

public class CylinderTest {

    public static void main(String[] args) {

        Cylinder cylinder = new Cylinder();
        System.out.println("Cylinder:"
                + " has radius=" + cylinder.getRadius()
                + " has height=" + cylinder.getHeight()
                + " has base area=" + Math.round(cylinder.getArea())
                + " has volume=" + Math.round(cylinder.getVolume()));

        Cylinder cylinder1 = new Cylinder(14.0);
        System.out.println("Cylinder:"
                + " has radius=" + cylinder1.getRadius()
                + " has height=" + cylinder1.getHeight()
                + " has base area=" + Math.round(cylinder1.getArea())
                + " has volume=" + Math.round(cylinder1.getVolume()));

        Cylinder cylinder2 = new Cylinder(33.0, 5.0);
        System.out.println("Cylinder:"
                + " has radius=" + cylinder2.getRadius()
                + " has height=" + cylinder2.getHeight()
                + " has base area=" + Math.round(cylinder2.getArea())
                + " has volume=" + Math.round(cylinder2.getVolume()));
    }

}
