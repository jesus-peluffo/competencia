package modelo;

public class PagoTarjeta extends Pago {
    @Override
    public void procesarPago(double monto) {
        System.out.println("Pago con tarjeta: $" + monto);
    }
}