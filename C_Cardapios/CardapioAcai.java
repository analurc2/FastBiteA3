package C_Cardapios;

import java.util.Scanner;

import A_MenuInicial.Cores;
import B_Pedido.Carrinho;

public class CardapioAcai {

    public void abrirCardapio(Scanner sc) {

        int tamanho;
        int limite = 0;
        int adicionais = 0;
        int quantidade;
        String item = "";
        String nome = "";

        String complementos = "";

        System.out.println(Cores.PURPLE + "\n ╔══════════════════════════════════════╗");
            System.out.println(Cores.PURPLE +"║             THE BEST AÇAÍ            ║");
            System.out.println(Cores.PURPLE +"╠══════════════════════════════════════╣");
            System.out.println(Cores.PURPLE +"║ 1 - Açaí 300ml(3 adicionais) R$14,00 ║");
            System.out.println(Cores.PURPLE +"║ 2 - Açaí 500ml(5 adicionais) R$18,00 ║");
            System.out.println(Cores.PURPLE +"║ 3 - Açaí 700ml(7 adicionais) R$24,00 ║");
            System.out.println(Cores.PURPLE +"║ 0 - Voltar                           ║" );
            System.out.println(Cores.PURPLE +"╚══════════════════════════════════════╝" + Cores.RESET);
            System.out.print("\nEscolha o tamanho: ");
        tamanho = sc.nextInt();
        sc.nextLine();

        switch(tamanho) {

            case 1:
                nome = "Acai 300ml";
                item = "Acai 300ml - R$14,00";
                limite = 3;
                break;

            case 2:
                nome = "Acai 500ml";
                item = "Acai 500ml - R$18,00";
                limite = 5;
                break;

            case 3:
                nome = "Acai 700ml";
                item = "Acai 700ml - R$24,00";
                limite = 7;
                break;

            case 0:
                System.out.println("\nSaindo do cardapio...");
                return; 

            default:
                System.out.println("Opcao invalida!");
                return;
            }

                System.out.print("Quantidade: ");
                quantidade = sc.nextInt();
                sc.nextLine();

            if (quantidade <= 0) {
                System.out.println("\nQuantidade invalida!");
                return;
            }

        System.out.println("\nEscolha ate " + limite + " adicionais.");
        System.out.println("(Digite s para SIM e n para NAO)\n");

        if(adicionais < limite && escolher(sc, "Leite condensado")) {
                complementos += "- Leite condensado\n";
                adicionais++;
            }

        if(adicionais < limite && escolher(sc, "Leite em po")) {
                complementos += "- Leite em po\n";
                adicionais++;
            }

        if(adicionais < limite && escolher(sc, "Ovomaltine")) {
                complementos += "- Ovomaltine\n";
                adicionais++;
            }

        if(adicionais < limite && escolher(sc, "Confete")) {
                complementos += "- Confete\n";
                adicionais++;
            }

        if(adicionais < limite && escolher(sc, "Bis")) {
                complementos += "- Bis\n";
                adicionais++;
            }

        if(adicionais < limite && escolher(sc, "Nutella")) {
                complementos += "- Nutella\n";
                adicionais++;
            }

        if(adicionais < limite && escolher(sc, "Pacoca")) {
                complementos += "- Pacoca\n";
                adicionais++;
            }

        if(adicionais < limite && escolher(sc, "Granola")) {
                complementos += "- Granola\n";
                adicionais++;
            }

        if(adicionais < limite && escolher(sc, "Banana")) {
                complementos += "- Banana\n";
                adicionais++;
            }

        if(adicionais < limite && escolher(sc, "Morango")) {
                complementos += "- Morango\n";
                adicionais++;
            }

        if(adicionais < limite && escolher(sc, "Kiwi")) {
                complementos += "- Kiwi\n";
                adicionais++;
            }

        for (int i = 0; i < quantidade; i++) {
                Carrinho.adicionarItem(item);
            }

        System.out.println("\n===== RESUMO DO PEDIDO =====");
        System.out.println(quantidade + "x " + nome);

        System.out.println("\nAdicionais escolhidos:");
        System.out.println(complementos);

        System.out.println("Quantidade de adicionais: " + adicionais);

        System.out.println("\nAcai adicionado ao carrinho!");
        }

        public boolean escolher(Scanner sc, String nome) {

        System.out.print(nome + "? (s/n): ");
            String resposta = sc.nextLine();

            return resposta.equalsIgnoreCase("s");
        }
    }
