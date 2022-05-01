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
public class VIP extends Ingresso{
    public double ValorAdicional;

    
    public VIP(double initValorIngresso, double initValorAdicional) {
        super(initValorIngresso);
        this.ValorAdicional = initValorAdicional;
    }
    
    public double ingressoVIP(){
        return this.ValorIngresso + this.ValorAdicional;
        
    }
    
}
