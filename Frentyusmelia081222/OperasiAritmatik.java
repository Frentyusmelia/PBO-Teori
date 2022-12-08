/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frentyusmelia081222;

/**
 *
 * @author ACER
 */
public class OperasiAritmatik {
    public static void main(String[] args) {
  
        int penjumlahan = Integer.parseInt(args[0])+Integer.parseInt(args[1]);
        int pengurangan = Integer.parseInt(args[0])-Integer.parseInt(args[1]);
        int pengalian   = Integer.parseInt(args[0])*Integer.parseInt(args[1]);
        int pembagian   = Integer.parseInt(args[0])/Integer.parseInt(args[1]);
        
        System.out.println("penjumlahan :"+penjumlahan);
        System.out.println("pengurangan :"+pengurangan);
        System.out.println("pengalian   :"+pengalian );
        System.out.println("pembagian   :"+pembagian );
         
    }
}
