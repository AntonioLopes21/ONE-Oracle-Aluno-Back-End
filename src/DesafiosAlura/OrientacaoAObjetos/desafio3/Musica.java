package DesafiosAlura.OrientacaoAObjetos.desafio3;
//3 - Crie uma classe Musica com atributos titulo, artista, anoLancamento, avaliacao e numAvaliacoes, e métodos para exibir a ficha técnica, avaliar a música e calcular a média de avaliações.
public class Musica {
    private String titulo;
    private String artista;
    private int anoLancamento;
    private int avaliacao;
    private int numAvaliacoes;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
    }

    public int getNumAvaliacoes() {
        return numAvaliacoes;
    }

    public void setNumAvaliacoes(int numAvaliacoes) {
        this.numAvaliacoes = numAvaliacoes;
    }

    void fichaTecnica() {
        System.out.println("Título: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Ano de lançamento: " + anoLancamento);
        System.out.println("Avaliação: " + avaliacao);
        System.out.println("Número de avaliações: " + numAvaliacoes);

    }
}

class Main {
    public static void main(String[] args) {
        Musica musico = new Musica();

        musico.setTitulo("É preciso dar um jeito");
        musico.setArtista("Rogerinho");
        musico.setAnoLancamento(2012);
        musico.setAvaliacao(10);
        musico.setNumAvaliacoes(1000);

        musico.fichaTecnica();
    }
}
