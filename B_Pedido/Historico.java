package B_Pedido;

import java.util.ArrayList;

public class Historico {
    private static ArrayList<String> historico = new ArrayList<>();

    
    public static void salvarPedido(ArrayList<String> itens, double total) {
        historico.add("──────────────────────");
        for (String item : itens) {
            historico.add("  " + item);
        }
        historico.add(String.format("  TOTAL: R$%.2f", total));
    }

    public  void abrirHistorico() {
        System.out.println("\n===== HISTÓRICO DE PEDIDOS =====");
        if (historico.isEmpty()) {
            System.out.println("Nenhum pedido realizado ainda.");
        } else {
            for (String linha : historico) {
                System.out.println(linha);
            }
        }
        System.out.println("================================\n");
    }
}