//      QAP2 - Java
// Author: Noah Whiffen - SD12
// Date: February 8th, 2025

// Come back and add a length and width method to rectangle

package tests;

import classes.MyRectangle;
import classes.MyPoint;

public class TestMyRectangle {
    
    public static void main(String[] args) {

        // Declare points
        MyPoint a = new MyPoint(5,4);
        MyPoint c = new MyPoint(9, 9);

        // Declare rectangle
        MyRectangle rectangle = new MyRectangle(a, c);

        // Test getters
        System.out.println("Getter Methods");
        System.out.println("----------------------------------------");
        System.out.println("Get point a: " + rectangle.getA());
        System.out.println("Get point b: " + rectangle.getB());
        System.out.println("Get point c: " + rectangle.getC());
        System.out.println("Get point d: " + rectangle.getD());
        System.out.println("Get perimeter: " + rectangle.getPerimeter());
        // System.out.println("Get area: " + rectangle.getArea(length, width));
        System.out.println("----------------------------------------");

        // Test setters
        System.out.println("Setter Methods");
        System.out.println("----------------------------------------");
        
        rectangle.setA(new MyPoint(10, 11));
        rectangle.setC(new MyPoint(6, 11));

        System.out.println("New point a: " + rectangle.getA());
        System.out.println("New point c: " + rectangle.getC());
        System.out.println("----------------------------------------");

        // Test to string
        System.out.println("To string method");
        System.out.println("----------------------------------------");
        System.out.println(rectangle.toString());
        System.out.println("----------------------------------------");
    }
}
