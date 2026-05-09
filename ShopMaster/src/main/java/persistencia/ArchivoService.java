package persistencia;

import java.io.FileWriter;
import java.util.List;
import modelo.ItemCarrito;

public class ArchivoService {

    public static void generarFactura(List<ItemCarrito> items, double total) {
        try {
            FileWriter fw = new FileWriter("factura.txt");

            fw.write("===== FACTURA SHOPMASTER =====\n");

            for (ItemCarrito c : items) {
                fw.write(c.getProducto().getNombre() +
                        " x" + c.getCantidad() +
                        " = $" + c.subtotal() + "\n");
            }

            fw.write("----------------------------\n");
            fw.write("TOTAL: $" + total + "\n");

            fw.close();
        } catch (Exception e) {
            System.out.println("Error factura: " + e);
        }
    }
}