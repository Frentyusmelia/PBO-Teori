/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frentyusmelia031122;

/**
 *
 * @author ACER
 */
public class ArrayMultidimensi {
    public static void main(String[] args) {
        String [][] dogs = {{"Florence", "735-1234", "Manila"},         
            {"Joyce", "983-3333", "Quezon City"},         
            {"Becca", "456-3322", "Manila"}}; 
        
        System.out.println("Name    : "+dogs [0][0]);
        System.out.println("Tel     : "+dogs [0][1]);
        System.out.println("Address : "+dogs [0][2]);
        
        System.out.println("\nName    : "+dogs [1][0]);
        System.out.println("Tel     : "+dogs [1][1]);
        System.out.println("Address : "+dogs [1][2]);
        
        System.out.println("\nName    : "+dogs [2][0]);
        System.out.println("Tel     : "+dogs [2][1]);
        System.out.println("Address : "+dogs [2][2]);
    }
}
