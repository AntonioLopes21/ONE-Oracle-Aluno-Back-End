package DesafiosAlura.Encapsulamento.Desafio1Encapsulamento;

//Crie uma classe ContaBancaria com os seguintes atributos: numeroConta (privado), saldo (privado) e titular (publico). Implemente métodos getters e setters para os atributos privados.
public class Desafio1 {
    public static void main(String[] args) {

    }
}

class Conta {
    private int numeroConta;
    private int saldo;
    public String titularNome;

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public int getSaldo() {
        return saldo;
    }

    public String getTitularNome() {
        return titularNome;
    }

    public void setTitularNome(String titularNome) {
        this.titularNome = titularNome;
    }
}
