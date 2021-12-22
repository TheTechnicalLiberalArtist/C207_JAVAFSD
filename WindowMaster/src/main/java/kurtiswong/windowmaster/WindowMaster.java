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
        
        String stringHeight = "";
        String stringWidth = "";
        String stringGlassPanel = "";
        String stringGlassTrim = "";
        String numberOfWindows = "";
        
       //Exception Testing 
       
        boolean isValid = false;
        
        do {
            try {
                System.out.println("Please enter the height of the Window:");
                stringHeight = sc.nextLine();
                float floatHeight = Float.parseFloat(stringHeight);
                break;
                
            } catch(NumberFormatException ex) {
                System.out.println("Please enter again!");
            }    
        } while(!isValid); 
        
        do{    
            try {
                System.out.println("Please enter the width of the Window:");
                stringWidth = sc.nextLine();
                float floatWidth = Float.parseFloat(stringWidth);
                break;
                
            } catch(NumberFormatException ex) {
                System.out.println("Please enter again!");
            } 
        } while(!isValid);
        
        do{
            try {
                System.out.println("Please enter the cost of the Panel:");
                stringGlassPanel = sc.nextLine();
                float floatGlassPanel = Float.parseFloat(stringGlassPanel);
                break;
                
            } catch(NumberFormatException ex) {
                System.out.println("Please enter again!");
            }
        } while(!isValid);
        
        do{
            try {
                System.out.println("Please enter the cost of the Trim:");
                stringGlassTrim = sc.nextLine();
                float floatGlassTrim = Float.parseFloat(stringGlassTrim);
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
      
        // Parsing on tested inputs
        float floatHeight = Float.parseFloat(stringHeight);
        float floatWidth = Float.parseFloat(stringWidth);
        float floatGlassPanel = Float.parseFloat(stringGlassPanel);
        float floatGlassTrim = Float.parseFloat(stringGlassTrim);
        
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
    
}
