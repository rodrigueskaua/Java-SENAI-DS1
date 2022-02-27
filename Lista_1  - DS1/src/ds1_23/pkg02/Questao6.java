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
public class Questao6 {
    
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in); 
    int menor = 0,posicao = 0, num;
        for(int i = 0; i < 5; i++){
            System.out.printf("Digite o %dº numero: ", i+1);
            num = sc.nextInt();
                    
            if (i == 0 || num < menor){
                menor = num;
                posicao = i + 1;
            } 
         
        }
        
    System.out.printf("O %dº número digitado é o menor: %d", posicao, menor);

        
    }
    
}
