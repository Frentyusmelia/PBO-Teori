/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frentyusmelia.controller;
import Frentyusmelia.model.*;
import Frentyusmelia.view.FormPeminjaman;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ACER
 */
public class PeminjamanController {
    private FormPeminjaman formPeminjaman;
    private AnggotaDao anggotaDao;
    private BukuDao bukuDao;
    private PeminjamanDao peminjamanDao;
    private Peminjaman peminjaman;
    
    public PeminjamanController (FormPeminjaman formPeminjaman){
        this.formPeminjaman = formPeminjaman;
        anggotaDao = new AnggotaDaoImpl();
        bukuDao = new BukuDaoImpl();
        peminjamanDao = new PeminjamanDaoImpl();
    }
    
    public void bersihForm(){
        formPeminjaman.getTxtTglpinjam().setText("");
        formPeminjaman.getTxtTglkembali().setText("");
    }
    
    public void setCboNobp(){
        formPeminjaman.getCboNobp().removeAllItems();
        List <Anggota> list = anggotaDao.getAllAnggota();
        for (Anggota anggota: list) {
            formPeminjaman.getCboNobp().
                    addItem(anggota.getNobp()+"-"+anggota.getNama());
        }
    }
    
    public void setCboBuku(){
        formPeminjaman.getCboBuku().removeAllItems();
        List <Buku> list = bukuDao.getAllBuku();
        for (Buku buku: list) {
            formPeminjaman.getCboBuku().
                    addItem(buku.getkodebuku());
        }
    }
    
    public void save(){
        peminjaman = new Peminjaman();
        peminjaman.setNobp(formPeminjaman.getCboNobp()
            .getSelectedItem().toString().split("-")[0]);
        peminjaman.setKodebuku(formPeminjaman.getCboBuku()
            .getSelectedItem().toString());
        peminjaman.setTglpinjam(formPeminjaman.getTxtTglpinjam().getText());
        peminjaman.setTglkembali(formPeminjaman.getTxtTglkembali().getText());
        peminjamanDao.save(peminjaman);
        JOptionPane.showMessageDialog(formPeminjaman, "Entri Ok");
        
    }
    
    public void getPeminjaman(){
        int index = formPeminjaman.getTblPeminjaman().getSelectedRow();
        peminjaman = peminjamanDao.getPeminjaman(index);
        if(peminjaman != null){
            List<Anggota> listAnggota = anggotaDao.getAllAnggota();
            for (Anggota anggota:listAnggota){
                if(peminjaman.getNobp()==anggota.getNobp()){
                    formPeminjaman.getCboNobp().setSelectedItem(anggota.getNobp()+"-"+anggota.getNama());
                    break;
                }
            }
            formPeminjaman.getCboBuku().setSelectedItem(peminjaman.getKodebuku());
            formPeminjaman.getTxtTglpinjam().setText(peminjaman.getTglpinjam());
            formPeminjaman.getTxtTglkembali().setText(peminjaman.getTglkembali());
        }
    }
    
    public void tampilData(){
        DefaultTableModel tabelModel = 
                (DefaultTableModel) formPeminjaman.getTblPeminjaman().getModel();
        tabelModel.setRowCount(0);
        java.util.List<Peminjaman> list = peminjamanDao.getAllPeminjaman();
        for(Peminjaman peminjaman : list){
            Object[] data = {
                peminjaman.getNobp(),
                peminjaman.getKodebuku(),
                peminjaman.getTglpinjam(),
                peminjaman.getTglkembali(),
            };
            tabelModel.addRow(data);
        }
    }
}
    

