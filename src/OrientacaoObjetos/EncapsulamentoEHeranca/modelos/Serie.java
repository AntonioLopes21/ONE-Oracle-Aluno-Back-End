package OrientacaoObjetos.EncapsulamentoEHeranca.modelos;

public class Serie extends Media{
    int temporada;
    private boolean ativa;
    private int episodiosPorTemporada;
    private int quantidadeDeTemporadas;
    private int tempoDeEpisodio;

    public Serie(String nome, String tipoMedia, int episodiosPorTemporada, int quantidadeDeTemporadas, int tempoDeEpisodioEmMinutos) {
        super(nome, tipoMedia);
        this.episodiosPorTemporada = episodiosPorTemporada;
        this.quantidadeDeTemporadas = quantidadeDeTemporadas;
        this.tempoDeEpisodio = tempoDeEpisodioEmMinutos;
    }

    public int getQuantidadeDeTemporadas() {
        return quantidadeDeTemporadas;
    }

    public void setQuantidadeDeTemporadas(int quantidadeDeTemporadas) {
        this.quantidadeDeTemporadas = quantidadeDeTemporadas;
    }

    public int getTempoDeEpisodio() {
        return tempoDeEpisodio;
    }

    public void setTempoDeEpisodio(int tempoDeEpisodio) {
        this.tempoDeEpisodio = tempoDeEpisodio;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    @Override
    public int getDuracaoEmMinutos() {
        return episodiosPorTemporada * quantidadeDeTemporadas * tempoDeEpisodio;
    }
    //duracaoEmMinutos

    //public void setDuracaoEmMinutos(int quantidadeEpisodiosPorTemporada, int quantidadeDeTemporadas, int tempoDeCadaEpisodio) {
    //    this.episodiosPorTemporada = quantidadeEpisodiosPorTemporada;
    //    this.quantidadeDeTemporadas = quantidadeDeTemporadas;
    //    this.tempoDeEpisodio = tempoDeCadaEpisodio;

    //    int duracaoEmMinutos = (tempoDeCadaEpisodio * quantidadeEpisodiosPorTemporada)* quantidadeDeTemporadas;
    //    System.out.println("A duração total em minutos para a série:" + this.getNome() + " é de:" + duracaoEmMinutos + " minutos.");
    //}

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getTemporada() {
        return temporada;
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }

    public void duracaoDaSerieEmMinutos() {
            //this.episodiosPorTemporada = quantidadeEpisodiosPorTemporada;
            //this.quantidadeDeTemporadas = quantidadeDeTemporadas;
            //this.tempoDeEpisodio = tempoDeCadaEpisodio;
            //int duracaoEmMinutos = (tempoDeCadaEpisodio * quantidadeEpisodiosPorTemporada)* quantidadeDeTemporadas;

        System.out.println("A duração total em minutos para a série:" + this.getNome() + " é de:" + this.getDuracaoEmMinutos() + " minutos.");
        }
}
