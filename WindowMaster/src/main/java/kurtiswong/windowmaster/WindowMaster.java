/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
        
        String stringHeight = "";
        String stringWidth = "";
        float glassPanel = (float) 3.50;
        float glassTrim = (float) 2.25;
       
        
        
        System.out.println("Please enter the height of the window:");
        stringHeight = sc.nextLine();
        
        System.out.println("Please enter the width of the window:");
        stringWidth = sc.nextLine();
        
        float floatHeight = Float.parseFloat(stringHeight);
        float floatWidth = Float.parseFloat(stringWidth);
        
        float area = floatHeight*floatWidth;
        float perimeter = (2 * floatHeight) + (2 * floatWidth);
        
        float cost = (area * glassPanel) + (perimeter * glassTrim);
        
        System.out.println("Window height = " + floatHeight);
        System.out.println("Window width = " + floatWidth);
        System.out.println("Window area = " + area);
        System.out.println("Window perimeter = " + perimeter);
        System.out.println("Total cost = " + cost);
      
    }
    
}
