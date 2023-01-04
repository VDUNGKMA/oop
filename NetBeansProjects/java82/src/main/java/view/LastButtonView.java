/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import controller.LastButtonListener;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import model.LastButtonModel;

/**
 *
 * @author Admin
 */
public class LastButtonView extends JFrame {

    private LastButtonModel lastButtonModel;
    private JLabel jLabel;

    public LastButtonView() {
        this.lastButtonModel = new LastButtonModel();
        this.init();
    }

    private void init() {
        this.setTitle("Last Button");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300, 300);

        JPanel jPanel_center = new JPanel();
        jPanel_center.setLayout(new GridLayout(2,2  ));
        //tao listener
        ActionListener lastActionListener=new LastButtonListener(this);
        
        //tao phong chu
        Font font=new Font("Arial",Font.BOLD, 20);
        JButton jButton1 = new JButton("1");
        //set phong chu 
        jButton1.setFont(font);
        jButton1.addActionListener(lastActionListener);
        JButton jButton2 = new JButton("2");
        jButton2.setFont(font);
        jButton2.addActionListener(lastActionListener);
        JButton jButton3 = new JButton("3");
        jButton3.setFont(font);
        jButton3.addActionListener(lastActionListener);
        JButton jButton4 = new JButton("4");
        jButton4.setFont(font);
        jButton4.addActionListener(lastActionListener);
        jPanel_center.add(jButton1);
        jPanel_center.add(jButton2);
        jPanel_center.add(jButton3);
        jPanel_center.add(jButton4);
        
        JPanel jPanel_footer =new JPanel();
        jLabel = new JLabel("-----");
        jLabel.setFont(font);
        jPanel_footer.add(jLabel);
        
        this.setLayout(new BorderLayout());
        this.add(jPanel_center,BorderLayout.CENTER);
        this.add(jPanel_footer,BorderLayout.SOUTH);
        this.setVisible(true);

    }
    public void changeto_1(){
        this.lastButtonModel.setValue_1();
        jLabel.setText("Last Button"+this.lastButtonModel.getValue());
    }
    public void changeto_2(){
        this.lastButtonModel.setValue_2();
        jLabel.setText("Last Button"+this.lastButtonModel.getValue());
    }
    public void changeto_3(){
        this.lastButtonModel.setValue_3();
        jLabel.setText("Last Button"+this.lastButtonModel.getValue());
    }
    public void changeto_4(){
        this.lastButtonModel.setValue_4();
        jLabel.setText("Last Button"+this.lastButtonModel.getValue());
    }
    
}
