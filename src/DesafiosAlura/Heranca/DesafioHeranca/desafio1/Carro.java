package DesafiosAlura.Heranca.DesafioHeranca.desafio1;

//1 - Crie uma classe Carro com métodos para representar um modelo específico ao longo de três anos. Implemente métodos para definir o nome do modelo, os preços médios para cada ano,
// e calcular e exibir o menor e o maior preço. Adicione uma subclasse ModeloCarro
// para criar instâncias específicas, utilizando-a na classe principal para definir preços e mostrar informações.
public class Carro {
    private String modelo;
    private double preco;
    int anoRecorrente;

    public Carro() {}

    public Carro(String modelo, double preco) {
        this.modelo = modelo;
        this.preco = preco;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getAnoRecorrente() {
        return anoRecorrente;
    }

    public void setAnoRecorrente(int anoRecorrente) {
        this.anoRecorrente = anoRecorrente;
    }

    public void alterarDadosVeiculo(String modelo, double preco) {
        this.modelo = modelo;
        this.preco = preco;
    }

    public void compararValoresVeiculos(Carro carro1, Carro carro2) {
        int resultado = (int) carro1.getPreco() - (int) carro2.getPreco();
        anoRecorrente = 1;

        if(carro1.getPreco() > carro2.getPreco()) {
            System.out.println("O valor do carro:" + carro1.getModelo() + " é maior que o do " + carro2.getModelo());
            System.out.println("Diferença de valores:" + resultado);

            System.out.println("\n\nCarro de maior preço: " + carro1.getModelo() + "\nValor do veículo: " + carro1.getPreco());
            System.out.println("\n\nCarro de menor preço: " + carro2.getModelo() + "\nValor do veículo: " + carro2.getPreco());

        } else if(carro2.getPreco() > carro1.getPreco()){
            System.out.println("O valor do carro:" + carro2.getModelo() + " é maior que o do " + carro1.getModelo());
            System.out.println("Diferença de valores:" + resultado);

            System.out.println("\n\nCarro de maior preço: " + carro2.getModelo() + "\nValor do veículo: " + carro2.getPreco());
            System.out.println("\n\nCarro de menor preço: " + carro1.getModelo() + "\nValor do veículo: " + carro1.getPreco());

        }

        System.out.println("A variação com relação ao ano é de:" +  " R$:" + resultado);
        anoRecorrente ++;

    }
}


