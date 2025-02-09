//      QAP2 - Java
// Author: Noah Whiffen - SD12
// Date: February 8th, 2025

package tests;

import classes.MyPoint;
import classes.MyLine;
import java.util.Arrays; // To output methods that return arrays as strings

public class TestMyLine {

    public static void main(String[] args) {
          
        // Declare points
        MyPoint begin = new MyPoint(5, 6);
        MyPoint end = new MyPoint(10, 12);
    
        // Declare lines using MyLine
        MyLine line = new MyLine(begin, end);

        // Test getters
        System.out.println("Getter Methods");
        System.out.println("----------------------------------------");
        System.out.println("Get Begin Point: " + line.getBegin());
        System.out.println("Get End Point: " + line.getEnd());
        System.out.println("Begin X: " + line.getBeginX());
        System.out.println("Begin Y: " + line.getBeginY());
        System.out.println("End X: " + line.getEndX());
        System.out.println("End Y: " + line.getEndY());
        System.out.println("Get Begin XY: " + Arrays.toString(line.getBeginXY()));
        System.out.println("Get End XY: " + Arrays.toString(line.getEndXY()));
        System.out.println("Line Length: " + line.getLength());
        System.out.println("Line Gradient: " + line.getGradient());
        System.out.println("----------------------------------------");

        // Test setters
        MyPoint newBegin = new MyPoint(10, 10);
        MyPoint newEnd = new MyPoint(25, 25);

        line.setBegin(newBegin);
        line.setEnd(newEnd);

        System.out.println("Setter Methods");
        System.out.println("----------------------------------------");
        System.out.println("New begin coords: " + Arrays.toString(line.getBeginXY()));
        System.out.println("New end coords: " + Arrays.toString(line.getEndXY()));
        System.out.println("----------------------------------------");

        line.setBeginX(14);
        line.setBeginY(12);

        line.setEndX(19);
        line.setEndY(20);

        line.setBeginXY(1, 5);
        line.setEndXY(25, 19);

        System.out.println("Methods used: setBeginX(14), setBeginY(12), setEndX(19), setEndY(20)");
        System.out.println("Line after points changed " + line);
        System.out.println("----------------------------------------");
        System.out.println("Methods used: setBeginXY(1, 5), setEndXY(25, 19)");
        System.out.println("Line after points changed: " + line);
        System.out.println("----------------------------------------");
        
        // Test to string
        System.out.println("To String Method");
        System.out.println("----------------------------------------");
        System.out.println(line.toString());
    }
}
