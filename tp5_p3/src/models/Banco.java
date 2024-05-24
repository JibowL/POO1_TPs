package models;

import java.util.ArrayList;

public class Banco {
    private ArrayList<Cuenta> cuentas;

    public Banco(){
        cuentas = new ArrayList<Cuenta>();
    }

    public void agregarCuenta(Cuenta nuevaCuenta){
        cuentas.add(nuevaCuenta);
    }

    public void mostrarSaldoTotal(){
        double saldoTotal = 0;
        for (Cuenta cuenta : cuentas) {
            saldoTotal += cuenta.calcularSaldo();
        }
        System.out.println("El saldo total del banco es: " + saldoTotal);
    }

    public void imprimirCuentas(){
        for (Cuenta cuenta : cuentas) {
            System.out.println(cuenta);
        }
    }
}
