package com.java21days;

import java.awt.Point;

public class RefTester {
    public static void main(String[] args) {
        Point pt1, pt2;
        pt1 = new Point(100,100);
        pt2 = pt1;

        pt2.x = 200;
        pt2.y = 200;

        System.out.println("Point1:" + "\nX: " + pt1.x + "\nY: " + pt1.y);
        System.out.println("Point2:" + "\nX: " + pt2.x + "\nY: " + pt2.y);
    }
}
