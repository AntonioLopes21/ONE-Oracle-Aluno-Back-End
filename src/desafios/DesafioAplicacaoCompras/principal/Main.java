package desafios.DesafioAplicacaoCompras.principal;

import desafios.DesafioAplicacaoCompras.modelos.CartaoCredito;
import desafios.DesafioAplicacaoCompras.modelos.Compra;
import desafios.DesafioAplicacaoCompras.modelos.Produto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List <CartaoCredito> listaDeCartoes = new ArrayList<>();

        CartaoCredito cartao = new CartaoCredito();
        Compra compra = new Compra();

        boolean loop = true;


        do {
            System.out.println("Bem vindo ao sistema de compras!\n1 - Criar cartão\n2 - realizar compra\n3 - verificar extrato do cartão\n4 - sair do programa");
            int opcao = scan.nextInt();
            scan.nextLine();

            switch(opcao) {
                case 1:
                    System.out.println("Criar Cartão:");

                    System.out.println("Digite o nome do seu cartão de crédito:");
                    cartao.setNomeCartao(scan.nextLine());

                    System.out.println("Digite o limite do seu cartão: ");
                    cartao.setLimite(scan.nextDouble());
                    scan.nextLine();

                    listaDeCartoes.add(cartao);
                break;

                case 2:
                    Produto produto = new Produto();
                    System.out.println("Digite o nome do Produto:");
                    produto.setNome(scan.nextLine());

                    System.out.println("Digite o preço do produto: ");
                    produto.setPreco(scan.nextDouble());

                    compra.comprar(cartao, produto);
                break;

                case 3:
                    System.out.println("EXTRATO:");
                    compra.exibirExtrato();
                break;

                case 4:
                    System.out.println("Obrigado por utilizar o programa!");
                    loop = false;
                break;

            }

        } while (loop);
    }
}
