/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frentyusmelia271022;

import java.util.Scanner;
public class LatCetakNamaDoWhile {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        int i=0,n;
        String nama="Frentyusmelia";
        
        System.out.print("Masukkan Batas : ");
        n = in.nextInt();
        
        do{
            System.out.println(nama);
            i++;
        } while(i<n);
    }
}

