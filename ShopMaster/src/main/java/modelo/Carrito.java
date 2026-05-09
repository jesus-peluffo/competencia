package modelo;

import java.util.ArrayList;
import java.util.List;

public class Carrito {
    private List<Producto> productos = new ArrayList<>();

    public void agregar(Producto p) {
        productos.add(p);
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public double total() {
        double sum = 0;
        for (Producto p : productos) {
            sum += p.getPrecio();
        }
        return sum;
    }
}