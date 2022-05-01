/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade.poo;

public class bombaCombustível {
    String tipoCombustivel; double valorLitro; double qtdCombustivel;

    public bombaCombustível(String initTipoCombustivel, double initValorLitro, double initQtdCombustivel){
        this.tipoCombustivel = initTipoCombustivel;
        this.valorLitro = initValorLitro;
        this.qtdCombustivel = initQtdCombustivel;
        
    }
    
     public void getCombustivelRestante(){
        System.out.printf("\nLitro(s) restantes na bomba: %.2f\n\n", this.qtdCombustivel);
    }
    
    public void abastecerPorValor(double valor){
        double qtdAbastecida = valor / this.valorLitro;
        if(qtdAbastecida < qtdCombustivel){
            System.out.printf("Abastecimento por valor selecionado:\n%.2f Litro(s) abastecido(s)\nValor total: R$%.2f \n\n", qtdAbastecida, valor);
            qtdCombustivel -= qtdAbastecida;
        }
        else{
            System.out.printf("Quantidade de combustivel na bomba é menor que o solicitado\nQuantidade restante: %.2f Litro(s)\n\n", this.qtdCombustivel );
        }
        
    }
    
    public void abastecerPorLitro(double litros){
        double valorAbastecido = litros * this.valorLitro;
        if(litros < qtdCombustivel){
           System.out.printf("Abastecimento por litro selecionado:\n%.2f Litro(s) abastecido(s)\nValor total: R$%.2f \n\n", litros, valorAbastecido );
            qtdCombustivel -= litros;
        }
        else{
            System.out.printf("Quantidade de combustivel na bomba é menor que o solicitado\nQuantidade restante: %.2f Litro(s)\n\n", this.qtdCombustivel );
        }
        
    }
 
    public void alterarValor(double novoValor){
        if(novoValor > 0 ){
            this.valorLitro = novoValor;
            
        } 
    }
    
    public void alterarCombustivel(String novoTipo){
        this.tipoCombustivel = novoTipo;  
      
    }

    public void alterarQuantidadeCombustivel(double novaQtd){
        if(novaQtd > 0 ){
            this.qtdCombustivel = novaQtd;  
            
        } 
      
    }
    
    
    public static void main(String[] args) {
        
        bombaCombustível bomba = new bombaCombustível("gasolina", 10.50, 10);
        bomba.getCombustivelRestante();
        bomba.abastecerPorLitro(1);
        bomba.getCombustivelRestante();

        bomba.alterarQuantidadeCombustivel(10);
        
        bomba.abastecerPorValor(100);




    }
    
}
