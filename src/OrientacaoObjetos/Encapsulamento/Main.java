package OrientacaoObjetos.Encapsulamento;

public class Main {
    public static void main(String[] args) {
        FilmeEncapsulamento novoFilme = new FilmeEncapsulamento();

        novoFilme.setNome("Paulin o retorno");
        novoFilme.setDescricao("Filme lançamento de 2025");
        novoFilme.setQuantidadeAvaliacoes(0);
        novoFilme.somaAvaliacoes(10);
        novoFilme.somaAvaliacoes(5);
        novoFilme.somaAvaliacoes(3);
        novoFilme.somaAvaliacoes(1);



        System.out.println(novoFilme.getNome());

    }
}
