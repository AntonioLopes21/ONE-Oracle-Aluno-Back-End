package Condicionais.SwitchCase;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean programaRodando = false;

        do {
            System.out.println("Olá! que dia é hoje? do 1 ao 7.\nPressione 0 para concluir o programa!");
            int dia = sc.nextInt();

            switch (dia) {
                case 0:
                    System.out.println("Obrigado por usar este programa!");
                    programaRodando = true;
                break;

                case 1:
                    System.out.println("Domingo");
                break;

                case 2:
                    System.out.println("Segunda");
                break;
                case 3:
                    System.out.println("Terça");
                break;
                case 4:
                    System.out.println("Quarta");
                break;
                case 5:
                    System.out.println("Quinta");
                break;
                case 6:
                    System.out.println("Sexta");
                break;
                case 7:
                    System.out.println("Sabado");
                break;

                default:
                    System.out.println("opcao invalida");
                break;
            }


        }while(!programaRodando);

    }

}
