package Condicionais.ifElse;

import java.util.Scanner;

public class VerificarMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double somaNotas = 0;
        double novaNota = 0;
        int contador = 0;
        double media = 0;
        int i;

        for (i = 0; i < 3; i++) {
            if(i < 3 ) {
                System.out.println("Digite a " + (contador + 1) + "° nota.");
                novaNota = scan.nextInt();
                somaNotas += novaNota;
            }
            contador ++;
        }
        //calculo da média
        media = somaNotas / i;

        if (media >= 7) {
            System.out.println("Aluno Aprovado!");
        } else if (media >= 5 && media < 7) {
            System.out.println("Aluno em Recuperação...");
        } else {
            System.out.println("Aluno Reprovado!");
        }


        System.out.printf("A média do aluno foi: %.2f", media);
    }
}
