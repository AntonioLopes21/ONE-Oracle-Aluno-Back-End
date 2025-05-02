package DesafiosAlura.ForeachEInstanceOf.desafio2;

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        cachorro.setNome("Fallen");
        cachorro.setRaca("Fox");
        cachorro.setIdade(5);

        var cachorroCasting = (Animal) cachorro;
    }
}
