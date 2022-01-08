
package com.sg.foundations.oop.shapes;

/**
 *
 * @author kurtiswong
 */
public class Square extends Shape {
    
    private double side;
    
    public Square(){
        super("colorless");
        this.side = 0;
    }

    public Square(String color) {
        super(color);
        this.side = 0;
    }
   

    public Square(double side, String color) {
        super(color);
        this.side = side;
    }
   

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    
    
    @Override
    public double displayArea(){
        return side * side;
    }
    
    @Override
    public double displayPerimeter(){
        return 4 * side;   
    }
}
    
    
   
