package DesafiosAlura.Construtores.desafio1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List <Produto> produtos = new ArrayList<>();

        try {


        Produto novoVeja = new Produto("Veja", 10.55, 15);
        Produto doritos = new Produto("Doritos", 15.30, 24);

        produtos.add(novoVeja);
        produtos.add(doritos);

            System.out.println(produtos);

            System.out.println("Tamanho da lista: " + produtos.size());
        System.out.println(produtos.get(produtos.toArray().length -1).getNome());
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Indíce não existente.\n" + e.getMessage());
        }

        ProdutoPerecivel produtovencivel = new ProdutoPerecivel("danone", 5.99, 15, "23/10/2000");
    }
}
