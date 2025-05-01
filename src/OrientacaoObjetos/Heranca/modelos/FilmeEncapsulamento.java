package OrientacaoObjetos.Heranca.modelos;

public class FilmeEncapsulamento {
    private String nome;
    private String descricao;
    private int quantidadeAvaliacoes;
    private double mediaAvaliacao;
    private int somatorioAvaliacoes = 0;

    public int getSomatorioAvaliacoes() {
        return somatorioAvaliacoes;
    }

    public void setSomatorioAvaliacoes(int somatorioAvaliacoes) {
        this.somatorioAvaliacoes = somatorioAvaliacoes;
    }

    public FilmeEncapsulamento() {}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidadeAvaliacoes() {
        return quantidadeAvaliacoes;
    }

    public void setQuantidadeAvaliacoes(int quantidadeAvaliacoes) {
        this.quantidadeAvaliacoes = quantidadeAvaliacoes;
    }

    public double getMediaAvaliacao() {
        return mediaAvaliacao;
    }

    public void setMediaAvaliacao(double mediaAvaliacao) {
        this.mediaAvaliacao = mediaAvaliacao;
    }

    public void somaAvaliacoes(int nota) {
        quantidadeAvaliacoes ++;
        somatorioAvaliacoes += nota;
        double mediaAvaliacao = (double) somatorioAvaliacoes/quantidadeAvaliacoes;


        System.out.println("Nota avaliada:" + nota + "\nQuantidade de avaliações até o momento:" + quantidadeAvaliacoes +"\nMédia de avaliações: " + mediaAvaliacao + "\n");
    }



}
