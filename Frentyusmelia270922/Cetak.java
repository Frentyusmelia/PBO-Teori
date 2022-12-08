/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frentyusmelia270922;

/**
 *
 * @author ACER
 */
public class Cetak {
    //overloading
    public static void main (String[] args) {
        System.out.println(maxNumber(5.5, 7.5));
        System.out.println(maxNumber(10, 20));
    }   
        //Tipe data double
        static double maxNumber(double a, double b ){
            if (a < b){
                return a;
                }else{
                return b;
            }
        } 
        //Tipe data Int
        static int maxNumber(int a, int b){
            if (b < a){
                return a;
            }else{
                return b;
            }
        } 
}


