package com.code;

public class TestCylinder {
    public static void main(String[] args) {
        //constructor with no parameter
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);
        //constructor with one parameter
        cylinder = new Cylinder(4.0);
        System.out.println(cylinder);
        //constructor with three parameter
        cylinder = new Cylinder(2.3,"green",4.0);
        System.out.println(cylinder);
    }
}
