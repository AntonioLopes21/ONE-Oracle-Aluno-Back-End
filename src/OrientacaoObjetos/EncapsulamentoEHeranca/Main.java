package OrientacaoObjetos.EncapsulamentoEHeranca;

public class Main {
    public static void main(String[] args) {
        FilmeEncapsulamento novoFilme = new FilmeEncapsulamento("Filme");

        novoFilme.setNome("Paulin o retorno");
        novoFilme.setDescricao("Filme lançamento de 2025");
        novoFilme.setQuantidadeAvaliacoes(0);
        //novoFilme.somaAvaliacoes(10);
        //novoFilme.somaAvaliacoes(5);
        //novoFilme.somaAvaliacoes(3);
        //novoFilme.somaAvaliacoes(1);
        novoFilme.setMediaAvaliacao(9);
        novoFilme.setMediaAvaliacao(9);
        novoFilme.setMediaAvaliacao(10);

        System.out.println(novoFilme.getNome());

        Serie twd = new Serie("Série", 5, 5, 40);
        twd.setNome("Série 1");
        twd.setDescricao("Série de zumbis que conquistou o público na ultima década.");
        twd.setQuantidadeAvaliacoes(0);
        //twd.somaAvaliacoes(10);
        //twd.somaAvaliacoes(7);
        //twd.somaAvaliacoes(9);
        twd.setMediaAvaliacao(10);
        twd.setMediaAvaliacao(9);
        twd.setMediaAvaliacao(4);
        twd.setMediaAvaliacao(3);

        twd.setTemporada(11);

        novoFilme.exibirFichaTecnica();
        twd.exibirFichaTecnica();

        //twd.setDuracaoEmMinutos(5, 5, 40);
        twd.duracaoDaSerieEmMinutos();

    }
}
