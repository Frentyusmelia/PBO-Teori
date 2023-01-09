/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UAS_A_2101091005.controller;
import UAS_A_2101091005.model.*;
import UAS_A_2101091005.view.FormPinjaman;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ACER
 */
public class NasabahController {
    private FormNasabah formNasabah;
    private NasabahDao nasabahDao;
    private Nasabah nasabah;
    private final NasabahDaoImpl NasabahDao;
    
    public NasabahController  (FormPinjaman formPinjaman){
        this.formNasabah = formNasabah;
        NasabahDao = new NasabahDaoImpl();
    }
    
    public void bersihForm(){
        formPinjaman.getTxtKode().setText("");
        formPinjaman.getTxtNama().setText("");
    }
    
    public void savePinjaman(){
        pinjaman = new Pinjaman();
        pinjaman.setNobp(formAnggota.getTxtNobp().getText());
        pinjaman.setNama(formAnggota.getTxtNama().getText());
        pinjaman.setAlamat(formAnggota.getTxtAlamat().getText());
        pinjamanDao.save(pinjaman);
        javax.swing.JOptionPane.showMessageDialog(formAnggota, "Entri Ok");
    }
    
    public void getAnggota(){
        int index = formAnggota.getTblAnggota().getSelectedRow();
        anggota = anggotaDao.getAnggota(index);
        if(anggota != null){
            formAnggota.getTxtNobp().setText(anggota.getNobp());
            formAnggota.getTxtNama().setText(anggota.getNama());
            formAnggota.getTxtAlamat().setText(anggota.getAlamat());
        }
    }
    
    public void updateAnggota(){
        int index = formAnggota.getTblAnggota().getSelectedRow();
        anggota.setNobp(formAnggota.getTxtNobp().getText());
        anggota.setNama(formAnggota.getTxtNama().getText());
        anggota.setAlamat(formAnggota.getTxtAlamat().getText());
        anggotaDao.update(index, anggota);
        javax.swing.JOptionPane.showMessageDialog(formAnggota, "Entri Ok");
    }
    
    public void deleteAnggota(){
        int index = formAnggota.getTblAnggota().getSelectedRow();
        anggotaDao.delete(index);
        javax.swing.JOptionPane.showMessageDialog(formAnggota, "Delete Ok");
    }
    public void tampilData(){
        DefaultTableModel tabelModel = 
                (DefaultTableModel) formAnggota.getTblAnggota().getModel();
        tabelModel.setRowCount(0);
        java.util.List<Anggota> list = anggotaDao.getAllAnggota();
        for(Anggota anggota : list){
            Object[] data = {
                anggota.getNobp(),
                anggota.getNama(),
                anggota.getAlamat(),
            };
            tabelModel.addRow(data);
        }
    }
}
