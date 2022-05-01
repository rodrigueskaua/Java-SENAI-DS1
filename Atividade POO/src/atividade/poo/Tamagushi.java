/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade.poo;

import java.util.Scanner;

/**
 *
 * @author nasci
 */
public class Tamagushi {

    String nome;
    int fome;
    int tedio;
    int idade;

    public Tamagushi(String initNome, int initFome, int initTedio, int initIdade) {
        this.nome = initNome;
        this.fome = initFome;
        this.tedio = initTedio;
        this.idade = initIdade;

    }

    public String getNome() {
        return this.nome;
    }

    public int getFome() {
        return this.fome;
    }

    public int getTedio() {
        return this.tedio;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setTempoBrincadeira() {
        System.out.print("Digite o tempo de brincadeira (1 a 120 minutos): ");
        int tempo = validarInput(1, 120);
        if (tempo / 60 >= 1.5) {
            this.tedio = 2;
        } else if (tempo / 60 >= 1) {
            this.tedio = 4;
        } else if (tempo / 60 < 1) {
            this.tedio = 7;
        }
    }

    public void setQtdComida() {
        System.out.print("Digite a quantidade de comida (1 a 5): ");
        int qtdComida = validarInput(1, 5);
        this.fome -= qtdComida;
    }

    public int validarInput(int min, int max) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        while (num < min || num > max) {
            num = sc.nextInt();
            if (num < min || num > max) {
                System.out.print("ERRO!, Digite um número valido válida: ");

            }
        }
        return num;
    }

    public String getHumor() {
        String estadoAtual = "";
        double humor = (getFome() + getTedio()) / 2;
        if (humor > 10) {
            humor = 10;
        }

        if (humor >= 7) {
            estadoAtual = "\nEstou faminto e entediado\n";
        } else if (humor >= 5) {
            estadoAtual = "\nNão estou legal\n";

        } else if (humor >= 2) {
            estadoAtual = "\nEstou normal\n";

        } else if (humor < 2) {
            estadoAtual = "\nEstou muito bem\n%";

        }

        return estadoAtual;
    }

    public static void main(String[] args) {

        Tamagushi jubileu = new Tamagushi("Jubileu", 10, 10, 10);
        jubileu.setTempoBrincadeira();
        System.out.println(jubileu.getHumor());
        jubileu.setQtdComida();
        System.out.println(jubileu.getHumor());
        jubileu.setQtdComida();
        System.out.println(jubileu.getHumor());

        jubileu.setTempoBrincadeira();
        System.out.println(jubileu.getHumor());

    }

}
