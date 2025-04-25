package DesafiosAlura.OrientacaoAObjetos.desafio4;

import javax.swing.*;

//4 - Crie uma classe Carro com atributos modelo, ano, cor e métodos para exibir a ficha técnica e calcular a idade do carro.
public class Carro {
    private String modelo;
    private int ano;
    private String cor;
    private int anoAtual = 2025;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void exibirFichaTecnica() {
        System.out.println("Modelo:" + getModelo());
        System.out.println("Ano:" + getAno());
        System.out.println("Cor:" + getCor());
    }

    public void idadeDoCarro() {
        int resultado = anoAtual - getAno();
        System.out.println("Seu carro tem:" + resultado + " Anos");
    }

}

class Main {
    public static void main(String[] args) {
        Carro porche = new Carro();

        porche.setModelo("GT");
        porche.setAno(2020);
        porche.setCor("Branco");

        porche.exibirFichaTecnica();
        porche.idadeDoCarro();
    }
}
