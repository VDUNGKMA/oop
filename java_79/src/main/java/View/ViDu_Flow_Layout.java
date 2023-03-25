package View;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ViDu_Flow_Layout extends JFrame {

    public ViDu_Flow_Layout() {
        this.setTitle("Vi Du Flow Layout");
        this.setVisible(true);
        this.setSize(400, 400);
        this.setLocationRelativeTo(null);// can giua man hinh

        //FLOW LAYOUT
        FlowLayout flowlayout1 = new FlowLayout();
        FlowLayout flowLayout2 =new FlowLayout(FlowLayout.LEFT);
        FlowLayout flowLayout3 =new FlowLayout(FlowLayout.CENTER,50,10);
        this.setLayout(flowLayout3);
        JButton jButton1 = new JButton("button1");
        JButton jButton2 = new JButton("button2");
        JButton jButton3 = new JButton("button3");
        // add thanh phan
        this.add(jButton1);
        this.add(jButton2);
        this.add(jButton3);

        //  FlowLayout fl2 = new FlowLayout(FlowLayout.CENTER);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new ViDu_Flow_Layout();
    }
}
