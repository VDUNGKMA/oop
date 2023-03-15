package view;

import controller.MiniCaculatorListener;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import model.MiniComputerModel;

public class MiniCaculatorView extends JFrame {

    private MiniComputerModel miniComputerModel;
    private JTextField jTextField_firstValue;
    private JTextField jTextField_SecondValue;
    private JTextField jTextField_answerValue;

    public MiniCaculatorView() {
        this.miniComputerModel = new MiniComputerModel();
        this.init();
    }

    private void init() {
        this.setTitle("Mini Computer");
        this.setSize(400, 400);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        JLabel jLabel_firstvalue = new JLabel("1st Value");
        JLabel jLabel_secondvalue = new JLabel("2st Value");
        JLabel jLabel_answer = new JLabel("Answer");
        
        
         jTextField_firstValue = new JTextField(50);
         jTextField_SecondValue = new JTextField(50);
         jTextField_answerValue = new JTextField(50);
        
        JPanel jpanelIO=new JPanel();
        jpanelIO.setLayout(new GridLayout(3,2));
        jpanelIO.add(jLabel_firstvalue);
        jpanelIO.add(jTextField_firstValue);
        jpanelIO.add(jLabel_secondvalue);
        jpanelIO.add(jTextField_SecondValue);
        jpanelIO.add(jLabel_answer);
        jpanelIO.add(jTextField_answerValue);
        
        this.setLayout(new BorderLayout());
        this.add(jpanelIO,BorderLayout.CENTER);
       
        MiniCaculatorListener miniCaculatorListener =new MiniCaculatorListener(this);
        JButton jButton_plus =new JButton("+");
        jButton_plus.addActionListener(miniCaculatorListener);
        
        JButton jButton_minus =new JButton("-");
        jButton_minus.addActionListener(miniCaculatorListener);
        
        JButton jButton_multyply =new JButton("*");
        jButton_multyply.addActionListener(miniCaculatorListener);
        
        JButton jButton_devide =new JButton("/");
        jButton_devide.addActionListener(miniCaculatorListener); 
        
        JButton jButton_pow =new JButton("^");
        jButton_pow.addActionListener(miniCaculatorListener);
        
        JButton jButton_mod =new JButton("%");
        jButton_mod.addActionListener(miniCaculatorListener);
        
        JPanel jpanelButtons =new JPanel();
        jpanelButtons.setLayout(new GridLayout(3,2));
        jpanelButtons.add(jButton_plus);
        jpanelButtons.add(jButton_minus);
        jpanelButtons.add(jButton_multyply);
        jpanelButtons.add(jButton_devide);
        jpanelButtons.add(jButton_pow);
        jpanelButtons.add(jButton_mod);
        
        this.setLayout(new BorderLayout(10,10));
        this.add(jpanelIO,BorderLayout.CENTER);
        this.add(jpanelButtons,BorderLayout.SOUTH);
        
        

    }
    public void plus(){
        double firstValue=Double.valueOf(jTextField_firstValue.getText());
        double secondValue=Double.valueOf(jTextField_SecondValue.getText());
        this.miniComputerModel.setFirst_value(firstValue);
                this.miniComputerModel.setSecond_value(secondValue);
                this.miniComputerModel.plus();
             this.jTextField_answerValue.setText(this.miniComputerModel.getAnswer()+""); 
    }
    public void minus(){
        double firstValue=Double.valueOf(jTextField_firstValue.getText());
        double secondValue=Double.valueOf(jTextField_SecondValue.getText());
        this.miniComputerModel.setFirst_value(firstValue);
                this.miniComputerModel.setSecond_value(secondValue);
                this.miniComputerModel.minus();
             this.jTextField_answerValue.setText(this.miniComputerModel.getAnswer()+""); 
    }
    public void multyply(){
        double firstValue=Double.valueOf(jTextField_firstValue.getText());
        double secondValue=Double.valueOf(jTextField_SecondValue.getText());
        this.miniComputerModel.setFirst_value(firstValue);
                this.miniComputerModel.setSecond_value(secondValue);
                this.miniComputerModel.multiply();
             this.jTextField_answerValue.setText(this.miniComputerModel.getAnswer()+""); 
    }
    public void devide(){
        double firstValue=Double.valueOf(jTextField_firstValue.getText());
        double secondValue=Double.valueOf(jTextField_SecondValue.getText());
        this.miniComputerModel.setFirst_value(firstValue);
                this.miniComputerModel.setSecond_value(secondValue);
                this.miniComputerModel.devide();
             this.jTextField_answerValue.setText(this.miniComputerModel.getAnswer()+""); 
    }
    public void pow(){
        double firstValue=Double.valueOf(jTextField_firstValue.getText());
        double secondValue=Double.valueOf(jTextField_SecondValue.getText());
        this.miniComputerModel.setFirst_value(firstValue);
                this.miniComputerModel.setSecond_value(secondValue);
                this.miniComputerModel.power();
             this.jTextField_answerValue.setText(this.miniComputerModel.getAnswer()+""); 
    }
    public void mod(){
        double firstValue=Double.valueOf(jTextField_firstValue.getText());
        double secondValue=Double.valueOf(jTextField_SecondValue.getText());
        this.miniComputerModel.setFirst_value(firstValue);
                this.miniComputerModel.setSecond_value(secondValue);
                this.miniComputerModel.mode();
             this.jTextField_answerValue.setText(this.miniComputerModel.getAnswer()+""); 
    }
}
