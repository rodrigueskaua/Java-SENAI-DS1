/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao3;

import java.util.Scanner;
import questao1.*;
import questao2.*;

/**
 *
 * @author nasci
 */
public class Teste {

    static int validarInput(int min, int max) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        while (num < min || num > max) {
            num = sc.nextInt();
            if (num < min || num > max) {
                System.out.print("ERRO!, Digite uma opção válida: ");

            }
        }
        return num;
    }

    public static void main(String[] args) {

        System.out.println("Digite 1 para NORMAL ou Digite 2 para ingresso VIP.");
        int Tipoingresso = validarInput(1, 2);

        if (Tipoingresso == 1) {
            System.out.println("Ingresso NORMAL selecionado");

            Ingresso ingressoNormal = new Ingresso(50);
            ingressoNormal.informacoesIngresso();

        } else if (Tipoingresso == 2) {
            System.out.println("Ingresso VIP selecionado\nDigite 1 ára Camarote Inferior ou digite 2 para o Camarote Superior");
            int tipoVip = validarInput(1, 2);

            if (tipoVip == 1) {
                CamaroteInferior ingressoVIP = new CamaroteInferior(50, 100, "Terreo");
                System.out.println("Ingresso *Camarote Inferior* selecionado.");
                ingressoVIP.informacoesIngresso();
            } else if (tipoVip == 2) {
                CamaroteSuperior ingressoVIP = new CamaroteSuperior(50, 100, 70);
                ingressoVIP.informacoesIngresso();
            }

        }

        System.out.println("Digite 1 para IMOVEL NOVO ou Digite 2 para IMOVEL VELHO.");
        int imovel = validarInput(1, 2);

        if (imovel == 1) {
            Novo casa = new Novo("Marcelino Garrido, N-720", 200000, 35000);
            casa.valorTotal();

        } else if (imovel == 2) {
            Velho casa = new Velho("Marcelino Garrido, N-720", 200000, 35000);
            casa.valorTotal();
        }

    }

}


