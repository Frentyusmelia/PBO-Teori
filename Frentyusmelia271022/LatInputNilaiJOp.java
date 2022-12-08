/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frentyusmelia271022;

import javax.swing.JOptionPane;

/**
 *
 * @author ACER
 */
public class LatInputNilaiJOp {
    public static void main(String[] args){
        int nilai1,nilai2,nilai3;
        double jumlah,rata;
        String nilai,nilai_2,nilai_3;
        
        nilai = JOptionPane.showInputDialog("Masukkan nilai 1 : ");
        nilai1 = Integer.parseInt(nilai);
        nilai_2 = JOptionPane.showInputDialog("Masukkan nilai 2 : ");
        nilai2 = Integer.parseInt(nilai_2);
        nilai_3 = JOptionPane.showInputDialog("Masukkan nilai 3 : ");
        nilai3 = Integer.parseInt(nilai_3);
        
        jumlah = nilai1 + nilai2 + nilai3;
        rata = jumlah/3;
        JOptionPane.showMessageDialog(null,"Jumlah Nilai =  " +jumlah + "\n" + "Rata-Rata = " +rata);
    }
}
