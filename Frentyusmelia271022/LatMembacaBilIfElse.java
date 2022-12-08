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
import java.io.*;
public class LatMembacaBilIfElse {
    public static void main(String[] args){
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int bil;
        
        try {
            System.out.print("Masukkan Angka : ");
            bil = Integer.parseInt(input.readLine());
            if(bil>=1 && bil<=10){
                System.out.println("Valid Number");
            }
            else{
                System.out.println("Invalid Number");
            }
        } catch (IOException e) {
            System.out.println("Error!");
        }   
    }
}

