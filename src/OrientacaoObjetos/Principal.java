package OrientacaoObjetos;

public class Principal {
    public static void main(String[] args) {
        Filme filme0 = new Filme();
        filme0.titulo = "Watch dogs";
        filme0.sinopse = "Game que prometeu muito na E3, apesar disso ainda é muito bom";
        filme0.incluidoNoPlano = true;
        filme0.anoLancamento = 2013;
        filme0.duracaoEmMinutos = 500;

        filme0.exibirFichaTecnica();

        filme0.somaAvaliacoes(10);
        filme0.somaAvaliacoes(5);
        filme0.somaAvaliacoes(3);
        filme0.somaAvaliacoes(10);


    }
}
