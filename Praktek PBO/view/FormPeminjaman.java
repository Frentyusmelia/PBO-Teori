/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frentyusmelia.view;
import Frentyusmelia.controller.PeminjamanController;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JTable;

/**
 *
 * @author ACER
 */
public class FormPeminjaman extends javax.swing.JFrame {

    /**
     * Creates new form FormPeminjaman
     */
    PeminjamanController controller;
    public FormPeminjaman() {
        initComponents();
        controller = new PeminjamanController(this);
        controller.bersihForm();
        controller.setCboNobp();
        controller.setCboBuku();
        controller.tampilData();
    }
    
    public JComboBox<String> getCboNobp() {
        return cboNobp;
    }

    public JComboBox<String> getCboBuku() {
        return cboBuku;
    }
    
    public javax.swing.JTextField getTxtTglpinjam(){
        return txtTglpinjam;
    }
    
    public javax.swing.JTextField getTxtTglkembali(){
        return txtTglkembali;
    }
    
    public javax.swing.JTable getTblPeminjaman(){
        return tblPeminjaman;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtTglpinjam = new javax.swing.JTextField();
        txtTglkembali = new javax.swing.JTextField();
        btnInsert = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPeminjaman = new javax.swing.JTable();
        cboNobp = new javax.swing.JComboBox<>();
        cboBuku = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Peminjaman");
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel1.setText("NoBp");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 30, 90, 30);

        jLabel2.setText("Buku");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 80, 90, 30);

        jLabel3.setText("Tanggal Pinjam");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 140, 90, 30);

        jLabel4.setText("Tanggal Kembali");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 200, 90, 30);

        txtTglpinjam.setText("jTextField3");
        getContentPane().add(txtTglpinjam);
        txtTglpinjam.setBounds(150, 140, 350, 30);

        txtTglkembali.setText("jTextField4");
        getContentPane().add(txtTglkembali);
        txtTglkembali.setBounds(150, 200, 350, 30);

        btnInsert.setText("Insert");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });
        getContentPane().add(btnInsert);
        btnInsert.setBounds(30, 260, 90, 23);

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdate);
        btnUpdate.setBounds(160, 260, 100, 23);

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btnDelete);
        btnDelete.setBounds(310, 260, 90, 23);

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancel);
        btnCancel.setBounds(440, 260, 90, 23);

        tblPeminjaman.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "NoBp", "Kode Buku", "Tanggal Pinjam", "Tanggal Kembali"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblPeminjaman.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPeminjamanMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblPeminjaman);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 290, 500, 190);

        cboNobp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(cboNobp);
        cboNobp.setBounds(150, 30, 350, 30);

        cboBuku.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(cboBuku);
        cboBuku.setBounds(150, 90, 350, 30);

        setSize(new java.awt.Dimension(641, 527));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        controller.tampilData();
        controller.bersihForm();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        controller.bersihForm();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseClicked

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        // TODO add your handling code here:
        controller.save();
        controller.tampilData();
        controller.bersihForm();
    }//GEN-LAST:event_btnInsertActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        controller.tampilData();
        controller.bersihForm();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void tblPeminjamanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPeminjamanMouseClicked
        // TODO add your handling code here:
        controller.getPeminjaman();
    }//GEN-LAST:event_tblPeminjamanMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormPeminjaman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPeminjaman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPeminjaman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPeminjaman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPeminjaman().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cboBuku;
    private javax.swing.JComboBox<String> cboNobp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPeminjaman;
    private javax.swing.JTextField txtTglkembali;
    private javax.swing.JTextField txtTglpinjam;
    // End of variables declaration//GEN-END:variables
}