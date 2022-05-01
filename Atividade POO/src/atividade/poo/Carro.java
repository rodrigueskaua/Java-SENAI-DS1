/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade.poo;

/**
 *
 * @author nasci
 */
public class Carro {
    double consumo; double combustivel;
    
    public Carro(double kmPorLitro){
        this.consumo = kmPorLitro;
        this.combustivel = 0;
    }
    
    public void andar(double distancia){
        double gastoCombustivel = distancia / this.consumo;
        this.combustivel -= gastoCombustivel;
        
    }
    
     public double obterGasolina(){
        return this.combustivel;
         
    }
     
     public void adicionarGasolina(double qtdGasolina){
        this.combustivel += qtdGasolina;
        
    }
    public static void main(String[] args) {
        
        Carro fusca = new Carro(15);
        fusca.adicionarGasolina(20);
        fusca.andar(100);
        System.out.println(fusca.obterGasolina());
      

    }
}


