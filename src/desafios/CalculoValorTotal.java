package desafios;

public class CalculoValorTotal {
    /*Declare uma variável do tipo double precoProduto e uma variável do tipo int (quantidade). Calcule o valor total multiplicando o preço do produto pela quantidade e apresente o resultado em uma mensagem.*/
    public static void main(String[] args) {
        double precoProduto = 10.50;
        int quantidade = 15;

        double valorTotal = precoProduto * quantidade;
        System.out.println("o valor total do produto: " + valorTotal);
    }
}
