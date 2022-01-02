
package com.sg.foundations.methods.barelycontrolledchaos;


import java.util.Random;

/**
 *
 * @author kurtiswong
 */

public class BarelyControlledChaos {

    public static void main(String[] args) {
        
        String color = colorChoice();
        String animal = animalChoice(); // call animal method again here
        String colorAgain = colorChoice(); // call color method again here
        int weight = numberMethod(5,200); // call number method,
            // with a range between 5 - 200
        int distance = numberMethod(10,20); // call number method,
            // with a range between 10 - 20
        int number = numberMethod(10000,20000); // call number method,
            // with a range between 10000 - 20000
        int time = numberMethod(2,6); // call number method,
            // with a range between 2 - 6            
        
        System.out.println("Once, when I was very small...");
        
        System.out.println("I was chased by a " + color + ", "
            + weight + "lb " + " miniature " + animal
            + " for over " + distance + " miles!!");

        System.out.println("I had to hide in a field of over "
            + number + " " + colorAgain + " poppies for nearly "
            + time + " hours until it left me alone!");

        System.out.println("\nIt was QUITE the experience, "
            + "let me tell you!");
    }
    
    //Random Color Method
    public static String colorChoice(){
        
        Random ran = new Random();
        String color0 = "Blue";
        String color1 = "Magenta";
        String color2 = "Yellow";
        String color3 = "Red";
        String color4 = "Green";
        
        int colorNumber = ran.nextInt(5);
        String colour = "";
        
        if (colorNumber == 0){
            colour = color0;
        }
        if (colorNumber == 1){
             colour = color1;
         }    
        
        if (colorNumber == 2){
            colour = color2;
        }
        
        if (colorNumber == 3){
            colour = color3;
        }
        
        if (colorNumber == 4){
            colour = color4;
        }
        
        return colour;
    }
    
    public static String animalChoice(){
        
    Random rd = new Random();
    
    String animal0 = "Chicken";
    String animal1 = "Duck";
    String animal2 = "Fish";
    String animal3 = "Zebra";
    String animal4 = "Horse";
    
    int animalNumber = rd.nextInt(5);
    
    String animal = "";
    
    if (animalNumber == 0){
        animal = animal0;
    }
    
    if (animalNumber == 1){
        animal = animal1;
    }
    
    if (animalNumber == 2){
        animal = animal2;
    }
    
    if (animalNumber == 3){
        animal = animal3;
    }
    
    if (animalNumber == 4){
        animal = animal4;
    }
    
    return animal;
    }
    
    public static int numberMethod(int min, int max){
       
    int randomNumber = (int)(Math.random()* (max-min) + min);
    
    return randomNumber;
    }
}
