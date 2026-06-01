package B_Pedido;


import java.util.ArrayList;
public class Carrinho {

    public static ArrayList<String> itens = new ArrayList<>();

    public static void adicionarItem(String item) {
        itens.add(item);
    }

public static void mostrarCarrinho() {
    System.out.println("\n===== CARRINHO =====");

    if (itens.isEmpty()) {
        System.out.println("Carrinho vazio!");
        return;
    }

    double total = 0;
    for (String item : itens) {
        System.out.println("  - " + item);
        
        try {
            String preco = item.split("R\\$")[1].replace(",", ".");
            total += Double.parseDouble(preco);
        } catch (Exception e) {}
    }

    System.out.printf("\nTOTAL: R$%.2f%n", total);
    System.out.println("====================\n");
}
}