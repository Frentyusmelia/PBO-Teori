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
public class LatCetakNamaWhile {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        int n,i = 0;
        String nama = "Frentyusmelia";
        
        System.out.print("Masukkan Batas : ");
        n = in.nextInt();
        
        while(i<n){
            System.out.println(nama);
            i++;
        }    
    }
}