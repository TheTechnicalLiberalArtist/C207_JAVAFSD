
package com.sg.foundations.random.guessmemore;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author kurtiswong
 */
public class GuessMeMore {
    public static void main(String[] args){
        
        Random rnd = new Random();
        Scanner sc = new Scanner(System.in);
        
        int randomNumber = (int)(Math.random()*(100 - -100) -100);
        int input;
        System.out.println(randomNumber);
        
        do {
            System.out.println("Guess the number from -100 to 100:");
            input = Integer.parseInt(sc.nextLine());
            
            if (input == randomNumber){
                System.out.println("You got it right!");
                break;
            }
            
            else if (input != randomNumber){
                System.out.println("Try again!");
                continue;
            } 
      } while(true);
       
        
    }
}
