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
public class Velho extends Imovel{
    
    double descontoPreco;
    
    public Velho(String initEndereco, double initValor, double initDescontoPreco) {
        super(initEndereco, initValor);
        
        this.descontoPreco = initDescontoPreco;
    }
    
    
   public void setAdicionalPreco(double desconto){
       this.descontoPreco = desconto;
   }
   
   public void valorTotal(){
       System.out.printf("Valor total da casa: R$%.2f\n",  valor - descontoPreco);
   }
   
   
   
   public static void main(String[] args) {
        Velho pessoa1 = new Velho("kauã",5000,15);
        pessoa1.valorTotal();
    }
}



