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
public class CamaroteSuperior extends VIP{
    public double camaroteValorAdicional;

    public CamaroteSuperior(double initValorIngresso, double initValorAdicional, double initcamaroteValorAdicional ) {
        super(initValorIngresso, initValorAdicional);
        
        this.camaroteValorAdicional = initcamaroteValorAdicional;
    }
    
    
    public double getCamaroteValorAdicional(){
        return this.camaroteValorAdicional;
    } 
    
    public void informacoesIngresso(){
        System.out.printf("\nTipo: VIP - Camarote Superior\nValor: R$%.2f\n", this.ValorIngresso + this.ValorAdicional + this.camaroteValorAdicional);
    }
}