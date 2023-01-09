/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UAS_A_2101091005.model;
import UAS_A_2101091005.model.NasabahDao;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ACER
 */
public class NasabahDaoImpl implements NasabahDao {
    List<Nasabah> data = new ArrayList<>();

    public NasabahDaoImpl() {
        data.add(new Nasabah("1111","Winni"));   
        data.add(new Nasabah("1112","Anggun")); 
        data.add(new Nasabah("1113","Viona")); 
    }
    
    public void save(Nasabah nasabah){
        data.add(nasabah);
    }
    public void update(int index, Nasabah nasabah){
        data.set(index, nasabah);
    }
    public void delete (int index){
        data.remove(index);
    }
    public Nasabah getNasabah(int index){
        return data.get(index);
    }
    public List<Nasabah> getAllNasabah(){
        return data;
    }

}
