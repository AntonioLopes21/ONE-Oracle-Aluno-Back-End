package br.com.alura.screenmatchs.principal;

import br.com.alura.screenmatchs.modelos.Filme;
import br.com.alura.screenmatchs.modelos.Titulo;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class PrincipalComListas {
    public static void main(String[] args) {
        ArrayList<Titulo> listaAssistiveis = new ArrayList<>();

        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        meuFilme.avalia(10);
        Filme filme2 = new Filme("Avatar", 2023);
        filme2.avalia(6);
        var minhaSerie = new Filme("The big bang theory", 1923);
        minhaSerie.avalia(10);

        //variável de referência - polimorfismo
        Filme f1 = minhaSerie;

        listaAssistiveis.add(meuFilme);
        listaAssistiveis.add(filme2);
        listaAssistiveis.add(minhaSerie);

        //implementação foreach direto na lista
        listaAssistiveis.forEach(item -> System.out.println(item));

        //lista
        System.out.println("\n\n\nLista com for each diferenciado");
        listaAssistiveis.forEach(System.out::println);

        //foreach
        System.out.println("\n\n\nfor each fora da lista");
        for (Titulo item : listaAssistiveis) {
            System.out.println(item.getNome());

            if (item instanceof Filme) {
                System.out.println("Classificação: " + ((Filme) item).getClassificacao( ) );

            }
            Filme filme = (Filme) item;



        }




    }
}
