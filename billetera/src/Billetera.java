public class Billetera {
    private String tipoMoneda;
    private double cantidad;
    private double valorEnOroPorUnidad;

    public Billetera(String tipoMoneda, double cantidad, double valorEnOroPorUnidad) {
        this.tipoMoneda = tipoMoneda;
        this.cantidad = cantidad;
        this.valorEnOroPorUnidad = valorEnOroPorUnidad;
    }

    public void depositar(Billetera destino, double cantidad) {
        // Calcula la cantidad a transferir en onzas de oro
        double cantidadEnOro = cantidad * this.valorEnOroPorUnidad;

        // Convierte la cantidad en onzas de oro a la moneda de destino
        double cantidadEnDestino = cantidadEnOro / destino.valorEnOroPorUnidad;

        if (this.cantidad >= cantidad) {
            // Actualiza las cantidades en ambas billeteras
            this.cantidad -= cantidad;
            destino.cantidad += cantidadEnDestino;

            System.out.println("Transferencia exitosa: " + cantidad + " " + tipoMoneda + " transferidos a " + destino.tipoMoneda + ".");
        } else {
            System.out.println("No hay suficiente " + tipoMoneda + " en la billetera actual para la transferencia.");
        }
    }

    public double getCantidad() {
        return cantidad;
    }

    public void mostrarSaldo() {
        System.out.println("Saldo de la billetera: " + cantidad + " " + tipoMoneda);
    }
}