/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UAS_A_2101091005.controller;
import UAS_A_2101091005.model.*;
import UAS_A_2101091005.view.FormPinjaman;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ACER
 */
public class PinjamanController {
    private FormPinjaman formPinjaman;
    private NasabahDao nasabahDao;
    private PinjamanDao pinjamanDao;
    private Pinjaman pinjaman;
    
    public PinjamanController (FormPinjaman formPinjaman){
        this.formPinjaman = formPinjaman;
        nasabahDao = new NasabahDaoImpl();
        pinjamanDao = new PinjamanDaoImpl();
    }
    
    public void bersihForm(){
        formPinjaman.getTxtTglpinjam().setText("");
        formPinjaman.getTxtJumlahpinjaman().setText("");
        formPinjaman.getTxtLamapinjaman().setText("");
        formPinjaman.getTxtBunga().setText("");
    }
    
    public void setCboKode(){
        formPinjaman.getCboKode().removeAllItems();
        List <Pinjaman> list = pinjamanDao.getAllPinjaman();
        for (Pinjaman pinjaman: list) {
            formPinjaman.getCboKode().
                    addItem(pinjaman.getKode()+"-"+pinjaman.getNasabah());
        }
    }
    
    public void setCboNasabah(){
        formPinjaman.getCboNasabah().removeAllItems();
        List <Nasabah> list = nasabahDao.getAllNasabah();
        for (Nasabah nasabah: list) {
            formPinjaman.getCboNasabah().
                    addItem(nasabah.getNama());
        }
    }
    
    public void save(){
        pinjaman = new Pinjaman();
        pinjaman.setKode(formPinjaman.getCboKode()
            .getSelectedItem().toString().split("-")[0]);
        pinjaman.setNasabah(formPinjaman.getCboNasabah()
            .getSelectedItem().toString());
        pinjaman.setTglpinjam(formPinjaman.getTxtTglpinjam().getText());
        pinjaman.setJumlahpinjaman(formPinjaman.getTxtJumlahpinjaman().getText());
        pinjaman.setLamapinjaman(formPinjaman.getTxtLamapinjaman().getText());
        pinjaman.setBunga(formPinjaman.getTxtBunga().getText());
        pinjamanDao.save(pinjaman);
        JOptionPane.showMessageDialog(formPinjaman, "Entri Ok");
        
    }
    
    public void getPinjaman(){
        int index = formPinjaman.getTblPinjaman().getSelectedRow();
        pinjaman = pinjamanDao.getPinjaman(index);
        if(pinjaman != null){
            List<Nasabah> listNasabah = nasabahDao.getAllNasabah();
            for (Nasabah nasabah:listNasabah){
                if(pinjaman.getKode()==nasabah.getKode()){
                    formPinjaman.getCboKode().setSelectedItem(nasabah.getKode()+"-"+nasabah.getNama());
                    break;
                }
            }
            formPinjaman.getCboNasabah().setSelectedItem(pinjaman.getNasabah());
            formPinjaman.getTxtTglpinjam().setText(pinjaman.getTglpinjam());
            formPinjaman.getTxtJumlahpinjaman().setText(pinjaman.getJumlahpinjaman());
            formPinjaman.getTxtLamapinjaman().setText(pinjaman.getLamapinjaman());
            formPinjaman.getTxtBunga().setText(pinjaman.getBunga());
        }
    }
    
    public void tampilData(){
        DefaultTableModel tabelModel = 
                (DefaultTableModel) formPinjaman.getTblPinjaman().getModel();
        tabelModel.setRowCount(0);
        java.util.List<Pinjaman> list = pinjamanDao.getAllPinjaman();
        for(Pinjaman pinjaman : list){
            Object[] data = {
                pinjaman.getKode(),
                pinjaman.getNasabah(),
                pinjaman.getTglpinjam(),
                pinjaman.getJumlahpinjaman(),
                pinjaman.getLamapinjaman(),
                pinjaman.getBunga(),
            };
            tabelModel.addRow(data);
        }
    }
}
