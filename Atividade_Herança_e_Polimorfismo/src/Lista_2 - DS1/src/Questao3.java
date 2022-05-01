
import java.util.Scanner;

public class Questao3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float precoTotal = 0;

        System.out.println("Informe o que deseja comer:\n[ D ] Doce\n[ S ] Salgado\n[ Z ] Sair");
        char opcaoMenu = 'u';
        while (opcaoMenu != 'D' && opcaoMenu != 'S' && opcaoMenu != 'Z') {
            opcaoMenu = sc.next().charAt(0);
            if (opcaoMenu != 'D' && opcaoMenu != 'S' && opcaoMenu != 'Z') {
                System.out.print("ERRO!, Digite uma opção válida: ");

            }

        }
        
        if (opcaoMenu == 'D'){
        precoTotal += menuDoce();
        }
        else if(opcaoMenu == 'S'){
           precoTotal += menuSalgado();

        }
            
        System.out.printf("Preço total: R$%.2f\n", precoTotal);
        
    }

    static float menuDoce() {
        System.out.println("Menu Doce:\n[ 1 ] Brigadeiro\n[ 2 ] Cocada\n[ 3 ] Pé-de-moleque");
        validarInput(1,3);
        return 2;
    }
    
    static float menuSalgado() {
        System.out.println("Menu Salgado:\n[ 1 ] Pastel\n[ 2 ] Empada\n[ 3 ] Coxinha\n[ 4 ] Esfirra");
        int opcao = validarInput(1,4);
        
        if(opcao == 1 || opcao == 2){
            return 5;
        }
        else{
            return 3;

        }
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
}
