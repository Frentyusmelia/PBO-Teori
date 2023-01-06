/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frentyusmelia271022;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
import java.util.Scanner;
public class LatPerpangkatanFor {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int bil,pangkat,hasil = 1,i = 1;

        System.out.print("Masukkan Bilangan : ");
        bil = input.nextInt();
        System.out.print("Masukkan Pangkat : ");
        pangkat = input.nextInt();

        for(i=1;i<=pangkat;i++)
        {
            hasil = hasil * bil;
        }

        System.out.println("Hasil  " +bil+ " pangkat " +pangkat+ " = " +hasil);
    }
}
