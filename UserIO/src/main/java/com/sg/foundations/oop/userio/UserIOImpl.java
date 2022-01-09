/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.oop.userio;

import java.util.Scanner;

/**
 *
 * @author kurtiswong
 */
public class UserIOImpl implements UserIOInterface {
    
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
        int ansInt = sc.nextInt();
        return ansInt;
    }
    
    @Override
    public int readInt(String prompt, int min, int max){
        
        boolean isValid = false;
        int ansIntRange = 0;
        
        while(isValid == false){
            
            System.out.println(prompt);
            ansIntRange = sc.nextInt();
            
            if (ansIntRange < min && ansIntRange > max){
                continue;
            } 
            else {
                isValid = true;
            }
        }
        return ansIntRange;
    }
    
    @Override
    public double readDouble(String prompt){
        System.out.println(prompt);
        double ansDouble = sc.nextDouble();
        return ansDouble;
    }
      
    @Override
    public double readDouble(String prompt, double min, double max){
        
        boolean isValid = false;
        double ansDoubleRange = 0.0;
        
        while(isValid == false){
            
            System.out.println(prompt);
            ansDoubleRange = sc.nextDouble();
            
            if (ansDoubleRange < min && ansDoubleRange > max){
                continue;
            } 
            else {
                isValid = true;
            }
        }
        return ansDoubleRange;

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
