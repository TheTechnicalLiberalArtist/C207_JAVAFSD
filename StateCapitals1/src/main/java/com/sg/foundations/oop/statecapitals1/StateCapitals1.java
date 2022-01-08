
package com.sg.foundations.oop.statecapitals1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author kurtiswong
 */
public class StateCapitals1 {
    public static void main(String[] args){
        
        Map <String, String> StateCapitals = new HashMap<>();
        StateCapitals.put("Kyushu", "Fukuoka");
        StateCapitals.put("Kansai", "Osaka");
        StateCapitals.put("Kanto", "Tokyo");
        
        System.out.println("STATES:");
        System.out.println("=========");
        
        Set<String> keys = StateCapitals.keySet();
                
        for(String States: keys){
            System.out.println(States);
        }
        
        System.out.println("\nCAPITALS:");
        System.out.println("=========");
        
        for(String Capitals: keys){
            System.out.println(StateCapitals.get(Capitals));
        }
        
        System.out.println("\nCAPITAL/STATE Pairs:");
        System.out.println("=========");
        
        for(String CapitalState: keys){
            System.out.println(CapitalState + "-" + StateCapitals.get(CapitalState));
        }
                
        
    }
}
