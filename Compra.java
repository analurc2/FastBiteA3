    package A_MenuInicial;
    public class Compra {

    String cliente;
    String produto;
    int quantidade;
    double total;

    public Compra(String cliente, String produto, int quantidade, double total) {

        this.cliente = cliente;
        this.produto = produto;
        this.quantidade = quantidade;
        this.total = total;
    }

    public void mostrarCompra() {

        System.out.println("Cliente: " + cliente);
        System.out.println("Produto: " + produto);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Total Pago: R$ " + total);
        System.out.println("---------------------------");
    }

    public static void main(String[] args) {

    }
}