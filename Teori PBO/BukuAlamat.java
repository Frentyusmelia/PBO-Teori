/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frentyusmelia151222;

/**
 *
 * @author ACER
 */
public class BukuAlamat {
    public BukuAlamat(){
        
    }
    public BukuAlamat(String nama, String alamat, String telepon, String email) {
        this.nama = nama;
        this.alamat = alamat;
        this.telepon = telepon;
        this.email = email;
    }
    
    private String nama;
    private String alamat;
    private String telepon;
    private String email;

   

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getTelepon() {
        return telepon;
    }

    public String getEmail() {
        return email;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public void print(){
        System.out.println("Nama        : "+nama);
        System.out.println("Alamat      : "+alamat);
        System.out.println("Telepon     : "+telepon);
        System.out.println("E-mail      : "+email);
    }
}
