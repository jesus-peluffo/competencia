package modelo;

public class Efectivo implements MetodoPago {
    public void pagar(double monto) {
        System.out.println("Pago en efectivo: $" + monto);
    }
}