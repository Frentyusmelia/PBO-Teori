/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UAS_A_2101091005.model;
import UAS_A_2101091005.model.Pinjaman;
import UAS_A_2101091005.model.PinjamanDao;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ACER
 */
public class PinjamanDaoImpl implements PinjamanDao {
    private String Ansuranpokok;
    private String Ansuranperbulan;
    private double Total;
    private double bunga;
    private String Jumlahpinjaman;
    private String Lamapinjaman;
    
    List<Pinjaman> data = new ArrayList<>();

    public PinjamanDaoImpl() {
        data.add(new Pinjaman("1111","Winni","2023-01-01","1.000.000"," 12 "," 20% "));
        data.add(new Pinjaman("1112","Anggun","2023-01-02","1.500.000"," 12 "," 20% "));
        data.add(new Pinjaman("1113","Viona","2023-01-03","2.000.000"," 12 "," 20% "));
    }

    public String getAnsuranpokok() {
        return Ansuranpokok;
    }

    public void setAnsuranpokok(String Ansuranpokok) {
        this.Ansuranpokok = Ansuranpokok;
    }

    public String getAnsuranperbulan() {
        return Ansuranperbulan;
    }

    public void setAnsuranperbulan(String Ansuranperbulan) {
        this.Ansuranperbulan = Ansuranperbulan;
    }

    public double getTotal() {
        return Total;
    }

    public void setTotal(double Total) {
        this.Total = Total;
    }

    public double getBunga() {
        return bunga;
    }

    public void setBunga(double bunga) {
        Ansuranpokok = Jumlahpinjaman + Lamapinjaman ;
        bunga = (0.12 * Jumlahpinjaman);
        Ansuranperbulan = (bunga / 12) + Jumlahpinjaman;
        Total = Jumlahpinjaman - bunga; 
        
        this.bunga = bunga;
    }

    public String getJumlahpinjaman() {
        return Jumlahpinjaman;
    }

    public void setJumlahpinjaman(String Jumlahpinjaman) {
        this.Jumlahpinjaman = Jumlahpinjaman;
    }

    public String getLamapinjaman() {
        return Lamapinjaman;
    }

    public void setLamapinjaman(String Lamapinjaman) {
        this.Lamapinjaman = Lamapinjaman;
    }
    
    
    
    public void save(Pinjaman pinjaman){
        data.add(pinjaman);
    }
    public void update(int index, Pinjaman pinjaman){
        data.set(index, pinjaman);
    }
    public void delete (int index){
        data.remove(index);
    }
    public Pinjaman getPinjaman(int index ){
        return data.get(index);
    }
    
    public List<Pinjaman> getAllPinjaman() {
       return data;
    }
}
