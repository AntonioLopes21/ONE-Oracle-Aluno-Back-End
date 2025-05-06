package manipulacaoListas.desafiosManipularListas.desafio1;

import java.util.ArrayList;
import java.util.List;

//3 - Adicione pelo menos três pessoas à lista utilizando o método add.
//4 - Imprima o tamanho da lista utilizando o método size.
//5 - Imprima a primeira pessoa da lista utilizando o método get.
//        6 - Imprima a lista completa
public class Main {
    public static void main(String[] args) {
        List <Pessoa> listaDePessoas = new ArrayList<>();

        Pessoa p1 = new Pessoa();
        p1.setNome("Pedro");
        p1.setIdade(21);

        Pessoa p2 = new Pessoa("Luigi", 12);
        listaDePessoas.add(p2);
        listaDePessoas.add(p1);


        System.out.println("Primeira pessoa da lista: " + listaDePessoas.getFirst().getNome());
        System.out.println("Tamanho da lista: " + listaDePessoas.size());

        System.out.println(p1);
    }
}
