
package com.sg.foundations.forloops.fizzbuzz;

import java.util.Scanner;

/**
 *
 * @author kurtiswong
 */
public class FizzBuzz {
    public static void main (String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("How many times?");
        
        int noOfTimes = Integer.parseInt(sc.nextLine());
        int buzzFizzCount = noOfTimes;
        int n = 100;
        
        
        for(int i=1;i<n;i++){
            
            if (buzzFizzCount==0){
                System.out.println("Tradition!");
                break;
            }
            
            else if (i%3!=0 && i%5!=0){
                System.out.println(i);
            }
            
            else if (i%15==0){
              System.out.println("Buzz Fizz");
              buzzFizzCount--;
            }
            
            else if(i%3==0){
                System.out.println("Buzz");
                buzzFizzCount--;
            }
            
            else if (i%5==0){
                System.out.println("Fizz");
                buzzFizzCount--;
            }
        }
    }
}    