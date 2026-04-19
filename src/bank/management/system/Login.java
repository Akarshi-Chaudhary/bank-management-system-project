package bank.management.system;
import javax.swing.*;

public class Login extends JFrame{
    
    Login(){
         setSize(800, 480);
         setVisible(true);
         setTitle("AUTOMATED TELLER MACHINE");
         setLocation(350, 200);
    }
    public static void main(String args[]){
          new Login();
    }
    
}
