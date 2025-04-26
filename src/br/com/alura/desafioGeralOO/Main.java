package br.com.alura.desafioGeralOO;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Podcast> meusPodcasts = new ArrayList<>();

        Musica music = new Musica();


        music.setTitulo("Show me how");
        music.setDuracao(4.29);
        //adicionando música
        music.adicionarAListaDeMusicas(music);
        //alterando propriedades para teste
        music.aumentarTotalReproducoes(music);
        music.adicionarCurtida(music);
        music.adicionarCurtida(music);
        music.adicionarCurtida(music);
        music.adicionarCurtida(music);
        
        music.aumentarTotalReproducoes(music);
        music.aumentarTotalReproducoes(music);
        music.aumentarTotalReproducoes(music);


        music.verificarClassificacao(music);
    }

}
