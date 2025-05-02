package OrdenacaoListas;

import DesafiosAlura.ForeachEInstanceOf.desafio2.Animal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListasOrdenadas {
    public static void main(String[] args) {
        ArrayList<String> listaArtistas = new ArrayList<>();


        listaArtistas.add("Adam Sandler");
        listaArtistas.add("Paulin");
        listaArtistas.add("Pedro ");
        listaArtistas.add("Júlia");
        listaArtistas.add("Exigencio");

        //ordenar listas por ordens alfabéticas
        Collections.sort(listaArtistas);

        System.out.println(listaArtistas);

        //forma de escrever ArrayList
        List <Animal> list = new ArrayList<>();


    }
}
