package C_Cardapios;
import B_Pedido.Carrinho;
import java.util.Scanner;

import A_MenuInicial.Cores;

public class CardapioDogao {

    public void abrirCardapio(Scanner sc) {

        int opcao;

        do {

                System.out.println(Cores.YELLOW + "╔══════════════════════════════════════╗" );
                System.out.println(Cores.YELLOW + "║            Dogão Romero              ║");
                System.out.println(Cores.YELLOW + "╠══════════════════════════════════════╣" );
                System.out.println(Cores.YELLOW + "║  1 - Dogão Simples    R$ 18,00       ║" );
                System.out.println(Cores.YELLOW + "║  2 - Dogão Duplo      R$ 24,00       ║" );
                System.out.println(Cores.YELLOW + "║  3 - Dogão Especial   R$ 29,00       ║" );
                System.out.println(Cores.YELLOW + "║  4 - Batata Frita     R$ 12,00       ║" );
                System.out.println(Cores.YELLOW + "║  5 - Refrigerante     R$  7,00       ║" );
                System.out.println(Cores.YELLOW + "║  0 - Voltar                          ║" );
                System.out.println(Cores.YELLOW + "╚══════════════════════════════════════╝" + Cores.RESET);
            System.out.print("\nEscolha um item: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch(opcao) {

                case 1:
                    adicionarItemComQuantidade(sc, "Dogao Simples", "Dogao Simples - R$18,00");
                    break;

                case 2:
                    adicionarItemComQuantidade(sc, "Dogao Duplo", "Dogao Duplo - R$24,00");
                    break;

                case 3:
                    adicionarItemComQuantidade(sc, "Dogao Especial", "Dogao Especial - R$29,00");
                    break;

                case 4:
                    adicionarItemComQuantidade(sc, "Batata Frita", "Batata Frita - R$12,00");
                    break;

                case 5:
                    adicionarItemComQuantidade(sc, "Refrigerante", "Refrigerante - R$7,00");
                    break;

                case 0:
                    System.out.println("\nSaindo do cardapio...");
                    break;

                default:
                    System.out.println("\nOpcao invalida!");
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