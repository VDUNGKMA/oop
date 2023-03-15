
package Controller;


import View.MenuExampleView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuExample_Controller implements ActionListener{
    private MenuExampleView menuExampleView;

    public MenuExample_Controller(MenuExampleView menuExampleView) {
        this.menuExampleView = menuExampleView;
    }

   
    @Override
    public void actionPerformed(ActionEvent e) {
        String button =e.getActionCommand();
        if(button.equals("open")){
           this.menuExampleView.setText("ban da click vao item open");
        }
        else if(button.equals("close")){
             this.menuExampleView.setText("ban da click vao item close");
        }
        else if(button.equals("Welcome")){
             this.menuExampleView.setText("ban da click vao item Welcome");
        }
    }
    
}
