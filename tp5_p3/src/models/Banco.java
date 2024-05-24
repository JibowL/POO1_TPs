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

    
}
