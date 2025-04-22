package OrientacaoObjetos.EncapsulamentoEHeranca;

public class Media {
    private String nome;
    private String descricao;
    private String tipoMedia;
    private int quantidadeAvaliacoes;
    private double mediaAvaliacao;
    private int duracaoEmMinutos;
    private int somatorioAvaliacoes = 0;


    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public String getTipoMedia() {
        return tipoMedia;
    }

    public void setTipoMedia(String tipoMedia) {
        this.tipoMedia = tipoMedia;
    }

    public int getSomatorioAvaliacoes() {
        return somatorioAvaliacoes;
    }

    public void setSomatorioAvaliacoes(int somatorioAvaliacoes) {
        this.somatorioAvaliacoes = somatorioAvaliacoes;
    }

    public Media(String tipoMedia) {
        this.tipoMedia = tipoMedia;
    }

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

    public void setMediaAvaliacao(int nota) {
        quantidadeAvaliacoes ++;
        somatorioAvaliacoes += nota;
        mediaAvaliacao = (double) somatorioAvaliacoes/quantidadeAvaliacoes;


        System.out.println("Nota avaliada:" + nota + "\nQuantidade de avaliações até o momento:" + quantidadeAvaliacoes +"\nMédia de avaliações: " + mediaAvaliacao + "\n");
    }

    public void somaAvaliacoes(int nota) {
        quantidadeAvaliacoes ++;
        somatorioAvaliacoes += nota;
        mediaAvaliacao = (double) somatorioAvaliacoes/quantidadeAvaliacoes;
        System.out.println("Nota avaliada:" + nota + "\nQuantidade de avaliações até o momento:" + quantidadeAvaliacoes +"\nMédia de avaliações: " + mediaAvaliacao + "\n");
    }

    public void exibirFichaTecnica() {
        System.out.println("Nome:" + this.nome);
        System.out.println("Tipo de Mídia:" + tipoMedia);
        System.out.println("Descrição:" + this.descricao);
        System.out.println("Quantidade de valiações:" + this.quantidadeAvaliacoes);
        System.out.println("Média de avaliações:" + this.mediaAvaliacao);

    }



}
