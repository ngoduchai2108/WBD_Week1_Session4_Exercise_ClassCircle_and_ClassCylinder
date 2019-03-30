package com.code;

public class Circle {
    private double radius_;
    private String color_;

    public Circle() {
    }

    public Circle(double radius_, String color_) {
        this.radius_ = radius_;
        this.color_ = color_;
    }

    public double getRadius_() {
        return radius_;
    }

    public void setRadius_(double radius_) {
        this.radius_ = radius_;
    }

    public String getColor_() {
        return color_;
    }

    public void setColor_(String color_) {
        this.color_ = color_;
    }

    public double getArea(){
        return radius_*radius_*Math.PI;
    }
    public double getPerimeter(){
        return 2*Math.PI*radius_;
    }

    @Override
    public String toString() {
        return "A Circle with radius is "+ getRadius_()+", color = "+getColor_()+
                ", With perimeter is : "+ getPerimeter()+", Area is: "+getArea();
    }
}
