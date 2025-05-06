package DesafiosAlura.Construtores.desafio1;


//Crie uma classe Produto com atributo
// s como nome, preco, e quantidade.
// Em seguida, crie uma lista de objetos
// Produto utilizando a classe ArrayList.
// Adicione alguns produtos,
// imprima o tamanho da lista
// e recupere um produto pelo índice.

//2. //Implemente o método toString() na classe Produto para retornar uma representação em texto do objeto.
/// / Em seguida, imprima a lista de produtos utilizando o método System.out.println().
public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade ) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public int getQuantidade() {
        return quantidade;

    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "Nome do produto: " + nome +
                "\nPreço do produto: " + preco +
                "\nQuantidade do produto: " + quantidade + "\n\n\n";
    }
}
