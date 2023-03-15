
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ViDuPanel extends JFrame {

    public ViDuPanel() {
        this.setVisible(true);
        this.setTitle("May Tinh ");
        this.setSize(300, 300);
        this.setLocationRelativeTo(null);
        
        
        JPanel jPanel1 = new JPanel();
        JTextField jTextField1 = new JTextField(30);
        jPanel1.setLayout(new FlowLayout()) ; //set bo cuc textfield nay
        jPanel1.add(jTextField1);  // chon dinh dang la textfield

        // layout button
        JPanel jPanelbutton = new JPanel();
        jPanelbutton.setLayout(new GridLayout(5, 3));

        for (int i = 0; i < 10; i++) {
            JButton jButton = new JButton(i + "");
            jPanelbutton.add(jButton);
        }
        JButton jButton_cong = new JButton("+");
        JButton jButton_tru = new JButton("-");
        JButton jButton_nhan = new JButton("*");
        JButton jButton_chia = new JButton("/");
        JButton jButton_bang = new JButton("=");

        jPanelbutton.add(jButton_cong);
        jPanelbutton.add(jButton_tru);
        jPanelbutton.add(jButton_nhan);
        jPanelbutton.add(jButton_chia);
        jPanelbutton.add(jButton_bang);

        this.setLayout(new BorderLayout());
        this.add(jPanel1, BorderLayout.NORTH);
        this.add(jPanelbutton, BorderLayout.CENTER);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new ViDuPanel();
    }
}
