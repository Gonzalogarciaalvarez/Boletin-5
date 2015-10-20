package bol5;

import javax.swing.JOptionPane;

public class Bol5 {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
       int valor, menos;
       
        Coche obx = new Coche ();
        
       
       JOptionPane.showMessageDialog(null, "Velocidad inicial=" +obx.getVelocidade());
       String valorAcelerar = JOptionPane.showInputDialog("Indica aumento de velocidad=");
       obx.acelerar(Integer.parseInt(valorAcelerar));
       
      String valorFrenar = JOptionPane.showInputDialog("Indica velocidad de frenado=");
      obx.frenar(Integer.parseInt(valorFrenar));
      
      JOptionPane.showMessageDialog(null, "La velocidad resultante= "+obx.getVelocidade());
        
        
        
        
    }
    
}