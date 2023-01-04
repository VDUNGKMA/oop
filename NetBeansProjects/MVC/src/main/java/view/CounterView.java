/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import controller.CounterListener;
import java.awt.BorderLayout;
import java.awt.TextField;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import model.CounterModel;

/**
 *
 * @author Admin
 */
public class CounterView extends JFrame{
    private CounterModel counterModel;
    private TextField textField;
    private JButton jButton_up;
    private JButton jButton_down;
    private JButton jButton_reset;
    private JLabel jlabel_value;
    public CounterView(){
        this.counterModel =new CounterModel();
        this.init();
        this.setVisible(true);
    }
    public void init(){
        this.setTitle("Counter");
        this.setSize(300,300);
        this.setLocationRelativeTo(null);
        
        ActionListener ac =new CounterListener(this);
        
        textField =new TextField();
        textField.addActionListener(ac);
        jButton_up =new JButton("up");
        jButton_up.addActionListener(ac);
        
        jButton_down=new JButton("down");
        jButton_down.addActionListener(ac);
         
        jButton_reset =new JButton("reset");
        jButton_reset.addActionListener(ac);
       
        jlabel_value =new JLabel(this.counterModel.getValue()+"",JLabel.CENTER);
        
        JPanel jPanel =new JPanel();
        jPanel.setLayout(new BorderLayout());
        jPanel.add(textField,BorderLayout.NORTH);
        jPanel.add(jButton_up,BorderLayout.WEST);
        jPanel.add(jButton_down,BorderLayout.EAST);
        jPanel.add(jlabel_value,BorderLayout.CENTER);
        jPanel.add(jButton_reset,BorderLayout.SOUTH);
        
        this.setLayout(new BorderLayout());
        this.add(jPanel,BorderLayout.CENTER);
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void increment(){
        this.counterModel.increment();
        this.jlabel_value.setText(this.counterModel.getValue()+"");
        
    }
     public void decrement(){
        this.counterModel.decrement();
        this.jlabel_value.setText(this.counterModel.getValue()+"");
        
    }
     public void reset(){
         this.counterModel.reset();
         this.jlabel_value.setText(this.counterModel.getValue()+"");
     }
}
