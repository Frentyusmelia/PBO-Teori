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
public class StringArrayWhile {
    public static void main(String[] args) {
        String days[] = {"Senin","Selasa","Rabu","Kamis","Jum'at","Sabtu","Minggu"};
        int i = 0;
        
        while(i<7)
        {
            System.out.println("Hari "+days[i]);
            i++;
        }    
    }
}
