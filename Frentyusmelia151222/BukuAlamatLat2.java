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
public class BukuAlamatLat2 {
    private String[] nama = new String[100];
    private String[] alamat = new String[100];
    private String[] telpon = new String[100];
    private String[] email = new String[100];
    
    private static int index;
    private static int studentCount;

    public String getNama(int index) {
        return nama[index];
    }

    public void setNama(String name,int index,String address,String telp,String mail) {
     nama [index]= name;
     alamat [index] = address;
     telpon [index] = telp;
     email [index] = mail;
     studentCount++;
    }

    public String getAlamat(int index) {
        return alamat[index];
    }

    public void setAlamat(String[] alamat) {
        this.alamat = alamat;
    }

    public String getTelpon(int index) {
        return telpon[index];
    }

    public void setTelpon(String[] telpon) {
        this.telpon = telpon;
    }

    public String getEmail(int index) {
        return email[index];
    }

    public void setEmail(String[] email) {
        this.email = email;
    }

    public static int getIndex() {
        return index;
    }

    public static void setIndex(int index) {
        BukuAlamatLat2.index = index;
    }

    public static int getStudentCount() {
        return studentCount;
    }

    public static void setStudentCount(int studentCount) {
        BukuAlamatLat2.studentCount = studentCount;
    }
}
