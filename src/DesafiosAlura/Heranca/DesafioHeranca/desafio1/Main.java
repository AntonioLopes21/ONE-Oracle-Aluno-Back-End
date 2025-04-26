package DesafiosAlura.Heranca.DesafioHeranca.desafio1;

public class Main {
    public static void main(String[] args) {
        ModeloCarro ferrari = new ModeloCarro("Ferrari", 10000);
        ModeloCarro porche = new ModeloCarro("Porche", 20000);

        porche.compararValoresVeiculos(porche, ferrari);
    }
}
