/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds1_23.pkg02;

import java.util.Scanner;

/*
2) Luffy está comprando camisas online. O preço unitário da camisa que ele
gostou é R$ 30,00.
● Peça para Luffy informar a quantidade de camisas que ele deseja
comprar. Permita somente entre 1 e 5 unidades. Não avance até uma
quantidade válida seja informada.
● Peça para Luffy informar a sigla do Estado onde ele está. Caso seja
“BA”, não há frete. Caso seja outro Estado, o frete é de R$ 20,00.
● Exiba o preço final da compra.
 */
public class Questao2 {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int qtd = 0;
        System.out.print("Digite a quantidade de camisa(s) que deseja comprar: ");
        while (qtd < 1 || qtd > 5 ){
            qtd = sc.nextInt();
            if (qtd < 1 || qtd > 5 ){
            System.out.print("ERRO!, Digite uma quantidade de camisa(s) valida: ");}

        }
        System.out.print("Informe a sigla do seu estado: ");
        sc.nextLine();
        String estado = sc.nextLine();
        
        double frete = 20.00;
        if (estado == "BA" || estado == "ba"){
            frete = 0;
            System.out.println("Estado (BA) identificado \nFRETE GRÁTIS APLICADO");
        }
        
        double valorTotal = 30 * qtd + frete;
        System.out.println("Valor total: " + valorTotal);
        
    }
        
}
    

