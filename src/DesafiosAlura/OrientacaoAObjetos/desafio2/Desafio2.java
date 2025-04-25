package DesafiosAlura.OrientacaoAObjetos.desafio2;

//2 - Crie uma classe Calculadora com um método que recebe um número como parâmetro e retorna o dobro desse número.
public class Desafio2 {
    public static void main(String[] args) {
        CalculadoraMultiplicativa calc = new CalculadoraMultiplicativa();
        System.out.println(calc.multiplicarPorDois(3));
    }

}

class CalculadoraMultiplicativa {
    private int valor1;
    public int getValor1() {
        return valor1;
    }

    public void setValor1(int valor1) {
        this.valor1 = valor1;
    }


    public String multiplicarPorDois(int valor1) {
        int resultado = valor1 *2;

        return "O número:" + valor1 + " x 2 = " + resultado;
    }
}
