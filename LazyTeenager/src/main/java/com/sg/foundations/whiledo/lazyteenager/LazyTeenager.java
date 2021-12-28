
package com.sg.foundations.whiledo.lazyteenager;

import java.util.Random;

/**
 *
 * @author kurtiswong
 */
public class LazyTeenager {
    public static void main(String[] args){
        Random rnd = new Random();
        int chance = rnd.nextInt(101);
        int times = 0;
        
        do{
            System.out.println("Clean your room! (x" + times + ")");
            chance = chance + (times*10);
            
            if (chance > 80 && times <= 7){
                System.out.println("Okay you are safe!");
                break;
            }
            
            if(times > 7) {
                System.out.println("Clean your room!! That's IT, I'm doing it!!! YOU'RE GROUNDED AND I'M TAKING YOUR XBOX!");   
            }
            
            times++;
            
        } while(chance < 80);
        
    }
}
