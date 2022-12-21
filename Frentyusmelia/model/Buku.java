/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frentyusmelia.model;

/**
 *
 * @author ACER
 */
public class Buku {
    private String kodeBuku;
    private String judul;
    private String pengarang;
    private String penerbit;
    
    public String getKodeBuku(){
        return kodeBuku;
    }
    
    public void  setKodeBuku (String kodeBuku){
        this.kodeBuku = kodeBuku;
    }
    
    public String getJudul(){
        return judul;
    }
    
    public void  setJudul (String judul){
        this.judul = judul;
    }
    
    public String getPengarang(){
        return pengarang ;
    }
    
    public void  setPengarang (String pengarang){
        this.pengarang = pengarang;
    }
    
    public String getPenerbit(){
        return penerbit ;
    }
    
    public void  setPenerbit (String penerbit){
        this.penerbit = penerbit;
    }
}
