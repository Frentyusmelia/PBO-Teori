/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frentyusmelia031122;
/**
 *
 * @author ACER
 */
import javax.swing.JOptionPane;

public class NoTerbesarJOp {
    public static void main(String[] args) {
    int data[]=new int[10];
        String input="";
        for (int i=0;i<data.length;i++){
            input = JOptionPane.showInputDialog("Masukan Data ke : " + (i+1) + " : ");
            data[i]=Integer.parseInt(input);
        }
        int besar = data[0];
        for (int i=0;i<data.length;i++){
            if(data[i]>besar){
                besar=data[i];
            }
        }
        JOptionPane.showMessageDialog(null, "Nilai Terbesar Dari Data =" + besar);
    }
}
