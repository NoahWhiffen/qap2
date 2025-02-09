//      QAP2 - Java
// Author: Noah Whiffen - SD12
// Date: February 7th, 2025

package classes;

public class MyLine {
    private MyPoint begin = new MyPoint();
    private MyPoint end = new MyPoint();

    public MyLine(int x1, int y1, int x2, int y2) {
        this.begin = new MyPoint(x1, y1);
        this.end = new MyPoint(x2, y2);
    }

    public MyLine(MyPoint begin, MyPoint end) {
        this.begin = begin;
        this.end = end;
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

    public double getBeginX() {
        return begin.getX();
    }

    public void setBeginX(int x) {
        begin.setX(x);
    }

    public double getBeginY() {
        return begin.getY();
    }

    public void setBeginY(int y) {
        begin.setY(y);
    } 

    public double getEndX() {
        return end.getX();
    }

    public void setEndX(int x) {
        end.setX(x);
    }

    public double getEndY() {
        return end.getY();
    }

    public void setEndY(int y) {
        end.setY(y);
    }

    public double[] getBeginXY() {
        return new double[] {begin.getX(), begin.getY()};
    }

    public void setBeginXY(int x, int y) {
        begin.setXY(x, y);
    }

    public double[] getEndXY() {
        return new double[] {end.getX(), end.getY()};
    }

    public void setEndXY(int x, int y) {
        end.setXY(x, y);
    }

    public double getLength() {
        return begin.distance(end);
    }

    public double getGradient() {
        double yDiff = end.getY() - begin.getY();
        double xDiff = end.getX() - begin.getX();

        return Math.atan2(yDiff, xDiff);
    }

    @Override
    public String toString() {
        return "My Line [ begin = " + begin + " end = "+ end + "]"; 
    }
}