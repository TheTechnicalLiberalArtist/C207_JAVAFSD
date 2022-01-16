/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.classroster.ui;

import java.util.Scanner;

/**
 *
 * @author kurtiswong
 */
public class UserIOConsoleImpl implements UserIO {
    
    Scanner sc = new Scanner(System.in);
    
    @Override
    public void print(String message){
        System.out.println(message);
    }
    
    @Override
    public String readString(String prompt){
        System.out.println(prompt);
        String ansString = sc.nextLine();
        return ansString;
    }
    
    @Override
    public int readInt(String prompt){
        System.out.println(prompt);
        String ansString = sc.nextLine();
        return Integer.parseInt(ansString);
    }
    
    @Override
    public int readInt(String prompt, int min, int max){
        
        int userChoice = 0;
        
        while(true){
            
            System.out.println(prompt);
            String inputAns = sc.nextLine();
            userChoice = Integer.parseInt(inputAns);
            
            if(userChoice < min || userChoice > max) {
                System.out.println("Invalid input. Please try again!");
            } else {
                break;
            }          
        }
        return userChoice;
    }
    
    @Override
    public double readDouble(String prompt){
        System.out.println(prompt);
        String userInput = sc.nextLine();
        return Double.parseDouble(userInput);
    }
      
    @Override
    public double readDouble(String prompt, double min, double max){
        
        double userChoice = 0.0;
        
        while(true){
            
            System.out.println(prompt);
            String userInput = sc.nextLine();
            userChoice = Double.parseDouble(userInput);
            
            if (userChoice < min || userChoice > max){
                System.out.println("Invalid input. Please try again!");
            } 
            else {
                break;
            }
        }
        return userChoice;

    }
    
    @Override
    public float readFloat(String prompt){
        System.out.println(prompt);
        float ansFloat = sc.nextFloat();
        return ansFloat;
    }
    
    @Override
    public float readFloat(String prompt, float min, float max){
        
        boolean isValid = false;
        float ansFloatRange = 0.0f;
        
        while(isValid == false){
            
            System.out.println(prompt);
            ansFloatRange = sc.nextFloat();
            
            if (ansFloatRange < min && ansFloatRange > max){
                continue;
            } 
            else {
                isValid = true;
            }
        }
        return ansFloatRange;
    }
   
    @Override
    public long readLong(String prompt){
        System.out.println(prompt);
        long ansLong = sc.nextLong();
        return ansLong;
    }
    
    @Override
    public long readLong(String prompt, long min, long max){
        
        boolean isValid = false;
        long ansLongRange = 0L;
        
        while(isValid == false){
            
            System.out.println(prompt);
            ansLongRange = sc.nextLong();
            
            if (ansLongRange < min && ansLongRange > max){
                continue;
            } 
            else {
                isValid = true;
            }
        }
        return ansLongRange;
    }
}
