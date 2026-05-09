package modelo;

public class Daviplata implements MetodoPago {
    public void pagar(double monto) {
        System.out.println("Pagando con Daviplata: $" + monto);
    }
}