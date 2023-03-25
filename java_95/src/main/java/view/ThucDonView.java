package view;

import controller.ThucDonController;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import model.ThucDonModel;

public class ThucDonView extends JFrame {

    public ThucDonModel thucDonModel;
    public JRadioButton jRadioButton_ga;
    public JRadioButton jRadioButton_vit;
    public JRadioButton jRadioButton_heo;
    public JCheckBox jCheckBox_trasua;
    public JCheckBox jCheckBox_hoaqua;
    public JCheckBox jCheckBox_keo;
    public JCheckBox jCheckBox_bimbim;
    private JLabel jLabel_thongtin;

    public ThucDonView() {
        this.thucDonModel = new ThucDonModel();
        init();
    }

    private void init() {
        this.setTitle("Thuc Don");
        this.setSize(600, 600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel header = new JLabel("THUC DON NHA HANG");
        // tieu de 
        JPanel jPanel_tieude = new JPanel();
        jPanel_tieude.add(header);
        this.add(jPanel_tieude, BorderLayout.NORTH);
        //lua chon menu cho mon chinh
        JPanel jPanel_monchinh = new JPanel();
        //tao ra cac lua chon radiobutton
        jRadioButton_ga = new JRadioButton("ga");
        jRadioButton_vit = new JRadioButton("vit");
        jRadioButton_heo = new JRadioButton("heo");
        // nhom het cac lua chon vao trong 1 group, chi duoc lua chon 1
        ButtonGroup buttonGroup_monchinh = new ButtonGroup();
        buttonGroup_monchinh.add(jRadioButton_ga);
        buttonGroup_monchinh.add(jRadioButton_vit);
        buttonGroup_monchinh.add(jRadioButton_heo);

        // hien thi len man hinh
        jPanel_monchinh.setLayout(new GridLayout(1, 3));
        jPanel_monchinh.add(jRadioButton_ga);
        jPanel_monchinh.add(jRadioButton_vit);
        jPanel_monchinh.add(jRadioButton_heo);

        JPanel jPanel_monphu = new JPanel();
        jPanel_monphu.setLayout(new GridLayout(2, 2));
        jCheckBox_trasua = new JCheckBox("tra sua");
        jCheckBox_hoaqua = new JCheckBox("hoa qua");
        jCheckBox_keo = new JCheckBox("keo");
        jCheckBox_bimbim = new JCheckBox("bim bim");

        ButtonGroup buttonGroup_monphu = new ButtonGroup();
        buttonGroup_monphu.add(jCheckBox_trasua);
        buttonGroup_monphu.add(jCheckBox_hoaqua);
        buttonGroup_monphu.add(jCheckBox_keo);
        buttonGroup_monphu.add(jCheckBox_bimbim);

        jPanel_monphu.add(jCheckBox_trasua);
        jPanel_monphu.add(jCheckBox_hoaqua);
        jPanel_monphu.add(jCheckBox_keo);
        jPanel_monphu.add(jCheckBox_bimbim);

        JPanel jPanel_luachon = new JPanel();
        jPanel_luachon.setLayout(new GridLayout(2, 1));
        jPanel_luachon.add(jPanel_monchinh);
        jPanel_luachon.add(jPanel_monphu);
        this.add(jPanel_luachon, BorderLayout.CENTER);

        JPanel jpanel_thanhtoan = new JPanel();
        jpanel_thanhtoan.setLayout(new GridLayout(1, 2));
        
        
        
        jLabel_thongtin = new JLabel();
        JButton jButton_thanhtoan = new JButton("Thanh Toan");
        ActionListener thucdon_Controller =new ThucDonController(this);
        jButton_thanhtoan.addActionListener(thucdon_Controller);
        jpanel_thanhtoan.add(jLabel_thongtin);
        jpanel_thanhtoan.add(jButton_thanhtoan);
        this.add(jpanel_thanhtoan, BorderLayout.SOUTH);

        this.setVisible(true);
    }

}
