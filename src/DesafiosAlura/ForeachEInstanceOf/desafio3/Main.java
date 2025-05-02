package DesafiosAlura.ForeachEInstanceOf.desafio3;

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        cachorro.setNome("Fallen");
        cachorro.setRaca("Fox");
        cachorro.setIdade(5);


        if (cachorro instanceof Animal) {
            Animal cachorroCasting = (Animal) cachorro;
            System.out.println("O cachorro é um animal instanciado");


        } else {
            System.out.println("O cachorro não é um animal instanciado");
        }
    }
}
