/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;
import model.sinhvienattt;
import model.sinhvienmatma;

/**
 *
 * @author zung
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tf_masv = new javax.swing.JTextField();
        rb_svattt = new javax.swing.JRadioButton();
        rb_svmm = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        tf_hoten = new javax.swing.JTextField();
        tf_ngaysinh = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tf_diemtb = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tf_hocphi = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tf_donvi = new javax.swing.JTextField();
        tf_luong = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        nam = new javax.swing.JRadioButton();
        nu = new javax.swing.JRadioButton();
        btn_reset = new javax.swing.JButton();
        btn_save = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Sinh vien");

        jLabel2.setText("Ma sv");

        buttonGroup2.add(rb_svattt);
        rb_svattt.setText("SVATTT");
        rb_svattt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_svatttActionPerformed(evt);
            }
        });

        buttonGroup2.add(rb_svmm);
        rb_svmm.setText("SVMM");
        rb_svmm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_svmmActionPerformed(evt);
            }
        });

        jLabel3.setText("Ho ten");

        jLabel4.setText("Ngay sinh");

        jLabel5.setText("Gioi tinh");

        jLabel6.setText("Diem TB");

        jLabel7.setText("Hoc phi");

        jLabel8.setText("Don vi");

        jLabel9.setText("Luong");

        buttonGroup1.add(nam);
        nam.setText("nam");

        buttonGroup1.add(nu);
        nu.setText("nu");

        btn_reset.setText("Reset");
        btn_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resetActionPerformed(evt);
            }
        });

        btn_save.setText("Save");
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(224, 224, 224)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_reset, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(185, 185, 185)
                        .addComponent(btn_save, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGap(83, 83, 83)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(nam)
                                .addGap(136, 136, 136)
                                .addComponent(nu))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rb_svattt)
                                .addGap(97, 97, 97)
                                .addComponent(rb_svmm))
                            .addComponent(tf_diemtb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_hocphi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_donvi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_luong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_hoten)
                            .addComponent(tf_masv, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_ngaysinh))))
                .addContainerGap(365, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {tf_diemtb, tf_donvi, tf_hocphi, tf_hoten, tf_luong, tf_masv, tf_ngaysinh});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(rb_svattt)
                    .addComponent(rb_svmm))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tf_masv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tf_hoten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tf_ngaysinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(nam)
                    .addComponent(nu))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tf_diemtb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tf_hocphi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tf_donvi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(tf_luong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_reset)
                    .addComponent(btn_save))
                .addContainerGap(113, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed
        String masv = tf_masv.getText();
        String hoten = tf_hoten.getText();
        String ngaysinh = tf_ngaysinh.getText();
        String gioitinh = rb_svattt.isSelected() ? "nam" : "nu";
        String diemtb = tf_diemtb.getText();
        float diem = Float.parseFloat(diemtb);
        String hocphi = tf_hocphi.getText();
        String donvi = tf_donvi.getText();
        String luong = tf_luong.getText();
        if (masv.equals("") || hoten.equals("") || ngaysinh.equals("") || diemtb.equals("") || (!rb_svattt.isSelected() && !rb_svmm.isSelected())) {
            JOptionPane.showMessageDialog(null, "nhap thieu thong tin ");
            return;
        }
        if (rb_svattt.isSelected()) {
            if (hocphi.equals("")) {
                JOptionPane.showMessageDialog(null, "nhap thieu hoc phi");
                return;
            }
            try {

                float hocPhi = Float.parseFloat(hocphi);

                // luu sinh vien vao file
                try {
                    FileWriter fw = new FileWriter("svat.dat");
                    BufferedWriter bw = new BufferedWriter(fw);
                    sinhvienattt sv = new sinhvienattt(masv, hoten, ngaysinh, gioitinh, diem, hocPhi);
                    bw.append(masv + "$" + hoten + "$" + ngaysinh + "$" + gioitinh + "$" + diem + "$" + hocPhi);
                    bw.newLine();
                    sv.showinfor();
                    bw.close();
                    fw.close();
                } catch (IOException e) {
                    JOptionPane.showMessageDialog(null, "luu file that bai");
                }

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "nhap sai dinh dang hoc phi");
            }

        }
        if (rb_svmm.isSelected()) {
            if (donvi.equals("") || luong.equals("")) {
                JOptionPane.showMessageDialog(null, "nhap thieu thongtin");
                return;
            }
            try {
                float Luong = Float.parseFloat(luong);
                try {
                    FileWriter fw = new FileWriter("svmm.dat");
                    BufferedWriter bw = new BufferedWriter(fw);
                    sinhvienmatma svmm = new sinhvienmatma(masv, hoten, ngaysinh, gioitinh, diem, donvi, Luong);
                    bw.append(masv + "$" + hoten + "$" + ngaysinh + "$" + gioitinh + "$" + diem + "$" + donvi + "$" + Luong);
                    bw.newLine();
                    bw.close();
                    fw.close();
                } catch (IOException iOException) {
                    JOptionPane.showMessageDialog(null, "luu file that bai");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "nhap sai dinh dang");
            }

        }


    }//GEN-LAST:event_btn_saveActionPerformed

    private void rb_svatttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_svatttActionPerformed
        tf_donvi.setEnabled(false);
        tf_luong.setEnabled(false);
        tf_hocphi.setEnabled(true);

    }//GEN-LAST:event_rb_svatttActionPerformed

    private void rb_svmmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_svmmActionPerformed
        tf_hocphi.setEnabled(false);
        tf_donvi.setEnabled(true);
        tf_luong.setEnabled(true);
    }//GEN-LAST:event_rb_svmmActionPerformed

    private void btn_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resetActionPerformed
       
       buttonGroup2.clearSelection();
       buttonGroup1.clearSelection();
       tf_hoten.setText("");
       tf_masv.setText("");
       tf_ngaysinh.setText("");
       tf_diemtb.setText("");
       tf_hocphi.setText("");
       tf_donvi.setText("");
       tf_luong.setText("");
    }//GEN-LAST:event_btn_resetActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_reset;
    private javax.swing.JButton btn_save;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton nam;
    private javax.swing.JRadioButton nu;
    private javax.swing.JRadioButton rb_svattt;
    private javax.swing.JRadioButton rb_svmm;
    private javax.swing.JTextField tf_diemtb;
    private javax.swing.JTextField tf_donvi;
    private javax.swing.JTextField tf_hocphi;
    private javax.swing.JTextField tf_hoten;
    private javax.swing.JTextField tf_luong;
    private javax.swing.JTextField tf_masv;
    private javax.swing.JTextField tf_ngaysinh;
    // End of variables declaration//GEN-END:variables
}