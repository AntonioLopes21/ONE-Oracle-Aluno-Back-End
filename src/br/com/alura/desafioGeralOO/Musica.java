package br.com.alura.desafioGeralOO;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;

public class Musica extends Audio {
    public ArrayList<Musica> minhasMusicas = new ArrayList<>();
    private int contadorCurtidas = 0;
    private int contadorReproducoes = 0;

    public void setContadorCurtidas(int contadorCurtidas) {
        this.contadorCurtidas = contadorCurtidas;
    }

    public void setContadorReproducoes(int contadorReproducoes) {
        this.contadorReproducoes = contadorReproducoes;
    }

    public int getContadorReproducoes() {
        contadorReproducoes += 1;
        return contadorReproducoes;
    }

    public int getContadorCurtidas() {
        contadorCurtidas += 1;
        return contadorCurtidas;
    }

    public void adicionarAListaDeMusicas(Musica music) {
        minhasMusicas.add(music);
        System.out.println("Música adicionada com sucesso!");
    }

    public void aumentarTotalReproducoes(Musica music) {
        this.contadorReproducoes +=1;
        System.out.println("Você está reproduzindo: " + music.getTitulo());
        System.out.println("Total de reproduções: " + contadorReproducoes);
    }

    public void adicionarCurtida(Musica music) {
        this.contadorCurtidas +=1;
        System.out.println("A música:" + music.getTitulo() + " acabou de receber uma curtida!\nTotal de curtidas:" + contadorCurtidas);
    }

    public void verificarClassificacao(Musica music) {
        if(minhasMusicas.contains(music)) {
            if(contadorReproducoes > 5) {
                System.out.println("A música:" + music.getTitulo() + " é a sua música favorita!");
                System.out.println("QUANTIDADE DE REPRODUÇÕES:");
                System.out.println(music.contadorReproducoes);
                System.out.println("QUANTIDADE DE CURTIDAS:");
                System.out.println(music.contadorCurtidas);

            } else if(music.getCurtidas() == 1) {
                System.out.println("A música:" + music.getTitulo() + " foi curtida pela primeira vez!");
                System.out.println("QUANTIDADE DE REPRODUÇÕES:");
                System.out.println(music.contadorReproducoes);
                System.out.println("QUANTIDADE DE CURTIDAS:");
                System.out.println(music.contadorCurtidas);

            } else {
                System.out.println("Você escutou:" + music.getTitulo() + " algumas vezes!");
                System.out.println("QUANTIDADE DE REPRODUÇÕES:");
                System.out.println(music.contadorReproducoes);
                System.out.println("QUANTIDADE DE CURTIDAS:");

                System.out.println(music.contadorCurtidas);

            }
        }
    }
}
