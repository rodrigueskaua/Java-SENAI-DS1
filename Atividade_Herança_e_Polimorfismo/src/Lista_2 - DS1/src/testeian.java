
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nasci
 */
public class testeian {
    public static void main(String[] args){
        System.out.println(questao2());        }
    static float questao2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade de camisas(1-5):");
        int quantidade = sc.nextInt();
        while (quantidade > 5 && quantidade < 1) {
            System.out.println("Digite um número válido(1-5):");
            quantidade = sc.nextInt();
        }

        float carrinho = quantidade * 30;
        System.out.println("Digite o estado que vc mora:");

         String estado = sc.next();

        System.out.println(estado);
                System.out.println(carrinho);

        if (estado != (String) "BA") {
            carrinho += 20;
        }
        return carrinho;  
    }
}
