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
public class LatInputNilaiBuff {
    public static void main(String[] args){
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int nilai1 = 0, nilai2 = 0, nilai3 = 0;
        double rata, jumlah;
        
        try {
            System.out.print("Masukkan Nilai Ujian 1 : ");
            nilai1 = Integer.parseInt(input.readLine());
            System.out.print("Masukkan Nilai Ujian 2 : ");
            nilai2 = Integer.parseInt(input.readLine());
            System.out.print("Masukkan Nilai Ujian 3 : ");
            nilai3 = Integer.parseInt(input.readLine());
            
        } catch (IOException e) {
            System.out.println("Error!"); 
        }
        jumlah = (nilai1 + nilai2 + nilai3);
        System.out.println("Jumlah Nilai = " +jumlah);
        rata = jumlah / 3;
        System.out.println("Rata-Rata Nilai = " +rata);
        
        if(rata>=60){
            System.out.println(":)");
        }
        else{
            System.out.println(":(");
        }  
    }
}
