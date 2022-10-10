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

        String str1, str2;
        str1 = "It's appointment time!";
        str2 = str1;

        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);
        System.out.println("Are these two strings the same object? " + (str1 == str2));
        System.out.println("Are these two strings equal? " + str1.equals(str2));

        String str3;
        str3 = "It's appointment time again!";
        String str4 = new String(str3);
        System.out.println("String 3: " + str3);
        System.out.println("String 4: " + str4);
        System.out.println("Are these two strings the same object? " + (str3 == str4));
        System.out.println("Are these two strings equal? " + str3.equals(str4));
    }
}
