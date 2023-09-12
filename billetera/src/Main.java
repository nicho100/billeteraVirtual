// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Crear dos billeteras con distintas monedas
        Billetera billetera1 = new Billetera("Dólares", 1000, 0.035);
        Billetera billetera2 = new Billetera("Euros", 500, 0.042);
        // Muestra saldo antes de la transferencia
        billetera1.mostrarSaldo();
        // Realiza una transferencia de billetera1 a billetera2
        billetera1.depositar(billetera2, 200);

        // Mostrar saldos después de la transferencia
        billetera1.mostrarSaldo();
        billetera2.mostrarSaldo();
    }
}