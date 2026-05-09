package vista;

import modelo.*;
import servicio.TiendaService;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class VentanaProductos extends JFrame {

    private TiendaService servicio;
    private JTextArea area;
    private JButton btnPagar;

    public VentanaProductos(TiendaService servicio) {
        this.servicio = servicio;

        setTitle("ShopMaster - Productos");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        area = new JTextArea();
        btnPagar = new JButton("Pagar");

        setLayout(new BorderLayout());
        add(new JScrollPane(area), BorderLayout.CENTER);
        add(btnPagar, BorderLayout.SOUTH);

        cargarProductos();

        btnPagar.addActionListener((ActionEvent e) -> {
            pagarCompra();
        });
    }

    private void cargarProductos() {
        area.setText("=== PRODUCTOS ===\n");
        area.append("Arroz - $3000\n");
        area.append("Aceite - $8000\n");
        area.append("Azúcar - $2500\n");
    }

    private void pagarCompra() {

        double total = 50000;

        String[] opciones = {"PSE", "Nequi", "Daviplata", "Efectivo"};

        int opcion = JOptionPane.showOptionDialog(
                this,
                "Seleccione método de pago",
                "Pago",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                opciones,
                opciones[0]
        );

        MetodoPago pago;

        switch (opcion) {
            case 0:
                pago = new PSE();
                break;
            case 1:
                pago = new Nequi();
                break;
            case 2:
                pago = new Daviplata();
                break;
            case 3:
                pago = new Efectivo();
                break;
            default:
                JOptionPane.showMessageDialog(this, "Cancelado");
                return;
        }

        pago.pagar(total);

        JOptionPane.showMessageDialog(this, "Compra finalizada");
    }
}