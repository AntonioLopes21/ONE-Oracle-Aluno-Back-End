package DesafiosAlura.ForeachEInstanceOf.desafio4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto();
        ArrayList <Produto> listaProdutos = new ArrayList<>();
        double valorTotal = 0;

        produto.setNome("Pumpers");
        produto.setPreco(80);

        Produto produto2 = new Produto();
        produto2.setNome("Veja");
        produto2.setPreco(21);

        listaProdutos.add(produto);
        listaProdutos.add(produto2);

        for(Produto item : listaProdutos) {
            int divisaoProduto = listaProdutos.size();
            valorTotal += item.getPreco();
            double valorMedio = valorTotal / divisaoProduto;
            System.out.println("Valor total dos produtos:" + valorTotal);
            System.out.println("A média dos produtos foi de:" + valorMedio);

        }



    }
}
