package desafios;

import java.util.Scanner;

public class ConversaoDolar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*Declare uma variável do tipo double valorEmDolares. Atribua um valor em dólares a essa variável. Considere que o valor de 1 dólar é equivalente a 4.94 reais. Realize a conversão do valor em dólares para reais e imprima o resultado formatado.*/
        double valorDolar = 4.96;

        System.out.println("Digite o valor em real: ");
        double valorReal = scan.nextDouble();

        double resultado = valorReal * valorDolar;
        System.out.println("O valor do real: " + resultado);


        scan.close();
    }
}
