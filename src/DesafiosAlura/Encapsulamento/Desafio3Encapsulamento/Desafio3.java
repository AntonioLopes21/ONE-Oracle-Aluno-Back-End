package DesafiosAlura.Encapsulamento.Desafio3Encapsulamento;

//Desenvolva uma classe Produto com os atributos privados nome e preco. Utilize métodos getters e setters para acessar e modificar esses atributos. Adicione um método aplicarDesconto que recebe um valor percentual e reduz o preço do produto.
public class Desafio3 {
    public static void main(String[] args) {

        Produto p1 = new Produto();

        p1.setNome("HerbaLife");
        p1.setPreco(10);

        p1.aplicarDesconto();
    }

}

class Produto {

    private String nome;
    private double preco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void aplicarDesconto() {
        double valorPercentual = 0.2;

        double desconto = getPreco() * valorPercentual;
        double resultado = getPreco() - desconto;

        System.out.println( "O produto com o desconto de: " + getPreco() + " é de: " + resultado);
    }
}
