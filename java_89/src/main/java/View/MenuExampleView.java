
package View;

import Controller.MenuExample_Controller;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;


public class MenuExampleView extends JFrame{

    private final JLabel jLabel;

    public MenuExampleView() {
        this.setTitle("Menu Example");
        this.setSize(500,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        //tao thanh menu
        JMenuBar jMenuBar =new JMenuBar();
        // tao controller
        MenuExample_Controller menuExample_Controller =new MenuExample_Controller(this);
        //tao 1 menu
        JMenu jmenufile =new JMenu("File");
        // tao cac menu item 
        JMenuItem jMenuItem_open =new JMenuItem("open");
        JMenuItem jMenuItem_close =new JMenuItem("close");
        jmenufile.add(jMenuItem_open);
        jMenuItem_open.addActionListener(menuExample_Controller);
        jmenufile.addSeparator();
        jmenufile.add(jMenuItem_close);
        jMenuItem_close.addActionListener(menuExample_Controller);
        
        JMenu jmenu_help =new JMenu("Help");
        JMenuItem jmenuItem_Welcome =new JMenuItem("Welcome");
        jmenu_help.add(jmenuItem_Welcome);
        jmenuItem_Welcome.addActionListener(menuExample_Controller);
        // 
        // add cac lua chon menu vao thanh menubar
        jMenuBar.add(jmenufile);
        jMenuBar.add(jmenu_help);
        // hien thi thanh menu len man hinh
        this.setJMenuBar(jMenuBar);
        // tao label hien thi
        Font font =new Font("Arial", Font.BOLD, 50);
        jLabel =new JLabel();
        this.setLayout(new BorderLayout());
        this.add(jLabel,BorderLayout.CENTER);
        this.setVisible(true);
    }
    public void setText(String s){
        this.jLabel.setText(s);
    }
}
