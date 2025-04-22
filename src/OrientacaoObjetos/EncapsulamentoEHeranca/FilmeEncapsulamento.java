package OrientacaoObjetos.EncapsulamentoEHeranca;

public class FilmeEncapsulamento extends Media{
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
}
