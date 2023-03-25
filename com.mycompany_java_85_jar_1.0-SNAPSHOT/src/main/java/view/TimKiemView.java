package view;

import controller.TimKiemListener;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import model.TimKiemModel;

public class TimKiemView extends JFrame {

    private TimKiemModel timKiemModel;
    private JTextArea jTextArea_vanban;
    private JTextField jTextField_tukhoa;
    private JLabel jLabel_ketqua;

    public TimKiemView() {
        this.timKiemModel = new TimKiemModel();
        this.init();
    }

    private void init() {
        this.setTitle("tim kiem");
        this.setSize(600, 600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Font font = new Font("Arial", Font.BOLD, 40);
        JLabel jLabel_vanban = new JLabel("van ban");
        jLabel_vanban.setFont(font);

        jTextArea_vanban = new JTextArea(100, 100);
        jTextArea_vanban.setFont(font);
        
        JScrollPane jScrollPane =new JScrollPane();
        jScrollPane.setViewportView(jTextArea_vanban);

        JLabel jLabel_tukhoa = new JLabel("tu khoa");
        jLabel_tukhoa.setFont(font);

        jTextField_tukhoa = new JTextField();
        jTextField_tukhoa.setFont(font);
        //footer

        TimKiemListener timKiemListener = new TimKiemListener(this);

        JButton jButton_thongke = new JButton("Thong ke");
        jButton_thongke.setFont(font);
        jButton_thongke.addActionListener(timKiemListener);
        jButton_thongke.setBackground(Color.red);

        jLabel_ketqua = new JLabel();
        jLabel_ketqua.setBackground(Color.BLUE);
        JPanel jPanel_footer = new JPanel();
        jPanel_footer.setLayout(new GridLayout(2, 2,10,10));
        jPanel_footer.add(jLabel_tukhoa);
        jPanel_footer.add(jTextField_tukhoa);
        jPanel_footer.add(jButton_thongke);
        jPanel_footer.add(jLabel_ketqua);

        this.setLayout(new BorderLayout());
        this.add(jLabel_vanban, BorderLayout.NORTH);
        this.add(jScrollPane,BorderLayout.CENTER);
        this.add(jPanel_footer, BorderLayout.SOUTH);

        this.setVisible(true);
    }
    public void timkiem(){
        this.timKiemModel.setVanban(jTextArea_vanban.getText());
        this.timKiemModel.setTukhoa(jTextField_tukhoa.getText());
        this.timKiemModel.timKiem();
        this.jLabel_ketqua.setText( this.timKiemModel.getKetqua());
    }

}
