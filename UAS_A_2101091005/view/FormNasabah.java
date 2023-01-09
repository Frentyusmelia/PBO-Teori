/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UAS_A_2101091005.view;

import UAS_A_2101091005.controller.NasabahController;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author ACER
 */
public class FormNasabah extends javax.swing.JFrame {

    /**
     * Creates new form FormNasabah
     */
    NasabahController controller;
    public FormNasabah() {
        initComponents();
        controller = new NasabahController(this);
        controller.bersihForm();
        controller.tampilData();
    }

    public JTable getTblNasabah() {
        return tblNasabah;
    }

    public JTextField getTxtKode() {
        return txtKode;
    }

    public JTextField getTxtNama() {
        return txtNama;
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
        txtKode = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();
        btnInsert = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblNasabah = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("Kode");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(40, 40, 100, 30);

        txtKode.setText("jTextField1");
        getContentPane().add(txtKode);
        txtKode.setBounds(180, 40, 290, 30);

        jLabel2.setText("Nama");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 100, 110, 30);

        txtNama.setText("jTextField2");
        getContentPane().add(txtNama);
        txtNama.setBounds(180, 100, 290, 30);

        btnInsert.setText("Insert");
        getContentPane().add(btnInsert);
        btnInsert.setBounds(40, 170, 90, 23);

        btnUpdate.setText("Update");
        getContentPane().add(btnUpdate);
        btnUpdate.setBounds(160, 170, 90, 23);

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btnDelete);
        btnDelete.setBounds(280, 170, 90, 23);

        btnCancel.setText("Cancel");
        getContentPane().add(btnCancel);
        btnCancel.setBounds(400, 170, 90, 23);

        tblNasabah.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Kode", "Nama"
            }
        ));
        tblNasabah.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblNasabahMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblNasabah);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 212, 452, 220);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void tblNasabahMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblNasabahMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblNasabahMouseClicked

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
            java.util.logging.Logger.getLogger(FormNasabah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormNasabah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormNasabah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormNasabah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormNasabah().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblNasabah;
    private javax.swing.JTextField txtKode;
    private javax.swing.JTextField txtNama;
    // End of variables declaration//GEN-END:variables
}