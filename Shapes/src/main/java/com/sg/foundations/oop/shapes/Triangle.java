
package com.sg.foundations.oop.shapes;

/**
*
* @author kurtiswong
*/

public class Triangle extends Shape {
    
    private double[] sides;
    private double height;
    private double base;
    
    
    public Triangle() {
      super("colorless");  
      this.sides = new double[]{0,0,0};
      this.height= 0;
      this.base = 0;
              
    }

    public Triangle(String color) {
        super(color);
        this.sides = new double[] {0,0,0};
        this.height = 0;
        this.base = 0;
        
    }
   

    public Triangle(double[] sides, double height, double base, String color) {
        super(color);
        this.sides = sides;
        this.height = height;
        this.base = base;
    }
    
    

    public double[] getSides() {
        return sides;
    }

    public void setSides(double[] sides) {
        this.sides = sides;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }
    
   
   @Override
   public double displayArea(){
       return (base * height)/2;
   }

   
   @Override
   public double displayPerimeter(){
       double total = 0;
        
       for(int i = 0; i < sides.length; i++){
       total += sides[i];
       }
       
       return total;
   }
}
