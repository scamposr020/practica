
package proyectofinal;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Proyectofinal extends JFrame{

   public Proyectofinal(){
   
       
       setSize(500,500);
       setLocationRelativeTo(null);
       setResizable(false);
       setDefaultCloseOperation(EXIT_ON_CLOSE);
       agregaPanel();
   }
 
    private void agregaPanel(){
    
        JPanel panel2 = new JPanel();
        panel2.setSize(500,200);
        JLabel etiqu = new JLabel();
        this.getContentPane().add(panel2);
        etiqu.setText("HOLA");
        etiqu.setBounds(50,150,20,20);
        panel2.add(etiqu);
        
    }
    
    
    
}
