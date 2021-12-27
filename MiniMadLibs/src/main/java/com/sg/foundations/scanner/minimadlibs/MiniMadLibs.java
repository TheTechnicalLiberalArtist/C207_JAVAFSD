
package com.sg.foundations.scanner.minimadlibs;

import java.util.Scanner;

/**
* @author kurtiswong
* email: kurtis.portfolio.se@gmail.com
* date: 27/12/21
* purpose: Variable Scanner (Mini Mad Libs)
*/
public class MiniMadLibs {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        
        String noun1;
        String adjective1;
        String noun2;
        String number1;
        String adjective2;
        String pluralNoun;
        String pluralNoun2;
        String pluralNoun3;
        String infiVerb;
        String ppVerb;
        
        System.out.println("I need a noun:");
        noun1 = sc.nextLine();
        
        System.out.println("Now an adjective:");
        adjective1 = sc.nextLine();
        
        System.out.println("Another noun:");
        noun2 = sc.nextLine();
        
        System.out.println("And a number:");
        number1 = sc.nextLine();
        
        System.out.println("Another adjective");
        adjective2 = sc.nextLine();
        
        System.out.println("A plural noun:");
        pluralNoun = sc.nextLine();
        
        System.out.println("Another one:");
        pluralNoun2 = sc.nextLine();
        
        System.out.println("One more:");
        pluralNoun3 = sc.nextLine();
        
        System.out.println("A verb (infinitive form):");
        infiVerb = sc.nextLine();
        
        System.out.println("Same verb past participle");
        ppVerb = sc.nextLine();
        
        System.out.println(noun1 + ": " + "The " + adjective1 + " frontier. " + "These are the voyages of the starship " + noun2 + ". " + "Its " + number1 + "-year mission: " + "to explore strange " + adjective2 + " " + pluralNoun + ", " + "to seek out " + adjective2 + " " + pluralNoun2 + " and " + adjective2 + " " + pluralNoun3 + ", " + "to boldly " + infiVerb + " where no one has " + ppVerb + " before.");
    }
}
