package OrdenacaoListas.Desafios.desafio1;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Crie uma lista de números inteiros e utilize o
// método Collections.sort para ordená-la em ordem
//  crescente. Em seguida, imprima a lista ordenada.
public class NumerosOrdenados {
    public static void main(String[] args) {
        List <Integer> numerosInteiros = new ArrayList<>();

        numerosInteiros.add(2);
        numerosInteiros.add(5);
        numerosInteiros.add(19);
        numerosInteiros.add(25);
        numerosInteiros.add(10);
        numerosInteiros.add(21);
        numerosInteiros.add(24);
        numerosInteiros.add(6);

        Collections.sort(numerosInteiros);

        System.out.printf("Lista ordenada:\n" +numerosInteiros);
    }

}
