/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frentyusmelia291222;

/**
 *
 * @author ACER
 */
public abstract class Shape {
    private String nama;
    
    Shape(String Nama) {
        nama = Nama; 
    }
    
    public String getName() {
        return nama;
    }
    
    abstract float getArea();
}
