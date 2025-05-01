package OrientacaoObjetos.EncapsulamentoEHeranca;

import OrientacaoObjetos.EncapsulamentoEHeranca.modeloCalculos.FiltroRecomendacao;
import OrientacaoObjetos.EncapsulamentoEHeranca.modelos.Serie;

public class Main {
    public static void main(String[] args) {

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        Serie twd = new Serie("The last of us", "Série", 5, 50, 40);
        Episodio episodio = new Episodio();

        episodio.setNumero(1);
        episodio.setSerie(twd);
        episodio.setTotalVisualizacoes(10);

        filtro.filtraFilme(episodio);

        //FilmeEncapsulamento filme = new FilmeEncapsulamento("Filme");
//        filme.setMediaAvaliacao(9);
//        filme.setMediaAvaliacao(9);
//        filme.setMediaAvaliacao(6);
//        filme.getMediaAvaliacao();
//        filtro.filtraFilme(filme);
//
//        filme.setMediaAvaliacao(10);
//
//        filtro.filtraFilme(filme);





//        FilmeEncapsulamento novoFilme = new FilmeEncapsulamento("Filme");
//
//        novoFilme.setNome("Paulin o retorno");
//        novoFilme.setDescricao("Filme lançamento de 2025");
//        novoFilme.setQuantidadeAvaliacoes(0);
//        novoFilme.setDuracaoEmMinutos(500);
//        //novoFilme.somaAvaliacoes(10);
//        //novoFilme.somaAvaliacoes(5);
//        //novoFilme.somaAvaliacoes(3);
//        //novoFilme.somaAvaliacoes(1);
//        novoFilme.setMediaAvaliacao(9);
//        novoFilme.setMediaAvaliacao(9);
//        novoFilme.setMediaAvaliacao(10);
//
//        System.out.println(novoFilme.getNome());
//
//        Serie twd = new Serie("Série", 5, 5, 40);
//        twd.setNome("Série 1");
//        twd.setDescricao("Série de zumbis que conquistou o público na ultima década.");
//        twd.setQuantidadeAvaliacoes(0);
//        //twd.somaAvaliacoes(10);
//        //twd.somaAvaliacoes(7);
//        //twd.somaAvaliacoes(9);
//        twd.setMediaAvaliacao(10);
//        twd.setMediaAvaliacao(9);
//        twd.setMediaAvaliacao(4);
//        twd.setMediaAvaliacao(3);
//
//        twd.setTemporada(11);
//
//        novoFilme.exibirFichaTecnica();
//        twd.exibirFichaTecnica();
//
//        //twd.setDuracaoEmMinutos(5, 5, 40);
//        twd.duracaoDaSerieEmMinutos();
//
//        CalculadoraTempo calc = new CalculadoraTempo();
//        calc.inclui(novoFilme);
//        calc.inclui(twd);

    }
}
