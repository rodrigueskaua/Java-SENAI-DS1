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
public class Retangulo implements Quadrilatero{

    float lado; float altura;
    
    public Retangulo(float initLado, float initAltura) {
        this.lado = initLado;
        this.altura = initAltura;
    }

    @Override
    public float calcularArea() {
        return lado * altura;
    }
    @Override
    public float calcularPerimetro() {
        return (lado + altura) * 2;
    }

   
    
}
