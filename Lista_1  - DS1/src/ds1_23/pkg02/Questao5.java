/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds1_23.pkg02;

import java.util.Scanner;

/**
 *
 * @author nasci
 */
public class Questao5 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Digite o 1º numero: ");
    float num1 = sc.nextFloat();
    
    System.out.print("Digite o 2º numero: ");
    float num2 = sc.nextFloat();
    
    System.out.print("informe a operação aritmética desejada: (1) Multiplicação ou (2) Divisão");
    int operacao = 0;
    while (operacao != 1 && operacao != 2){
        operacao = sc.nextInt();
         if(operacao == 1 || operacao == 2){
            break;}
        System.out.println("ERRO!, Digite uma opção valida (1 ou 2): ");
        }
  
    
    if (operacao == 1){
        System.out.print("\nResultado da Multiplicação: ");
        System.out.println(multiplicacao(num1,num2));

        }
    else{
        System.out.print("\nResultado da Divisão: ");
        System.out.println(divisao(num1,num2));
        }
    }

    static float multiplicacao(float num1, float num2){
        return num1 * num2;
    }
    
    static float divisao(float num1, float num2){
        return num1 / num2;
    }
}
