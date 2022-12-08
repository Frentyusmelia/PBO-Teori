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
import java.util.Scanner;
public class GenapGanjil {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        int bil;
            
        System.out.println("\n==Program Menentukan Ganjil Genap==\n");

        System.out.print("Masukkan Bilangan = ");
        bil = input.nextInt();

        if (bil%2 == 0) {
                System.out.println("Bilangan " + bil + ", adalah Bilangan Genap!");
        } else {
                System.out.println("Bilangan " + bil + ", adalah Bilangan Ganjil!");
        }
    }   
}
