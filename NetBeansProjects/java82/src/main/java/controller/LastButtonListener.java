/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.LastButtonView;

/**
 *
 * @author Admin
 */
public class LastButtonListener implements ActionListener{

    public LastButtonListener(LastButtonView LastButtonView) {
        
        super();
        this.LastButtonView = LastButtonView;
    }
    private  LastButtonView LastButtonView;

    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        String nguonsukien =e.getActionCommand();
        if(nguonsukien.equals("1")){
            this.LastButtonView.changeto_1();
        }
        else if(nguonsukien.equals("2")){
            this.LastButtonView.changeto_2();
            
        }
        else if(nguonsukien.equals("3")){
            this.LastButtonView.changeto_3();
        }
        else
            this.LastButtonView.changeto_4();
    }
    
}
