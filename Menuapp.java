package A_MenuInicial;
import java.util.Scanner;


import B_Pedido.Finalizacao;
import B_Pedido.Historico;
import B_Pedido.Perfil;
import B_Pedido.Carrinho;
import B_Pedido.Restaurantes;
public class Menuapp {
    public static void exibirMenu(Scanner sc) {

       
        int opcao = -1;
        while (opcao != 0) {
            System.out.println(Cores.CYAN +"╔════════════════════════════════════╗");
            System.out.println(Cores.CYAN +"║           FASTBITE                 ║");
            System.out.println(Cores.CYAN +"╠════════════════════════════════════╣");
            System.out.println(Cores.CYAN +"║  1 - Ver Restaurantes              ║");
            System.out.println(Cores.CYAN +"║  2 - Meu Carrinho                  ║");
            System.out.println(Cores.CYAN +"║  3 - Finalizar Pedido              ║");
            System.out.println(Cores.CYAN +"║  4 - Histórico de Pedidos          ║");
            System.out.println(Cores.CYAN +"║  5 - Perfil                        ║");
            System.out.println(Cores.CYAN +"║  0 - Sair                          ║");
            System.out.println(Cores.CYAN +"╚════════════════════════════════════╝" + Cores.RESET);
        
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch(opcao) {
                case 1:
                    System.out.println("Ver Restaurantes...");
                    Restaurantes te = new Restaurantes();
                    te.mostrarRestaurantes(sc);
                    break;
                case 2:
                    System.out.println("Meu Carrinho...");
                    Carrinho.mostrarCarrinho();
                    break;
                case 3:
                    System.out.println("Finalizando Pedido...");
                        Finalizacao f = new Finalizacao();
                        f.finalizar(sc);
                    break;
                case 4:
                    System.out.println("Histórico de Pedidos...");
                    Historico h = new Historico();
                    h.abrirHistorico();
                    break;
                case 5:
                    System.out.println("Perfil...");
                    Perfil p = new Perfil();
                    p.abrirPerfil();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    
        
    }
}

