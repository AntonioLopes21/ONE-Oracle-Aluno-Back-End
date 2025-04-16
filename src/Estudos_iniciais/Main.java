package Estudos_iniciais;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Screen Match");
        System.out.println("Filme: T-bone");

        int anoDeLancamento = 2022; //camelCase
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        double avaliacao = 8.2;
        boolean incluidoNoPlano = true;
/*
        double media = (5.2 + 4.5 + 10.0)/3;
        System.out.println(media);
*/
        String sinopse = "Filme dos anos 90";

        sinopse = """
                Filme : T-bone
                Filme de aventura dos anos 90
                nota: 6.56
                ano de lançamento:
                """ +  anoDeLancamento;
        System.out.println(sinopse);


    }
}