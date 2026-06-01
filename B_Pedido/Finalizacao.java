package B_Pedido;
import java.util.Scanner;

import A_MenuInicial.FastBite;

public class Finalizacao {
    public void finalizar(Scanner sc) {

       
        if (Carrinho.itens.isEmpty()) {
            System.out.println("\nCarrinho vazio! Adicione itens antes de finalizar.");
            return;
        }

        
        System.out.println("\n========================================");
        System.out.println("           RESUMO DO PEDIDO             ");
        System.out.println("========================================");

        double total = 0;
        for (String item : Carrinho.itens) {
            System.out.println("  - " + item);
            try {
                String preco = item.split("R\\$")[1].replace(",", ".");
                total += Double.parseDouble(preco);
            } catch (Exception e) {}
        }
        
        // EXIBE O TOTAL DO PEDIDO
        System.out.println("----------------------------------------");
        System.out.printf("  TOTAL: R$%.2f%n", total);
        System.out.println("========================================");

        // DESCONTO DE PRIMEIRO PEDIDO
        if (FastBite.primeiroPedido) {
            
            // CALCULA 60% DE DESCONTO
            double desconto = total * 0.60;

            // APLICA O DESCONTO
            total -= desconto;
        
            // MOSTRA A PROMOÇÃO
            System.out.println("\n PROMOÇÃO PRIMEIRO PEDIDO!");
            System.out.println(" Você ganhou 60% de desconto!");
            System.out.printf(" Desconto aplicado: R$%.2f%n", desconto);
            System.out.printf(" Novo total: R$%.2f%n", total);
        }

        // Forma de pagamento
        System.out.println("\nFormas de pagamento:");
        System.out.println("  1 - Cartão de Crédito");
        System.out.println("  2 - Cartão de Débito");
        System.out.println("  3 - Dinheiro (pagar ao motoboy)");
        System.out.println("  4 - Pix");
        System.out.println("  0 - Cancelar");
        System.out.print("Escolha: ");
        int pagamento = sc.nextInt();
        sc.nextLine();

        switch (pagamento) {
            case 1:
                System.out.println("\n Cartão de Crédito selecionado.");
                System.out.print("Número de parcelas (1-3): ");
                int parcelas = sc.nextInt();
                sc.nextLine();
                double valorParcela = total / parcelas;
                System.out.printf("Pagamento em %dx de R$%.2f%n", parcelas, valorParcela);
                confirmarPedido(sc, total);
                break;

            case 2:
                System.out.println("\n Cartão de Débito selecionado.");
                System.out.printf("Valor a debitar: R$%.2f%n", total);
                confirmarPedido(sc, total);
                break;

            case 3:
                System.out.println("\n Pagamento em dinheiro ao motoboy.");
                System.out.print("Vai precisar de troco? (s/n): ");
                String troco = sc.nextLine();
                if (troco.equalsIgnoreCase("s")) {
                    System.out.print("Troco para quanto? R$");
                    double trocoValor = sc.nextDouble();
                    sc.nextLine();
                    System.out.printf("Troco: R$%.2f%n", trocoValor - total);
                }
                confirmarPedido(sc, total);
                break;

            case 4:
                System.out.println("\n Pagamento via Pix.");
                System.out.println("Chave Pix: 11930134145");
                System.out.printf("Valor: R$%.2f%n", total);
                System.out.println("Após pagar, confirme abaixo.");
                confirmarPedido(sc, total);
                break;

            case 0:
                System.out.println("\nFinalização cancelada. Voltando ao menu...");
                break;

            default:
                System.out.println("\nOpção inválida!");
        }
    }

         private void confirmarPedido(Scanner sc, double total) {

            System.out.print("\nConfirmar pedido? (s/n): ");
                String confirma = sc.nextLine();

        if (confirma.equalsIgnoreCase("s")) {

            // DESATIVA O DESCONTO DE PRIMEIRO PEDIDO
            FastBite.primeiroPedido = false;

            System.out.println("\n Pedido confirmado!");
            System.out.println(" Seu pedido está sendo preparado...");
            System.out.printf(" Total pago: R$%.2f%n", total);
            System.out.println("  Tempo estimado: 30-45 minutos");

            
            Historico.salvarPedido(Carrinho.itens, total);
            Carrinho.itens.clear();

            System.out.println("\nObrigado por usar o FastBite! ");
        } else {
            System.out.println("\nPedido não confirmado. Voltando ao menu...");
        }
    }
}