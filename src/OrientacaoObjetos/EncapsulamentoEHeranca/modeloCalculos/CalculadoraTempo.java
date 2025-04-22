package OrientacaoObjetos.EncapsulamentoEHeranca.modeloCalculos;

import OrientacaoObjetos.EncapsulamentoEHeranca.FilmeEncapsulamento;
import OrientacaoObjetos.EncapsulamentoEHeranca.Media;
import OrientacaoObjetos.EncapsulamentoEHeranca.Serie;

import java.util.ArrayList;
import java.util.List;

public class CalculadoraTempo {
    private int tempoTotal;
    private List<Media> listaFilmes = new ArrayList<>();


    public int getTempoTotal() {
        return tempoTotal;
    }

    public void inclui(Media filmeOuSerie) {
        int contador = 0;
        contador ++;

        if(filmeOuSerie instanceof FilmeEncapsulamento) {

            listaFilmes.add(filmeOuSerie);
            tempoTotal += filmeOuSerie.getDuracaoEmMinutos();
            System.out.println("🎬 Filme adicionado com sucesso!");
        } else if(filmeOuSerie instanceof Serie) {
            listaFilmes.add(filmeOuSerie);
            tempoTotal += filmeOuSerie.getDuracaoEmMinutos();
            System.out.println("📺 Série adicionada com sucesso!");
        }

        System.out.println("Você vai precisar de:" + tempoTotal + " minutos para assistir esses:" + contador + " conteúdos.");

    }
}
