package OrientacaoObjetos.EncapsulamentoEHeranca.modelos;

import OrientacaoObjetos.EncapsulamentoEHeranca.modeloCalculos.Classificavel;

public class FilmeEncapsulamento extends Media implements Classificavel {
    private String diretor;

    public FilmeEncapsulamento(String nome, String tipoMedia) {
        super(nome, tipoMedia);
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }


    //polimorfismo
    @Override
    public int getClassificacao() {
        return (int) getMediaAvaliacao() /2;
    }
}
