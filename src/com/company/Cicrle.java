package com.company;

public class Cicrle {
    private double radius;
    private String color;

    public Cicrle(){

    }

    public Cicrle(double r){
        this.radius = r;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return this.radius*this.radius*3.14;
    }
}
