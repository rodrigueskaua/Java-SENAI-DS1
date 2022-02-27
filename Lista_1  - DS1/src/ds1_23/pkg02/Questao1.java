/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds1_23.pkg02;

import java.util.Scanner;
import java.text.DecimalFormat;
public class Questao1 {

    public static void main(String[] args) {
        // TODO code application logic here

        Scanner sc = new Scanner(System.in);
        DecimalFormat formatador = new DecimalFormat("0.00");

        System.out.println("Insira as notas");

        double[] v = new double[3];
        double media = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println((i + 1) + "ª Nota");
            v[i] = sc.nextDouble();
            media += v[i];
        }
        media = media / 3;

    String conceito;
        if (media > 9.0){
            conceito = "A";}
        
        else if (media >= 8 && media < 9){
            conceito = "B";}
        
        else if (media >= 7 && media < 8){
            conceito = "C";} 
        
        else if (media >= 6 && media < 7){
            conceito = "D";}
        
        else {
            conceito = "F";
        }
        System.out.println("Média = " + formatador.format(media) + "\nConceito: " + conceito);

    }

}


