package com.code;

public class TestCircle {
    public static void main(String[] args) {
        //constructor with no parameter
        Circle circle = new Circle();
        System.out.println(circle);
        //constructor with tow parameter
        circle = new Circle(2.3,"green");
        System.out.println(circle);
    }
}
