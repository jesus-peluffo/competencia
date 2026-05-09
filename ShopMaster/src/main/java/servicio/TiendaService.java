package servicio;

import java.util.*;
import modelo.*;

public class TiendaService {

    private List<Producto> productos = new ArrayList<>();
    private List<ItemCarrito> carrito = new ArrayList<>();

    public TiendaService() {
        // PC GAMER REAL
        productos.add(new Producto("Intel i9 13900K", "CPU", 1800, 5));
        productos.add(new Producto("Ryzen 7 7800X3D", "CPU", 1600, 6));

        productos.add(new Producto("RTX 4080", "GPU", 3200, 4));
        productos.add(new Producto("RTX 4070 Ti", "GPU", 2500, 6));

        productos.add(new Producto("32GB DDR5 Corsair", "RAM", 450, 10));
        productos.add(new Producto("16GB DDR4 Kingston", "RAM", 200, 15));

        productos.add(new Producto("1TB NVMe Samsung", "Almacenamiento", 300, 12));

        productos.add(new Producto("MSI B650 Motherboard", "Placa", 700, 8));

        // PERIFÉRICOS
        productos.add(new Producto("Mouse Logitech G502", "Perifericos", 120, 20));
        productos.add(new Producto("Teclado Mecánico RGB", "Perifericos", 150, 18));
        productos.add(new Producto("Monitor 144Hz 27\"", "Perifericos", 900, 7));
    }

    public void listar() {
        for (Producto p : productos) {
            System.out.println("------------------");
            System.out.println(p);
        }
    }

    public void filtrarCategoria(String cat) {
        for (Producto p : productos) {
            if (p.getCategoria().equalsIgnoreCase(cat)) {
                System.out.println(p);
                System.out.println("----------------");
            }
        }
    }

    public void agregarCarrito(String nombre, int cantidad) {
        for (Producto p : productos) {
            if (p.getNombre().equalsIgnoreCase(nombre)) {
                if (p.getStock() >= cantidad) {
                    carrito.add(new ItemCarrito(p, cantidad));
                    p.setStock(p.getStock() - cantidad);
                }
            }
        }
    }

    public double total() {
        double t = 0;
        for (ItemCarrito c : carrito) {
            t += c.subtotal();
        }
        return t;
    }

    public List<ItemCarrito> getCarrito() {
        return carrito;
    }
}