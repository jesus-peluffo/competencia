package modelo;

public class PSE implements MetodoPago {
    public void pagar(double monto) {
        System.out.println("Pagando con PSE: $" + monto);
    }
}