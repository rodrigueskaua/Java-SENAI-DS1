/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao1;

/**
 *
 * @author nasci
 */
public class Ingresso {

    public double ValorIngresso;
        
    public Ingresso(double initValorIngresso){
        this.ValorIngresso =initValorIngresso;
        
    }
    
    public void informacoesIngresso(){
        System.out.printf("\nTipo: Normal\nValor: R$%.2f\n", this.ValorIngresso);
    }
    

    
}
