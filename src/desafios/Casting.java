package desafios;

public class Casting {
    /*Declare uma variável do tipo double e uma variável do tipo int. Faça o casting da variável double para int e imprima o resultado.*/
    public static void main(String[] args) {
        int variavel1 = 3;
        double variavel2 = 3.6;

        int media = (int) (variavel1 + variavel2/2);
        System.out.println("Média casting: " + media);
        
    }
}
