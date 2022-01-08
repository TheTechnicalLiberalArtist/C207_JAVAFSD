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

public class Rectangle extends Shape{
    
    private double length;
    private double breadth;
    
    
    public Rectangle(){
        super("colorless");
        this.breadth = 0;
        this.length = 0;
    }
    
    public Rectangle(String color){
        super(color);
        this.length = 0;
        this.breadth = 0;
    }
    
    public Rectangle(double length, double breadth, String color) {
        super(color);
        this.length = length;
        this.breadth = breadth;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getBreadth() {
        return breadth;
    }

    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }
    
    @Override
    public double displayArea(){
        return length*breadth;
    }
    
    @Override
    public double displayPerimeter(){
        return 2*(length+breadth);
    }
}
