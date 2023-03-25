package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.JOptionPane;
import model.ThiSinh;
import model.Tinh;
import view.QLSVView;

public class QLSVController implements ActionListener {

    public QLSVView view;

    public QLSVController(QLSVView view) {
        this.view = view;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       
        
        String cm = e.getActionCommand();
        JOptionPane.showMessageDialog(view, "ban vua nhan vao:" + cm);
        if (cm.equals("Them")) {
            this.view.xoaForm();
            this.view.model.setLuachon("Them");
        } else if (cm.equals("Luu")) {
            
            int maThiSinh = Integer.valueOf(this.view.tf_mathisinh.getText());
                String tenThiSinh = this.view.tf_hovaten.getText();
                String queQuan = (String) this.view.cbox_quequan.getSelectedItem();
                Tinh tinh = new Tinh(queQuan);
                Date ngaySinh = new Date(this.view.tf_ngaysinh.getText());

                boolean gioiTinh = true;
                String chongioitinh = this.view.btn_Gioitinh.getSelection() + "";
                if (chongioitinh.equals("nam")) {
                    gioiTinh = true;
                } else {
                    gioiTinh = false;
                }
              float diemMon1 =Float.valueOf(this.view.tf_mon1.getText());
              float diemMon2 =Float.valueOf(this.view.tf_mon2.getText());
              float diemMon3 =Float.valueOf(this.view.tf_mon3.getText());
              // add cac bien tren vao danh sach can taa
                ThiSinh thiSinh=new ThiSinh(maThiSinh, tenThiSinh, tinh, ngaySinh, gioiTinh, diemMon1, diemMon2, diemMon3);
            // tao ra cac bien de chuan bi them vao ds
            if (this.view.model.getLuachon().equals("") || this.view.model.equals("Them")) {
                this.view.themthisinh(thiSinh);
}
else if (this.view.model.equals("Cap Nhap")) {
                this.view.capnhapThiSinh(thiSinh);
            }
        }
    }

}
