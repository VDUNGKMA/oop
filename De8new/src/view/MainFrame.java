/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.io.BufferedWriter;
import java.io.FileWriter;
import javax.swing.JOptionPane;
import model.NumBer;

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
        jLabel1 = new javax.swing.JLabel();
        tf_max = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tf_min = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tf_value = new javax.swing.JTextField();
        btn_khoitao = new javax.swing.JButton();
        btn_luu = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        cbox = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Max");

        jLabel2.setText("Min");

        jLabel3.setText("Value");

        btn_khoitao.setText("Khởi tạo");
        btn_khoitao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_khoitaoActionPerformed(evt);
            }
        });

        btn_luu.setText("Lưu");
        btn_luu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_luuActionPerformed(evt);
            }
        });

        jButton1.setText("Reset");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Nam");

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Nu");

        cbox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(383, 383, 383)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(82, 82, 82)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tf_max, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tf_min, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tf_value, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_khoitao)
                                .addGap(61, 61, 61)
                                .addComponent(btn_luu, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(81, 81, 81)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton1)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(373, 373, 373)
                        .addComponent(jRadioButton1)
                        .addGap(120, 120, 120)
                        .addComponent(jRadioButton2)))
                .addContainerGap(299, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {tf_max, tf_min, tf_value});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2)
                    .addComponent(cbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tf_max, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tf_min, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(tf_value, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_khoitao)
                    .addComponent(btn_luu)
                    .addComponent(jButton1))
                .addContainerGap(366, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_khoitaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_khoitaoActionPerformed
        String min = tf_min.getText();
        String max = tf_max.getText();
        String value = tf_value.getText();
        if (min.equals("") || max.equals("") || value.equals("")) {
            JOptionPane.showMessageDialog(null, "nhap thieu thong tin");
            return;
        }
        try {
            int giatrinho = Integer.parseInt(min);
            int giatrilon = Integer.parseInt(max);
            int giatrinhap = Integer.parseInt(value);
            if (giatrinhap >= giatrilon || giatrinhap <= giatrinho) {
                JOptionPane.showMessageDialog(null, "gia tri value khong hop ly(   min<valu<max  ))");
                return;
            } else {
                NumBer nb = new NumBer(giatrilon, giatrinho, giatrinhap);
                JOptionPane.showMessageDialog(null, "khoi tao thanh cong");
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, " nhap sai dinh dang");
        }


    }//GEN-LAST:event_btn_khoitaoActionPerformed

    private void btn_luuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_luuActionPerformed
        String min = tf_min.getText();
        String max = tf_max.getText();
        String value = tf_value.getText();
        if (min.equals("") || max.equals("") || value.equals("")) {
            JOptionPane.showMessageDialog(null, "nhap thieu thong tin");
            return;
        }
        try {
            int giatrinho = Integer.parseInt(min);
            int giatrilon = Integer.parseInt(max);
            int giatrinhap = Integer.parseInt(value);
            if (giatrinhap >= giatrilon || giatrinhap <= giatrinho) {
                JOptionPane.showMessageDialog(null, "gia tri value khong hop ly(   min<valu<max  ))");
                return;
            } else {

                try {
                    FileWriter fw = new FileWriter("Number.dat",true);
                    BufferedWriter bw = new BufferedWriter(fw);
                    NumBer nb = new NumBer(giatrilon, giatrinho, giatrinhap);
                    bw.append(giatrilon+"$"+giatrinho+"$"+giatrinhap);
                    bw.newLine();
                    bw.close();
                    fw.close();
                     JOptionPane.showMessageDialog(null, "luu file thanh cong");
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "luu file that bai");
                }

            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, " nhap sai dinh dang");
        }
    }//GEN-LAST:event_btn_luuActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       tf_min.setText("");
       tf_max.setText("");
       tf_value.setText("");
       buttonGroup1.clearSelection();
       cbox.setSelectedIndex(0);
    }//GEN-LAST:event_jButton1ActionPerformed

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
    private javax.swing.JButton btn_khoitao;
    private javax.swing.JButton btn_luu;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox cbox;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField tf_max;
    private javax.swing.JTextField tf_min;
    private javax.swing.JTextField tf_value;
    // End of variables declaration//GEN-END:variables
}