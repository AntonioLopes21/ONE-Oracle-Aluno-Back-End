package Condicionais.ifElse;

import java.util.Scanner;

public class Condicional {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o ano do seu nascimento:");
        int anoNascimento = scan.nextInt();

        System.out.println("Agora, digite o ano atual");
        int anoAtual = scan.nextInt();

        if((anoAtual - anoNascimento) < 18) {
            System.out.println("Você é menor de idade");
        } else {
            System.out.println("Você é maior de idade");
        }

        scan.close();

    }
}
