/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.random.alittlechaos;

import java.util.Random;

/**
 *
 * @author kurtiswong
 */
public class ALittleChaos {
    public static void main(String[] args){
        Random randomizer = new Random();
        
        int integers = randomizer.nextInt(100);
        System.out.println(integers);
        
        double doubles = randomizer.nextDouble();
        System.out.println(doubles);
        
        boolean booleans = randomizer.nextBoolean();
        System.out.println(booleans);
    }
}
