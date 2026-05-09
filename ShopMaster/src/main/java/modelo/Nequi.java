package modelo;

public class Nequi implements MetodoPago {
    public void pagar(double monto) {
        System.out.println("Pagando con Nequi: $" + monto);
    }
}
