package com.code;

public class Cylinder extends Circle {
    private double height_;

    public Cylinder() {
    }

    public Cylinder(double height_) {
        this.height_ = height_;
    }

    public Cylinder(double radius_, String color_, double height_) {
        super(radius_, color_);
        this.height_ = height_;
    }

    public double getHeight_() {
        return height_;
    }

    public void setHeight_(double height_) {
        this.height_ = height_;
    }

//    public double getBottomArea(){
//        return super.getArea();
//    }
//    public double getAroundArea(){
//        return super.getPerimeter()*height_;
//    }

    @Override
    public double getArea() {
        return super.getArea()*2+super.getPerimeter()*height_;
    }
    public double getVolume(){
        return super.getArea()*height_;
    }

    @Override
    public String toString() {
        return "A Cylinder with height = "+getHeight_()+", radius = " +super.getRadius_()+", color = "+super.getColor_()+
                ", Area = "+getArea()+", Volume = "+getVolume();
    }
}
