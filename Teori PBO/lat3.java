package Frentyusmelia131022;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader; 
import java.io.InputStreamReader; 
import java.io.IOException; 
public class lat3 {
    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader(new 
        InputStreamReader( System.in) ); 
        int a1 = 0;
        int a2 = 0;
        int a3 = 0;
        int t;
        
 
        System.out.print("Angka 1 : "); 
        try{ 
            a1 = Integer.parseInt(dataIn.readLine()); 
        }catch( IOException e ){ 
            System.out.println("Error!"); 
        }
        
        System.out.print("Angka 2 : "); 
        try{ 
            a2 = Integer.parseInt(dataIn.readLine());
        }catch( IOException e ){ 
            System.out.println("Error!"); 
        }
        
        System.out.print("Angka 3 : "); 
        try{ 
            a3 = Integer.parseInt(dataIn.readLine()); 
        }catch( IOException e ){ 
            System.out.println("Error!"); 
        }
        
        t = (a1>a2)?a1:(a2>a3)?a2:(a3>a1)?a3:a2;
        
        System.out.println("\nAngka Tertinggi = "+t);
        
    }
}
