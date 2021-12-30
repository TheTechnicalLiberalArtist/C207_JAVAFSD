package kurtiswong.windowmaster;

import java.util.Scanner;

/**
 * @author kurtiswong
 * email: kurtis.portfolio.se@gmail.com
 * date: 22/12/21
 * purpose: Program to calculate price of a Window
 */
public class WindowMaster {
    public static void main (String[] args) {
       
        Scanner sc = new Scanner(System.in);
        
        //Declaring global variables
        
        float floatHeight = 0;
        float floatWidth = 0;
        float floatGlassPanel = 0;
        float floatGlassTrim = 0;
        String numberOfWindows = "";
        
       //Exception Testing 
       
        boolean isValid = false;
        
        do {
            try {
                floatHeight = readValue("Please enter the height of the Window:");
                break;
                
            } catch(NumberFormatException ex) {
                System.out.println("Please enter again!");
            }    
        } while(!isValid); 
        
        do{    
            try {
              
                floatWidth = readValue("Please enter the width of the Window:");
                break;
                
            } catch(NumberFormatException ex) {
                System.out.println("Please enter again!");
            } 
        } while(!isValid);
        
        do{
            try {
                
                floatGlassPanel = readValue("Please enter the cost of the Panel:");
                break;
                
            } catch(NumberFormatException ex) {
                System.out.println("Please enter again!");
            }
        } while(!isValid);
        
        do{
            try {
                
                floatGlassTrim = readValue("Please enter the cost of the Trim:");
                break;
                
            } catch(NumberFormatException ex) {
                System.out.println("Please enter again!");
            }
        } while(!isValid);
  
   
        do{
            try{
                System.out.println("Please enter the number of Windows:");
                numberOfWindows = sc.nextLine();
                int intNumberOfWindows = Integer.parseInt(numberOfWindows);
                break;
                
            } catch(NumberFormatException ex) {
                System.out.println("Please enter again!");
            }    
        } while(!isValid);
      
       
        
        //Cost calulation based on Area,Perimeter, and Number of windows
        int intNumberOfWindows = Integer.parseInt(numberOfWindows);
        float area = floatHeight*floatWidth;
        float perimeter = (2 * floatHeight) + (2 * floatWidth);
        float cost = ((area * floatGlassPanel) + (perimeter * floatGlassTrim))*intNumberOfWindows;
        
        //Display output to user
        System.out.println("Window height = " + floatHeight);
        System.out.println("Window width = " + floatWidth);
        System.out.println("Window area = " + area);
        System.out.println("Window perimeter = " + perimeter);
        System.out.println("Total cost = " + cost);
      
    }
    
    public static float readValue(String prompt){
        Scanner scan = new Scanner(System.in);
        System.out.println(prompt);
        
        String input = scan.nextLine();
        float floatVal = Float.parseFloat(input);
        return floatVal;
    }
}
