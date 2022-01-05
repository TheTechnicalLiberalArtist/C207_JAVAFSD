
package com.sg.foundations.oop.simplecalculator;

import java.util.Scanner;

/**
 *
 * @author kurtiswong
 */
public class App {
    public static void main(String[] args){
        boolean exitProgram = false; 
        String exitDecision;
        
        while (exitProgram == false){
            Scanner sc = new Scanner(System.in);
        
            
            System.out.println("What is the first number?");
            double firstDouble = numberInput();
        
            System.out.println("What is the second number?");
            double secondDouble = numberInput();
        
            String operation;
            double resultFinal = 0;
        
        
            SimpleCalculator cal = new SimpleCalculator();
            
            System.out.println("Which operation (+ , - , /, *) would you like to perform?");
            operation = sc.nextLine();
       
        
            switch(operation){
                case "+": 
                    resultFinal = cal.add(firstDouble, secondDouble);
                    break;
            
                case "-":
                    resultFinal = cal.subtract(firstDouble, secondDouble);
                    break;
            
                case "/":
                    resultFinal = cal.divide(firstDouble, secondDouble);
                    break;
                
                case "*":
                    resultFinal = cal.multiply(firstDouble, secondDouble);
                    break;
            
                default: 
                    System.out.println("Invalid operation!!");
            }
        
            System.out.println(firstDouble + operation + secondDouble + " = " + resultFinal);
            System.out.println("Would you like to exit the program? (Yes/No)");
            exitDecision = sc.nextLine();
            
            if (exitDecision.equals("Yes")){
                exitProgram = true;
                System.out.println("Thank you for using the calculator!");
            }
            else {
                continue;
            }
       
        }
        
    }
    
    public static double numberInput(){
        
        Scanner sc = new Scanner(System.in);
       
        String localInputString;
        double localInput = 0.0;
        
        boolean isValid = false;  
        
        do{
            try{
                localInputString = sc.nextLine();
                localInput = Double.parseDouble(localInputString);
                break;
                
                } catch(NumberFormatException ex) {
                    System.out.println("Please enter a valid number!");
                    
            } 
        } while(!isValid);
        
        return localInput;
    }
   
    
}
