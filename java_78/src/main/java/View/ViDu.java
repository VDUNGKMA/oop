
package View;

import javax.swing.JFrame;


public class ViDu {
    public static void main(String[] args) {
        JFrame jf =new JFrame();
        jf.setTitle("Vi Du JFrame"); //hien thi tieu de
        jf.setSize(400,400); // set kich co 
        jf.setLocation(400,200);
        jf.setVisible(true); //cho phep hien cua so
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // thoat ra khoi chuong trinh khi dong jframe
    }
}
