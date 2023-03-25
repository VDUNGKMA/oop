package View;

import java.awt.Button;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ViDu_Grid_Layout extends JFrame {

    public ViDu_Grid_Layout() {
        this.setVisible(true);
        this.setTitle("Grid Layout");
        this.setSize(400, 400);
        this.setLocationRelativeTo(null);

        //set layout
        GridLayout gridLayout1 = new GridLayout();
        GridLayout gridLayout2 =new GridLayout(3,3);
        GridLayout gridLayout3 =new GridLayout(1, 3, 30, 10);
        this.setLayout(gridLayout2);
        for (int i = 0; i <15 ; i++) {
            JButton jButton =new JButton(i+"");
            this.add(jButton);
        }
//        JButton jButton1 = new JButton("1");
//        JButton jButton2 = new JButton("2");
//        JButton jButton3 = new JButton("3");
//        // add thanh phan
//        this.add(jButton1);
//        this.add(jButton2);
//        this.add(jButton3);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new ViDu_Grid_Layout();
    }
}
