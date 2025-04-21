package OrientacaoObjetos;

public class Filme {
    //abstração
    String titulo;
    String sinopse;
    int anoLancamento;
    boolean incluidoNoPlano;
    int avaliacao;
    int quantidadeAvaliacoes;
    int duracaoEmMinutos;
    int somatorioAvaliacoes = 0;


    public void exibirFichaTecnica() {
        System.out.println("Filme:" + this.titulo);
        System.out.println("Sinopse:" + this.sinopse);
        System.out.println("Ano de lançamento:" + this.anoLancamento);
        System.out.println("Número de avaliações:" + this.quantidadeAvaliacoes);
        System.out.println("Duração:" + this.duracaoEmMinutos);
        System.out.println("É incluido no plano?:" + this.incluidoNoPlano);
    }

    public void somaAvaliacoes(int nota) {
        quantidadeAvaliacoes ++;
        somatorioAvaliacoes += nota;
        double mediaAvaliacao = (double) somatorioAvaliacoes/quantidadeAvaliacoes;


        System.out.println("Nota avaliada:" + nota + "\nQuantidade de avaliações até o momento:" + quantidadeAvaliacoes +"\nMédia de avaliações: " + mediaAvaliacao + "\n");
    }
}
