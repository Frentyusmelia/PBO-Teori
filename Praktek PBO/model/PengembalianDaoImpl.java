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
public class PengembalianDaoImpl implements PengembalianDao {
    private List<Pengembalian> data = new ArrayList();

    public PengembalianDaoImpl() {
        data.add(new Pengembalian("1111","B001","2023-01-01","2023-01-03","2023-01-04","1 Hari","3000"));
    }
    
    public void save(Pengembalian pengembalian){
        data.add(pengembalian);
    }
    
    public void insert(Pengembalian pengembalian){
        data.add(pengembalian);
    }
     
    public void update(int index,Pengembalian pengembalian){
        data.set(index,pengembalian);
    }
    
    public void delete(int index){
        data.remove(index);
    }
     
    public Pengembalian getPengembalian(int index){
         return data.get(index);
     }
    
    public List <Pengembalian> getAllPengembalian(){
         return data;
     }

}
