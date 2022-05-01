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
public class main {
    public static void main(String[] args) {
        Novo teste = new Novo("teste",150000,2000);
        teste.valorTotal();
        
        Velho teste1 = new Velho("teste",150000,2000);
        teste1.valorTotal();
    }
}
