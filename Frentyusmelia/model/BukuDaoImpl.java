/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frentyusmelia.model;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ACER
 */
public class BukuDaoImpl implements BukuDao{
    List<Buku> data = new ArrayList<>();

    public BukuDaoImpl() {
        data.add(new Buku("B001", "Pascal", "Frenty", "Frenty"));
        data.add(new Buku("B002", "Algoritma", "Winni", "Winni"));
        data.add(new Buku("B003", "Java", "Anggun", "Anggun"));
    }
    
    
    public void save(Buku buku){
        data.add(buku);
    }
    public void update(int index, Buku buku){
        data.set(index, buku);
    }
    public void delete (int index){
        data.remove(index);
    }
    public Buku getBuku(int index){
        return data.get(index);
    }
    public List<Buku> getAllBuku(){
        return data;
    }
}
