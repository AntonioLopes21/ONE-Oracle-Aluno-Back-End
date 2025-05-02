package DesafiosAlura.ForeachEInstanceOf.desafio1;

import java.util.ArrayList;

//Crie um ArrayList de strings e utilize um loop foreach para percorrer e imprimir cada elemento da lista.
public class Desafio1 {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();

        lista.add("Paulo");
        lista.add("Sergio");
        lista.add("luiza");
        lista.add("miranda");

        for(String nome : lista) {
            System.out.println(nome);
        }

    }
}
