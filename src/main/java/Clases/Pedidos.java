package Clases;

public class Pedidos {
    private int id;
    private String numero;

    public void pedidoRealizado() {
        System.out.println("Pedido realizado con exito");
    }
    public void pedidoFallido() {
        System.out.println("Error em el Pedido. Revise sus datos");
    }
}
