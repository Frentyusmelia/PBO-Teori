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
public class Pengembalian {
    private String nobp;
    private String kodeBuku;
    private String tglpinjam;
    private String tglkembali;
    private String tgldikembalikan;
    private String terlambat;
    private String denda;
    
    public Pengembalian(){
        
    }

    public Pengembalian(String nobp, String kodeBuku, String tglpinjam, String tglkembali, String tgldikembalikan, String terlambat, String denda) {
        this.nobp = nobp;
        this.kodeBuku = kodeBuku;
        this.tglpinjam = tglpinjam;
        this.tglkembali = tglkembali;
        this.tgldikembalikan = tgldikembalikan;
        this.terlambat = terlambat;
        this.denda = denda;
    }


    public String getNobp() {
        return nobp;
    }

    public void setNobp(String nobp) {
        this.nobp = nobp;
    }

    public String getKodeBuku() {
        return kodeBuku;
    }

    public void setKodeBuku(String kodeBuku) {
        this.kodeBuku = kodeBuku;
    }

    public String getTglpinjam() {
        return tglpinjam;
    }

    public void setTglpinjam(String tglpinjam) {
        this.tglpinjam = tglpinjam;
    }

    public String getTglkembali() {
        return tglkembali;
    }

    public void setTglkembali(String tglkembali) {
        this.tglkembali = tglkembali;
    }

    public String getTgldikembalikan() {
        return tgldikembalikan;
    }

    public void setTgldikembalikan(String tgldikembalikan) {
        this.tgldikembalikan = tgldikembalikan;
    }

    public String getTerlambat() {
        return terlambat;
    }

    public void setTerlambat(String terlambat) {
        this.terlambat = terlambat;
    }

    public String getDenda() {
        return denda;
    }

    public void setDenda(String denda) {
        this.denda = denda;
    }

    
}
