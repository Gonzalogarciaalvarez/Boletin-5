package bol5;

/**
 *
 * @author ggarciaalvarez
 */
public class Coche {
     private int velocidade ;
    
    public Coche(){
    velocidade = 0 ;
}
  
    
   public void acelerar(int valor){
       velocidade = velocidade + valor;
   }
   public void frenar(int menos){
       velocidade = velocidade - menos;
   }
    public int getVelocidade(){
       return velocidade ;
       
   } 
}
