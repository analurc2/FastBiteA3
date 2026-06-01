package B_Pedido;
import C_Cardapios.CardapioMcDonalds;
import C_Cardapios.CardapioAcai;
import C_Cardapios.CardapioPizza;
import C_Cardapios.CardapioDogao;
import java.util.Scanner;

public class Restaurantes {

    public void mostrarRestaurantes(Scanner sc) {

        int opcao;

        do {

            System.out.println("\n===== RESTAURANTES =====");

            System.out.println("1 - McDonalds");
            System.out.println("2 - Dogão Da Romero");
            System.out.println("3 - The Best Açaí");
            System.out.println("4 - Pizza Hut");
            System.out.println("0 - Voltar");

            System.out.print("\nEscolha um restaurante: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch(opcao) {

                case 1:
                    System.out.println("\nVocê escolheu McDonalds!");
                    new CardapioMcDonalds().abrirCardapio(sc);
                    break;

                case 2:
                    System.out.println("\nVocê escolheu Dogão Da Romero!");
                    new CardapioDogao().abrirCardapio(sc);
                    break;

                case 3:
                    System.out.println("\nVocê escolheu The Best Açaí!");
                    new CardapioAcai().abrirCardapio(sc);
                    break;

                case 4:
                    System.out.println("\nVocê escolheu Pizza Hut!");
                    new CardapioPizza().abrirCardapio(sc);
                    break;

                case 0:
                    System.out.println("\nVoltando...");
                    break;

                default:
                    System.out.println("\nOpção inválida!");

            }

        } while(opcao != 0);
    }
}