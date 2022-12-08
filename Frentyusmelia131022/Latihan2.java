package Frentyusmelia131022;


import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ACER
 */
import javax.swing.JOptionPane; 
public class Latihan2 {
    public static void main(String[] args) {
        String word1, word2, word3 = " ";
        word1 = JOptionPane.showInputDialog("Enter Word 1");
        word2 = JOptionPane.showInputDialog("Enter Word 2");
        word2 = JOptionPane.showInputDialog("Enter Word 3");
        String msg = word1+" "+word2+" "+word3; 

        JOptionPane.showMessageDialog(null, msg);
    }
}
