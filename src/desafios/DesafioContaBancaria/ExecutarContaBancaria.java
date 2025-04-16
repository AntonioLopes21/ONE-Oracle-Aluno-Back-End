package desafios.DesafioContaBancaria;

import java.util.Scanner;

public class ExecutarContaBancaria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


            System.out.println("Bem vindo ao Banco! Deseja uma:\n1 - conta corrente\n ou \n2 - poupança?");
            int resposta = sc.nextInt();

            if (resposta == 1) {
                ContaBancaria conta = new ContaBancaria("Conta corrente");
                conta.acoesRealizadas(conta);
            } else if (resposta == 2) {
                ContaBancaria conta = new ContaBancaria("Conta poupança");
                conta.acoesRealizadas(conta);

            }




        sc.close();
    }
}


