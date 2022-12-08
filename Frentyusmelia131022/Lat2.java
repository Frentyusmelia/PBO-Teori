package Frentyusmelia131022;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.swing.JOptionPane; 
public class Lat2 {
    public static void main(String[] args) {
        String word1, word2 = " ";
        word1 = JOptionPane.showInputDialog("Enter Word 1");
        word2 = JOptionPane.showInputDialog("Enter Word 2");
        String msg = word1+" "+word2+" Hello"; 

        JOptionPane.showMessageDialog(null, msg);
    }
}
