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
public class Questao4 {
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Você vai passar em DS1? (0 ou 1)");
        int resposta = 2;
        
        while (resposta != 0 && resposta != 1){
            resposta = sc.nextInt();
            if(resposta == 0 || resposta == 1){
            break;}
            System.out.println("ERRO!, Digite uma opção valida (0 ou 1): ");
        }
        
        if (resposta == 0){
            System.out.println("Parabéns.");
        
        }
        
        else{
        System.out.println("Estude mais.");

        }
    }
    
    
}
