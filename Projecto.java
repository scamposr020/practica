
package proyectofinal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Projecto extends JFrame  {
    JPanel panel;

    public Projecto(){
        
    setSize(500,500);
    setResizable(false);
    setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    setLocationRelativeTo(null);
    setLayout(null);
    establecePanel();
    setVisible(true);
    metodoBotonPrincipal();
    
    }
    
    private void establecePanel(){
     
         panel = new JPanel();
        
        panel.setSize(500,500);
        
        panel.setLayout(null);
        
        this.getContentPane().add(panel);
        
    }

    private void metodoBotonPrincipal(){
    
        JButton BotonPrinc = new JButton();
        
        BotonPrinc.setBounds(100,200,150,40);
     
       
        BotonPrinc.setText("Click aqui");
        panel.add(BotonPrinc);
        ActionListener accionBoton = new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent ae) {
               
                Proyectofinal obj = new Proyectofinal();
                setVisible(false);
                obj.setVisible(true);
            }
        };
        BotonPrinc.addActionListener(accionBoton);
        
    }
    
  public static void main(String[] args) {
      
        Projecto obj = new Projecto();
        
       
        
    }
}