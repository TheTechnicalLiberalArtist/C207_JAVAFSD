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
public class App {
    public static void main(String[] args){
        
        //Area, Perimeter and color of Square
        Shape sq = new Square(5.0, "red");

        System.out.println("Details of Square: ");
        System.out.println(sq.getColor());
        System.out.println(sq.displayArea());
        System.out.println(sq.displayPerimeter());
        
        //Area, Perimeter and color of Rectangle
        Shape rec = new Rectangle(4.0,5.0,"pink");
        System.out.println("\nDetails of Rectangle: ");
        System.out.println(rec.getColor());
        System.out.println(rec.displayArea());
        System.out.println(rec.displayPerimeter());
        
        
        //Area, Perimeter and color of Triangle
        Triangle tri = new Triangle(new double[] {5.0,3.0,4.0}, 5.0, 6.0, "Blue");
        System.out.println("\nDetails of triangle: ");
        System.out.println(tri.getColor());
        System.out.println(tri.displayArea());
        System.out.println(tri.displayPerimeter());
        
        
        //Area, circumference and color of Circle
        Circle cir = new Circle(5.0,"Green");
        System.out.println("\nDetails of triangle: ");
        System.out.println(cir.getColor());
        System.out.println(cir.displayArea());
        System.out.println(cir.displayPerimeter());
        
    }
}
