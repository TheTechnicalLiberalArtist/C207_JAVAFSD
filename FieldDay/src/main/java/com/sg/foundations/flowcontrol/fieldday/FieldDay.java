
package com.sg.foundations.flowcontrol.fieldday;

import java.util.Scanner;

/**
* @author kurtiswong
* email: kurtis.portfolio.se@gmail.com
* date: 28/12/21
* purpose: Flow Control (Field Day)
 */
public class FieldDay {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        String name;
        String s1 = "Baggins";
        String s2 = "Dresden";
        String s3 = "Howl";
        String s4 = "Potter";
        String s5 = "Vimes";
               
        
        System.out.println("What is your name?");
        name = sc.nextLine();
        
        int compareBaggins = name.compareTo(s1);
        int compareDresden = name.compareTo(s2);
        int compareHowl = name.compareTo(s3);
        int comparePotter = name.compareTo(s4);
        int compareVimes = name.compareTo(s5);
        
        if (compareBaggins < 0) {
            System.out.println("Aha! you're on team 'Red Dragons!'");
        }
        else if (compareBaggins > 0 && compareDresden < 0){
            System.out.println("Aha! you're on team 'Dark Wizards!'");
        }
        else if (compareDresden > 0 && compareHowl < 0){
            System.out.println("Aha! you're on team 'Moving Castles!'");
        }
        else if (compareHowl > 0 && comparePotter < 0){
            System.out.println("Aha! you're on team 'Golden Snitches!'");
        }
        else if (comparePotter > 0 && compareVimes < 0){
            System.out.println("Aha! you're on team 'Night Guards!'");
        }
        else {
            System.out.println("Aha! you're on team 'Black Holes!'");
        }
    }
}
