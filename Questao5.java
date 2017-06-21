/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao5;

/**
 *
 * @author daniel
 */
public class Questao5 {
    private int numero;
    private int aux;
    private int aux2;

    public Questao5(int numero) {
        this.numero = numero;
        aux = 6;
        aux2 = this.numero;
    }
    
    public void calcula (){
      for(int i = 1; i <= numero; i++){
          if((numero % i == 0)&& (i % aux == 0)&& (i <= aux2)){
            System.out.println(i);
            aux2/=2;
          }
      }
    
    }    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Questao5 item = new Questao5(24);
        item.calcula();
    }
    
}
