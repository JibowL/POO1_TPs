import models.*;
import models.Movimiento.TipoMovimiento;

public class App {
    public static void main(String[] args) throws Exception {
        Banco banco1 = new Banco();

        Cuenta cuenta1 = new Cuenta(new Titular("Perez", "Juan"), TipoCuenta.CORRIENTE, "111111");
        banco1.agregarCuenta(cuenta1);
        Cuenta cuenta2 = new Cuenta();
        banco1.agregarCuenta(cuenta2);
        Cuenta cuenta3 = new Cuenta(new Titular("Paredes", "Armando"), TipoCuenta.CORRIENTE, "222222", 500);
        banco1.agregarCuenta(cuenta3);

        cuenta1.agregarMovimiento(new Movimiento("Cobro de sueldo", 500000, TipoMovimiento.CREDITO));
        cuenta1.agregarMovimiento(new Movimiento("Compra de mercaderia", 20000, TipoMovimiento.DEBITO));

        cuenta3.agregarMovimiento(new Movimiento("Sueldo", 666000, TipoMovimiento.CREDITO));

        System.out.println("\nCuentas del banco 1:");
        banco1.imprimirCuentas();
        
        System.out.println("Movimientos de la cuenta [" + cuenta1.getNroCuenta() + "]");
        cuenta1.imprimirHistorialMovimientos();
        System.out.println("Saldo de la cuenta [" + cuenta1.getNroCuenta() + "]: " + 
        cuenta1.calcularSaldo());

        banco1.mostrarSaldoTotal();

        System.out.println("Monto de Giro en Descubierto de la cuenta [" + cuenta3.getNroCuenta() + "]: " + 
        cuenta3.getMontoGiroEnDescubierto());
    }
}
