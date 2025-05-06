package manipulacaoListas.desafiosManipularListas.desafio1;


//1 - Crie uma classe Pessoa com atributos como nome, idade, e um método toString que represente esses atributos.
public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa() {}

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Nome:" + this.nome + "\nIdade:" + this.idade;
    }
}
