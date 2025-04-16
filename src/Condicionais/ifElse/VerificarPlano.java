package Condicionais.ifElse;

import java.util.Scanner;

public class VerificarPlano {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean incluidoNoPlano = true;

        System.out.println("Qual o tipo do plano?");
        String tipo = sc.nextLine();
        String tipoFormatado = tipo.toLowerCase();

        if(tipoFormatado.equals("plus") || incluidoNoPlano) {
            System.out.println("Aproveite seu plano plus!");
        } else {
            System.out.println("Você ainda não possui plano plus!");
        }
    }
}
