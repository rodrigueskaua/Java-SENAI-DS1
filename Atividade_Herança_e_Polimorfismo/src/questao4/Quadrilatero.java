/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao4;

/**
 *
 * @author nasci
 */
public interface Quadrilatero {
    
    public float calcularArea();
    public float calcularPerimetro();
    
    
    
    
    
public static void main(String[] args) {
       
    Retangulo teste = new Retangulo(7,5);
    System.out.println(teste.calcularArea());
    System.out.println(teste.calcularPerimetro());

    }
}






