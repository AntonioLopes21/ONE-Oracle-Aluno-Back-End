package desafios;

import java.util.Scanner;

public class JogoDaAdivinhacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int resposta = 4;
        int chute = 0;
        int tentativas = 0;

        do {
            System.out.println("Digite um número de 1 a 100\n\n");
            chute = sc.nextInt();
            tentativas = tentativas + 1;

            if (chute == resposta) {
                System.out.println("Parabéns! Você acertou! com " + tentativas + " tentativas!");
            } else {
                System.out.println("errou... tente novamente!");
            }

            if (chute < resposta) {
                System.out.println("O número é maior que " + chute + ".");
            } else if (chute > resposta) {
                System.out.println("O número é menor que " + chute + ".");
            }


        } while (chute != resposta);
    }
}
