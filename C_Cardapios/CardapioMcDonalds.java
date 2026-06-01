package C_Cardapios;
import java.util.Scanner;
import A_MenuInicial.Cores;
import B_Pedido.Carrinho;

public class CardapioMcDonalds {

    public void abrirCardapio(Scanner sc) {

        int opcao;

        do {

                System.out.println(Cores.RED + "╔══════════════════════════════════════╗" );
                System.out.println(Cores.RED + "║            MCDONALD'S                ║");
                System.out.println(Cores.RED + "╠══════════════════════════════════════╣" );
                System.out.println(Cores.RED + "║  1 - Big Mac          R$ 32,90       ║" );
                System.out.println(Cores.RED + "║  2 - McChicken        R$ 27,90       ║" );
                System.out.println(Cores.RED + "║  3 - Quarterão        R$ 35,90       ║" );
                System.out.println(Cores.RED + "║  4 - Batata Frita     R$ 12,00       ║" );
                System.out.println(Cores.RED + "║  5 - Coca-Cola        R$  8,00       ║" );
                System.out.println(Cores.RED + "║  0 - Voltar                          ║" );
                System.out.println(Cores.RED + "╚══════════════════════════════════════╝" + Cores.RESET);
            System.out.print("\nEscolha um item: ");
            opcao = sc.nextInt();
            sc.nextLine();

              switch(opcao) {

                case 1:
                    adicionarItemComQuantidade(sc, "Big Mac", "Big Mac - R$32,90");
                    break;

                case 2:
                    adicionarItemComQuantidade(sc, "McChicken", "McChicken - R$27,90");
                    break;

                case 3:
                    adicionarItemComQuantidade(sc, "Quarterao", "Quarterao - R$35,90");
                    break;

                case 4:
                    adicionarItemComQuantidade(sc, "Batata Frita", "Batata Frita - R$12,00");
                    break;

                case 5:
                    adicionarItemComQuantidade(sc, "Coca-Cola", "Coca-Cola - R$8,00");
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
    
