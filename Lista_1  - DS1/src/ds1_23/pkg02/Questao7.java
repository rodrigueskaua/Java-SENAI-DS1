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
public class Questao7 {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Informe a altura de uma pessoa: ");
        double altura = sc.nextDouble();
        
        double media = altura;int acum = 1;

        while(altura >= 1.50){
            System.out.print("Informe + uma altura: ");            
            altura = sc.nextDouble();
            if(altura < 1.50){
                break;
            }
            media += altura;
            acum += 1;
            
        }
        System.out.println("ERRO!, Altura menor que 1.50m");

        media /= acum;
        System.out.println("\nPessoas cadastradas: " + acum);

        System.out.println("Média = " + media);

   
    }
}
