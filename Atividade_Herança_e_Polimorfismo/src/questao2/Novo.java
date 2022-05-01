/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao2;

/**
 *
 * @author nasci
 */
public class Novo extends Imovel{
    
    double adicionalPreco;
    
    public Novo(String initEndereco, double initValor, double initAdicionalPreco) {
        super(initEndereco, initValor);
        
        this.adicionalPreco = initAdicionalPreco;
    }
    
    
   public void setAdicionalPreco(double adicional){
       this.adicionalPreco = adicional;
   }
   
   public void valorTotal(){
       System.out.printf("Valor total da casa: R$%.2f\n",  valor + adicionalPreco);
   }
   
   
 
}



