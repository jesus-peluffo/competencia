package modelo;

import java.util.ArrayList;

public class Cliente extends Usuario {
    private ArrayList<Pedido> pedidos = new ArrayList<>();

    public Cliente(String nombre, String email, String password) {
        super(nombre, email, password);
    }

    public void agregarPedido(Pedido p) {
        pedidos.add(p);
    }

    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }
}