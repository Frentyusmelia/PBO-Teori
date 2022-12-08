/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frentyusmelia271022;

/**
 *
 * @author ACER
 */
public class TesSwitch {
    public static void main( String[] args ) 
    { 
        int grade = 92; 
        
        switch(grade){ 
        case 100: 
                    System.out.println( "Excellent!" ); 
                    break; 
        case 90: 
                    System.out.println("Good job!" ); 
                    break; 
        case 80: 
                    System.out.println("Study harder!" ); 
                    break; 
        default: 
                    System.out.println("Sorry, you failed."); 
        } 
    } 
}
