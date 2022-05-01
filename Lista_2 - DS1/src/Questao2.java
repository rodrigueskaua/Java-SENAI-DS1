
import java.util.Scanner;

public class Questao2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o digito do voo que gostaria de realizar:\n[ 1 ] Salvador-Frankfurt\n[ 2 ] Salvador-Tóquio\n[ 3 ] Frankfurt-Tóquio");
        int rotaVoo = validarInput(1, 3);
        float distanciaVoo;

        if (rotaVoo == 1) {
            distanciaVoo = 8377;
        } else if (rotaVoo == 1) {
            distanciaVoo = 17474;
        } else {
            distanciaVoo = 9330;
        }
        System.out.println("\nInforme o digito da classe que irá viajar:\n[ 1 ] Econômica\n[ 2 ] Executiva\n[ 3 ] Primeira Classe");
        int classeVoo = validarInput(1, 3);

        System.out.println("\nInforme a quantidade de passageiros que farão a viagem:");
        int qtdPassageiros = sc.nextInt();

        System.out.printf("Valor total: %.2f\n", calcularPreco(qtdPassageiros, classeVoo, distanciaVoo));

    }

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

    static double calcularPreco(int qtdPassageiros, int classeVoo, float distanciaVoo) {
        double precoTotal = (distanciaVoo / 5) * qtdPassageiros;

        if (classeVoo == 2) {
            precoTotal += precoTotal * 0.10;
        } else if (classeVoo == 3) {
            precoTotal += precoTotal * 0.20;

        }

        return precoTotal;
    }

}
