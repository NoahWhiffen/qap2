//      QAP2 - Java
// Author: Noah Whiffen - SD12
// Dates: February 7th, 2025

// MyPoint class
class MyPoint { // Copied from week 3 practice folder
    private int x;
    private int y;

    // Default Constructor
    public MyPoint() {
        this.x = 0;
        this.y = 0;
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setXY(int x, int y) {
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
    private MyPoint begin = new MyPoint();
    private MyPoint end = new MyPoint();

    public MyLine(int x1, int y1, int x2, int y2) {
        this.begin = new MyPoint(x1, y1);
        this.end = new MyPoint(x2, y2);
    }

    public MyLine(MyPoint begin, MyPoint end) {
        this.begin = new MyPoint();
        this.end = new MyPoint();
    }

    public MyPoint getBegin() {
        return begin;        
    }

    public void setBegin(MyPoint begin) {
        this.begin = begin;
    }

    public MyPoint getEnd() {
        return end;
    }

    public void setEnd(MyPoint end) {
        this.end = end;
    }

    public int getBeginX() {
        return begin.getX();
    }

    public void setBeginX(int x) {
        begin.setX(x);
    }

    public int getBeginY() {
        return begin.getY();
    }

    public void setBeginY(int y) {
        begin.setY(y);
    } 

    public int getEndX() {
        return end.getX();
    }

    public void setEndX(int x) {
        end.setX(x);
    }

    public int[] getBeginXY() {
        return new int[] {begin.getX(), begin.getY()};
    }

    public void setBeginXY(int x, int y) {
        begin.setXY(x, y);
    }

    public int[] getEndXY() {
        return new int[] {end.getX(), end.getY()};
    }

    public void setEndXY(int x, int y) {
        end.setXY(x, y);
    }

    public double getLength(MyPoint begin, MyPoint end) {
        return (begin.distance(end));
    }

    public double getGradient(int x1, int x2, int y1, int y2) {
        int yDiff = y2 - y1;
        int xDiff = x2 - x1;

        return Math.atan2(yDiff, xDiff);
    }

    public String toString() {
        return "My Line [ begin = (" + begin + ")" + "end = (" + end + ") ]"; 
    }
}