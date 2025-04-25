package OrientacaoObjetos.EncapsulamentoEHeranca;

import OrientacaoObjetos.EncapsulamentoEHeranca.modeloCalculos.Classificavel;

public class FilmeEncapsulamento extends Media implements Classificavel {
    private String diretor;

    public FilmeEncapsulamento(String tipoMedia) {
        super(tipoMedia);
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
