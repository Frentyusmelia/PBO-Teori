/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frentyusmelia.controller;
import Frentyusmelia.model.*;
import Frentyusmelia.view.FormPengembalian;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ACER
 */
public class PengembalianController {
    private FormPengembalian formPengembalian;
    private AnggotaDao anggotaDao;
    private BukuDao bukuDao;
    private PeminjamanDao peminjamanDao;
    private PengembalianDao pengembalianDao;
    private Pengembalian pengembalian;

    
    public PengembalianController(FormPengembalian formPengembalian){
        this.formPengembalian = formPengembalian;
        anggotaDao = new AnggotaDaoImpl();
        bukuDao = new BukuDaoImpl();
        peminjamanDao = new PeminjamanDaoImpl();
        pengembalianDao = new PengembalianDaoImpl();
    }
    
    public void bersihForm(){
        formPengembalian.getTxtTglpinjam().setText("");
        formPengembalian.getTxtTglkembali().setText("");
        formPengembalian.getTxtTgldikembalikan().setText("");
        formPengembalian.getTxtTerlambat().setText("");
        formPengembalian.getTxtDenda().setText(""); 
    }
    
    public void setCboNobp(){
        formPengembalian.getCboNobp().removeAllItems();
        List <Anggota> list = anggotaDao.getAllAnggota();
        for (Anggota anggota: list) {
            formPengembalian.getCboNobp().
                    addItem(anggota.getNobp()+"-"+anggota.getNama());
        }
    }
    
    public void setCboBuku(){
        formPengembalian.getCboBuku().removeAllItems();
        List <Buku> list = bukuDao.getAllBuku();
        for (Buku buku: list) {
            formPengembalian.getCboBuku().
                    addItem(buku.getkodebuku());
        }
    }
    
    public void save(){
        pengembalian = new Pengembalian();
        pengembalian.setNobp(formPengembalian.getCboNobp()
            .getSelectedItem().toString().split("-")[0]);
        pengembalian.setKodeBuku(formPengembalian.getCboBuku()
            .getSelectedItem().toString());
        pengembalian.setTglpinjam(formPengembalian.getTxtTglpinjam().getText());
        pengembalian.setTglkembali(formPengembalian.getTxtTglkembali().getText());
        pengembalian.setTgldikembalikan(formPengembalian.getTxtTgldikembalikan().getText());
        pengembalian.setTerlambat(formPengembalian.getTxtTerlambat().getText());
        pengembalian.setDenda(formPengembalian.getTxtDenda().getText());
        pengembalianDao.save(pengembalian);
        JOptionPane.showMessageDialog(formPengembalian, "Entri Ok");
        
    }
    
    public void getPengembalian(){
        int index = formPengembalian.getTblPengembalian().getSelectedRow();
        pengembalian = pengembalianDao.getPengembalian(index);
        if(pengembalian != null){
            List<Anggota> listAnggota = anggotaDao.getAllAnggota();
            for (Anggota anggota:listAnggota){
                if(pengembalian.getNobp()==anggota.getNobp()){
                    formPengembalian.getCboNobp().setSelectedItem(anggota.getNobp()+"-"+anggota.getNama());
                    break;
                }
            }
            formPengembalian.getCboBuku().setSelectedItem(pengembalian.getKodeBuku());
            formPengembalian.getTxtTglpinjam().setText(pengembalian.getTglpinjam());
            formPengembalian.getTxtTglkembali().setText(pengembalian.getTglkembali());
            formPengembalian.getTxtTgldikembalikan().setText(pengembalian.getTgldikembalikan());
            formPengembalian.getTxtTerlambat().setText(pengembalian.getTerlambat());
            formPengembalian.getTxtDenda().setText(pengembalian.getDenda());
        }
    }
    
    public void tampilData(){
        DefaultTableModel tabelModel = 
                (DefaultTableModel) formPengembalian.getTblPengembalian().getModel();
        tabelModel.setRowCount(0);
        java.util.List<Pengembalian> list = pengembalianDao.getAllPengembalian();
        for(Pengembalian pengembalian : list){
            Object[] data = {
                pengembalian.getNobp(),
                pengembalian.getKodeBuku(),
                pengembalian.getTglpinjam(),
                pengembalian.getTglkembali(),
                pengembalian.getTgldikembalikan(),
                pengembalian.getTerlambat(),
                pengembalian.getDenda(),

            };
            tabelModel.addRow(data);
        }
    }
    
//      public void delete(){
//        index = view.getTabelPengembalian().getSelectedRow();
//        dao.delete(index);
//        JOptionPane.showMessageDialog(view, "Delete Data Ok");
//    }
//        public void insert(){
//        model = new Pengembalian();
//        model.setKodeAnggota(view.getTxtKodeAnggota().getText());
//        model.setKodeBuku(view.getTxtKodeBuku().getText());
//        model.setTanggalPinjam(view.getTxtTanggalPinjam().getText());
//        model.setTanggalKembali(view.getTxtTanggalKembali().getText());
//        model.setTanggalKembali(view.getTxtTanggalDikembalikan().getText());
//        model.setTerlambat(view.getTxtTerlambat().getText());
//        model.setDenda(view.getTxtDenda().getText());
//        dao.insert(model); 
//        JOptionPane.showMessageDialog(view, "entri Data Ok");
//    }
//        public void Update(){
//        index = view.getTabelPengembalian().getSelectedRow();
//        model = new Pengembalian();
//        model.setKodeAnggota(view.getTxtKodeAnggota().getText());
//        model.setKodeBuku(view.getTxtKodeBuku().getText());
//        model.setTanggalPinjam(view.getTxtTanggalPinjam().getText());
//        dao.update(index,model); 
//        JOptionPane.showMessageDialog(view, "Update Data Ok");
//    }
//         public void cari(){
//        index = Integer.parseInt(view.getTxtKodeAnggota().getText());
////        model = dao.getAnggota(index);
//        if(model != null) {
//        view.getTxtKodeAnggota().setText("");
//        view.getTxtKodeBuku().setText("");
//        view.getTxtTanggalPinjam().setText(""); 
//        view.getTxtTanggalKembali().setText(""); 
//        view.getTxtTanggalDikembalikan().setText(""); 
//        view.getTxtTerlambat().setText("");
//        view.getTxtDenda().setText(""); 
//        }else{
//            JOptionPane.showMessageDialog(view, "Data Tidak Ada");
//        }
//    }
//          public void viewTable(){
//        DefaultTableModel tableModel = (DefaultTableModel)view.getTabelPengembalian().getModel();
//        tableModel.setRowCount(0);
//        for (Pengembalian pengembalian : dao.getAllData()){
//            Object[] d = {pengembalian.getKodeAnggota(),
//                pengembalian.getKodeBuku(),
//                pengembalian.getTanggalPinjam(),
//                pengembalian.getTanggalKembali(),
//                pengembalian.getTanggalDikembalikan(),
//                pengembalian.getTerlambat(),
//                pengembalian.getDenda()};
//                tableModel.addRow(d);
//            }
//        }
//           public void kliktabel() {
//        index = view.getTabelPengembalian().getSelectedRow();
////        model = dao.getDataGuru(index);
//        if (model != null) {
//        view.getTxtKodeAnggota().setText("");
//        view.getTxtKodeBuku().setText("");
//        view.getTxtTanggalPinjam().setText(""); 
//        view.getTxtTanggalKembali().setText(""); 
//        view.getTxtTanggalDikembalikan().setText(""); 
//        view.getTxtTerlambat().setText("");
//        view.getTxtDenda().setText(""); 
//        } else {
//            JOptionPane.showMessageDialog(view, "Data Tidak Ada");
//        }
//        }
}
