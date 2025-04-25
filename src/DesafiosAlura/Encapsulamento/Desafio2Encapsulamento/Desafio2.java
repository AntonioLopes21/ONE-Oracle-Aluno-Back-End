package DesafiosAlura.Encapsulamento.Desafio2Encapsulamento;
//Crie uma classe IdadePessoa com os atributos privados nome e idade. Utilize métodos getters e setters para acessar e modificar esses atributos. Adicione um método verificarIdade que imprime se a pessoa é maior de idade ou não.

public class Desafio2 {
    public static void main(String[] args) {
        Pessoa davi = new Pessoa();

        davi.setNome("Davi");
        davi.setIdade(18);
        davi.verificarIdade();
    }
}

class Pessoa {
    private String nome;
    private int idade;

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

    public void verificarIdade() {
        int idadeAtual = getIdade();

        if(idadeAtual >= 18) {
            System.out.println("É maior de idade");
        } else {
            System.out.println("É menor de idade");
        }
    }
}
