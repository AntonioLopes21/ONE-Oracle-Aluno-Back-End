package manipulacaoListas;

import OrientacaoObjetos.EncapsulamentoEHeranca.FilmeEncapsulamento;

import java.util.ArrayList;

public class ManipularLista {
    public static void main(String[] args) {
        FilmeEncapsulamento filme = new FilmeEncapsulamento("Filme");
        filme.setNome("Titanic");
        filme.setDescricao("um filme onde o barco afunda.");
        filme.setDuracaoEmMinutos(100);


        var meuFilme = new FilmeEncapsulamento("Filme");
        meuFilme.setDuracaoEmMinutos(300);
        meuFilme.setNome("CHIPS");
        meuFilme.setMediaAvaliacao(10);


        ArrayList<FilmeEncapsulamento> listaFilmes = new ArrayList<>();
        listaFilmes.add(meuFilme);
        listaFilmes.add(filme);

        System.out.println("Tamanho da lista:" + listaFilmes.size());
        System.out.println("Primeiro filme:" + listaFilmes.get(0).getNome());
        System.out.println("Ultimo filme:" + listaFilmes.get(listaFilmes.size() -1).getNome());
        System.out.println(listaFilmes.size() -1);


        int[] numeros = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i] = i + 1);
        }

    }
}


