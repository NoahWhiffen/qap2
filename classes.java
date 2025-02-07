//      QAP2 - Java
// Author: Noah Whiffen - SD12
// Dates: February 7th, 2025

// MyPoint class
class MyPoint { // Copied from week 3 practice folder
    private double x;
    private double y;

    // Default Constructor
    public MyPoint() {
        this.x = 0;
        this.y = 0;
    }

    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "(" + x + "," + y + ")";
    }

    public double distance(double x, double y) {
        // Distance from this point to the given point at x,y
        double xDiff = this.x - x;
        double yDiff = this.y - y;
        return Math.sqrt((xDiff * xDiff) + (yDiff * yDiff));
    }

    public double distance(MyPoint anotherPoint) { // Use this for distance between points in triangle
        double xDiff = this.x - anotherPoint.x;
        double yDiff = this.y - anotherPoint.y;
        return Math.sqrt((xDiff * xDiff) + (yDiff * yDiff));
    }

    public double distance() {
        double xDiff = this.x - 0;
        double yDiff = this.y - 0;
        return Math.sqrt((xDiff * xDiff) + (yDiff * yDiff));
    }
}

class MyLine {
    
}