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
public class StringArrayDoWhile {
    public static void main(String[] args) {
        String days[] = {"Senin","Selasa","Rabu","Kamis","Jumat","Sabtu","Minggu"};
        
        int i = 0;
        do{
            System.out.println(days[i]);
            i++;
        }while(i<7);
    }
}
