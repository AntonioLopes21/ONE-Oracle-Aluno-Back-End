package OrientacaoObjetos.Heranca.modelos;

import OrientacaoObjetos.EncapsulamentoEHeranca.modelos.FilmeEncapsulamento;
import OrientacaoObjetos.EncapsulamentoEHeranca.modelos.Serie;

public class Primary {
    public static void main(String[] args) {
        FilmeEncapsulamento novoFilme = new FilmeEncapsulamento("The big bang theory", "Série");

        novoFilme.setNome("Paulin o retorno");
        novoFilme.setDescricao("Filme lançamento de 2025");
        novoFilme.setQuantidadeAvaliacoes(0);
        novoFilme.somaAvaliacoes(10);
        novoFilme.somaAvaliacoes(5);
        novoFilme.somaAvaliacoes(3);
        novoFilme.somaAvaliacoes(1);

        //herança de filme
        SerieHeranca novaSerie = new SerieHeranca();
        System.out.println(novoFilme.getNome());


        var filmeFavorito = new Serie("The simpsons", "Série", 20, 30, 15);
    }
}
