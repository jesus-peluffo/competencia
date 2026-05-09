package modelo;

import java.util.ArrayList;

public class Pedido {
    private ArrayList<ItemCarrito> items;
    private double total;

    public Pedido(ArrayList<ItemCarrito> items, double total) {
        this.items = items;
        this.total = total;
    }

    public double getTotal() { return total; }
}