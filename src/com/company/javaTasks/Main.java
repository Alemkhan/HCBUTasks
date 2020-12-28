package com.company.javaTasks;

public class Main {

    public static void main(String[] args) {

        Circle c1 = new Circle();
        System.out.println("Radius is " + c1.getRadius() + " and area is " + c1.getArea());

        Circle c2 = new Circle(2.0);
        System.out.println("Radius is " + c2.getRadius() + " and area is " + c2.getArea());

        Circle c3 = new Circle(3.0, "blue");
        System.out.println("Radius is " + c3.getRadius() + " and area and color are " + c3.getArea() + " | " + c3.getColor());

        Circle c4 = new Circle();
        c4.setRadius(5.5);
        System.out.println("Radius is " + c4.getRadius());
        c4.setColor("green");
        System.out.println("Color is " + c4.getColor());

        Circle c5 = new Circle(5.5);
        System.out.println(c5.toString() + " | " + c5);

        Circle c6 = new Circle(6.6);
        System.out.println(c6.getCircumference());

        Employee emp = new Employee(1, "Rakhat", "Lukum", 50000);
        System.out.println(emp.getSalary());
        System.out.println(emp.raiseSalary(30));
        System.out.println(emp.getSalary());

        InvoiceItem hello = new InvoiceItem("dsaw", "dswada", 5, 25.4432);
        System.out.printf("%.3f\n", hello.getTotal());

        Account ac1 = new Account("www", "LLL", 2500);
        Account ac2 = new Account("www", "LLL", 3333);

        System.out.println(ac1.getBalance() + " | " + ac2.getBalance());

        ac1.transferTo(ac2, 500);

        System.out.println(ac1.getBalance() + " | " + ac2.getBalance());

        Date date = new Date(12, 10,2000);
        System.out.println(date);

        Ball ball = new Ball(5,2,2,4,6);
        System.out.println(ball);
    }
}
