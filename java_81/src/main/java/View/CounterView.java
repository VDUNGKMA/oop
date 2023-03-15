
package View;

import Controller.CounterListener;
import Model.CounterModel;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class CounterView  extends JFrame{
    private CounterModel counterModel;
    private JButton jButton_up;
    private JButton jButton_down;
    private JLabel jLabel_value;
    public CounterView() {
        this.counterModel=new CounterModel();
        this.init();
        this.setVisible(true);
    }
    public void init(){
        this.setTitle("Counter");
        this.setSize(300,300);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        ActionListener ac =new CounterListener(this);
        jButton_up =new JButton("UP");
        jButton_up.addActionListener(ac);
        
        jButton_down=new JButton("DOWN");
        jButton_down.addActionListener(ac);
        
        jLabel_value =new JLabel(this.counterModel.getValue()+"",JLabel.CENTER );
        
        
        JPanel jpanel =new JPanel();
        jpanel.setLayout(new BorderLayout());
        jpanel.add(jButton_up,BorderLayout.WEST);
        jpanel.add(jButton_down,BorderLayout.EAST);
        jpanel.add(jLabel_value,BorderLayout.CENTER );
        
        this.setLayout(new BorderLayout());
        this.add(jpanel,BorderLayout.CENTER);
        
    }
    public void increment(){
        this.counterModel.increment();
        this.jLabel_value.setText(this.counterModel.getValue()+"");
    }
    public void decrement(){
        this.counterModel.decrement();
        this.jLabel_value.setText(this.counterModel.getValue()+"");
    }
    
}
