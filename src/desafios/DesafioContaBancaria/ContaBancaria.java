package desafios.DesafioContaBancaria;

import java.util.Scanner;

class ContaBancaria {
    double saldo = 0;
    String tipoConta;

    public ContaBancaria() {}
    Scanner sc = new Scanner(System.in);

    public ContaBancaria(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public void informacoesCrud(int acao) {
        System.out.println("1 - Consultar saldo\n" +
                "2 - Receber valor\n" +
                "3 - Transferir valor\n" +
                "4 - Sair");
    }


    public void informacoesSaldo() {
        System.out.println("********************************************");
        System.out.println("Tipo de conta: " + tipoConta);
        System.out.println("Saldo: " + saldo);
        System.out.println("********************************************");

    }

    public void receberValor(double valor) {
        System.out.println("Digite o valor que deseja colocar na conta:");
        valor = sc.nextDouble();

        if (valor <= 0) {
            System.out.println("Você não pode depositar um valor negativo para sua conta." +
                    "\nSaldo: R$ " + valor);
        } else {
            saldo += valor;
            System.out.println("Valor recebido com sucesso.\n" +
                    "Saldo: R$ " + saldo);
        }
    }

    public void sacarValor(double valor) {

        System.out.println("Digite o valor que deseja sacar:");
        valor = sc.nextDouble();

        if (valor <= 0) {
            System.out.println("Você não pode sacar um valor negativo");
        } else {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso.\nR$" + saldo);
        }
    }

    public void acoesRealizadas(ContaBancaria conta) {
        boolean escolha = true;
        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("Bem vindo ao Banco! O que você deseja realizar:");
            int resposta = sc.nextInt();
            conta.informacoesCrud(resposta);

            switch (resposta) {
                case 1:
                    System.out.println("************************************" +
                            "\nConsulta de saldo:\n");
                    conta.informacoesSaldo();
                    System.out.println("************************************");
                    break;

                case 2:
                    System.out.println("************************************" +
                            "\nReceber valor:\n");
                    conta.receberValor(conta.saldo);
                    System.out.println("************************************");
                    break;

                case 3:
                    System.out.println("************************************");
                    System.out.println("Transferir valor:\n");
                    conta.sacarValor(conta.saldo);
                    System.out.println("************************************");
                    break;

                case 4:
                    System.out.println("************************************");
                    escolha = false;
                    System.out.println("Obrigado por utilizar nosso serviço de bancos!");
                    System.out.println("************************************");

                    break;

                default:
                    System.out.println("\n\nOpção inválida. Digite novamente...\n\n");
                    break;


            }
        }while(escolha);

        sc.close();
    }
}




