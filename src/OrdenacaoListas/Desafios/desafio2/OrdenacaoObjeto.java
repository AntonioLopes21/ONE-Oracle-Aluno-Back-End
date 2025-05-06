package OrdenacaoListas.Desafios.desafio2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Crie uma classe Titulo com um atributo nome
// do tipo String. Implemente a interface Comparable
// na classe para que seja possível ordenar uma lista
// de objetos Titulo.
public class OrdenacaoObjeto {
    public static void main(String[] args) {
        List <Titulo> listaDeTitulos = new ArrayList<>();

        Titulo novoTitulo = new Titulo("Luis");
        Titulo novoTitulo1 = new Titulo("Anderson");
        Titulo novoTitulo2 = new Titulo("yago");
        Titulo novoTitulo3 = new Titulo("Pedro");

        listaDeTitulos.add(novoTitulo);
        listaDeTitulos.add(novoTitulo1);
        listaDeTitulos.add(novoTitulo2);
        listaDeTitulos.add(novoTitulo3);

        System.out.println("desordenada:" + listaDeTitulos);

        Collections.sort(listaDeTitulos);

        System.out.println("Ordenada:" + listaDeTitulos);

    }
}

class Titulo implements Comparable<Titulo>{
    private String nome;

    public Titulo (String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    @Override
    public int compareTo(Titulo outroTitulo) {

        return nome.compareTo(outroTitulo.getNome());
    }

    @Override
    public String toString() {
        return this.nome;
    }
}
