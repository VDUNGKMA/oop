
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.MiniCaculatorView;


public class MiniCaculatorListener  implements ActionListener{
    private MiniCaculatorView MiniCaculatorView;

    public MiniCaculatorListener(MiniCaculatorView MiniCaculatorView) {
        this.MiniCaculatorView = MiniCaculatorView;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String button =e.getActionCommand();
        if(button.equals("+")){
            this.MiniCaculatorView.plus();
        }
        else if(button.equals("-")){
            this.MiniCaculatorView.minus();
        }
        else if(button.equals("*")){
            this.MiniCaculatorView.multyply();
        }
        else if(button.equals("/")){
            this.MiniCaculatorView.devide();
        }
        else if(button.equals("^")){
            this.MiniCaculatorView.pow();
        }
        else if(button.equals("%")){
            this.MiniCaculatorView.mod();
        }
        
    }
    
}
