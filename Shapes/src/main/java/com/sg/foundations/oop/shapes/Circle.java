/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sg.foundations.oop.shapes;

/**
 *
 * @author kurtiswong
 */

public class Circle extends Shape{
    
    private double radius;
    private final double PI = 3.142;

    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }
    
    

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    @Override
    public double displayArea(){
        return Math.round(PI*(radius*radius));
    }
    
    @Override
    public double displayPerimeter(){
        return Math.round(2*(PI*radius));
    }
    
}
