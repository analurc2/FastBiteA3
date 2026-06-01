package C_Cardapios;

import java.util.Scanner;
import A_MenuInicial.Cores;
import B_Pedido.Carrinho;

public class CardapioPizza {
    public void abrirCardapio(Scanner sc) {

        int opcao;

        do {

            System.out.println( Cores.BROWN + "\n╔══════════════════════════════════════╗");
            System.out.println( Cores.BROWN + "║            PIZZA HUT                 ║");
            System.out.println( Cores.BROWN + "╠══════════════════════════════════════╣");
            System.out.println( Cores.BROWN + "║  1 - Pepperoni        R$ 45,90       ║");
            System.out.println( Cores.BROWN + "║  2 - Margherita       R$ 39,90       ║");
            System.out.println( Cores.BROWN + "║  3 - Frango com Catupiry - R$ 42,90  ║");
            System.out.println( Cores.BROWN + "║  4 - Calabresa        R$ 40,90       ║");
            System.out.println( Cores.BROWN + "║  5 - Quatro Queijos   R$ 44,90       ║");
            System.out.println( Cores.BROWN + "║  0 - Voltar                          ║");
            System.out.println( Cores.BROWN + "╚══════════════════════════════════════╝" + Cores.RESET);
            System.out.print("\nEscolha um item: ");
            opcao = sc.nextInt();
            sc.nextLine();

             switch(opcao) {

                case 1:
                    adicionarItemComQuantidade(sc, "Pizza Pepperoni", "Pizza Pepperoni - R$45,90");
                    break;

                case 2:
                    adicionarItemComQuantidade(sc, "Pizza Margherita", "Pizza Margherita - R$39,90");
                    break;

                case 3:
                    adicionarItemComQuantidade(sc, "Pizza Frango com Catupiry", "Pizza Frango com Catupiry - R$42,90");
                    break;

                case 4:
                    adicionarItemComQuantidade(sc, "Pizza Calabresa", "Pizza Calabresa - R$40,90");
                    break;

                case 5:
                    adicionarItemComQuantidade(sc, "Pizza Quatro Queijos", "Pizza Quatro Queijos - R$44,90");
                    break;

                case 0:
                    System.out.println("\nSaindo do cardapio...");
                    break;

                default:
                    System.out.println("\nOpcao invalida!");
            }

            if (opcao >= 1 && opcao <= 5) {
                Carrinho.mostrarCarrinho();
            }

        } while(opcao != 0);
    }

    private void adicionarItemComQuantidade(Scanner sc, String nome, String item) {
        System.out.print("Quantidade: ");
        int quantidade = sc.nextInt();
        sc.nextLine();

        if (quantidade <= 0) {
            System.out.println("\nQuantidade invalida!");
            return;
        }

        for (int i = 0; i < quantidade; i++) {
            Carrinho.adicionarItem(item);
        }

        System.out.println("\n" + quantidade + "x " + nome + " adicionado(s) ao carrinho!");
    }
}
