package models;

import java.time.LocalDate;
import java.util.ArrayList;

public class Cuenta {
    private Titular titular;
    private TipoCuenta tipoDeCuenta;
    private int nroCuenta;
    private String cbu;
    private LocalDate fechaDeCreacion;
    private double montoGiroEnDescubierto;
    private double saldo;
    private ArrayList<Movimiento> historialMovimientos;


    public Cuenta(){
        this.titular = new Titular();
        this.tipoDeCuenta = TipoCuenta.SIN_TIPO_CUENTA;
        this.nroCuenta = 0;
        this.cbu = "Sin CBU";
        this.fechaDeCreacion = LocalDate.of(1, 1, 1);
        this.montoGiroEnDescubierto = 0;
    }

    public Cuenta(Titular titular, TipoCuenta tipoDeCuenta, int nroCuenta, String cbu){
        this.titular = titular;
        this.tipoDeCuenta = tipoDeCuenta;
        this.nroCuenta = nroCuenta;
        this.cbu = cbu;
        this.fechaDeCreacion = LocalDate.now();
    }

    public Cuenta(Titular titular, TipoCuenta tipoCuenta, int nroCuenta, String cbu, double montoGiroEnDescubierto){
        this.titular = titular;
        this.nroCuenta = nroCuenta;
        this.cbu = cbu;
        this.fechaDeCreacion = LocalDate.now();
        //Controlo si es cuenta corriente para agregar el monto
        if (this.tipoDeCuenta == TipoCuenta.CORRIENTE){
            this.montoGiroEnDescubierto = montoGiroEnDescubierto;
        } else {
            throw new IllegalArgumentException("Solo se puede asignar un monto de giro en descubierto a cuentas corrientes");
        }
    }

    
    public Titular getTitular() {
        return titular;
    }
    public void setTitular(Titular titular) {
        this.titular = titular;
    }
    public TipoCuenta getTipoDeCuenta() {
        return tipoDeCuenta;
    }
    public void setTipoDeCuenta(TipoCuenta tipoDeCuenta) {
        this.tipoDeCuenta = tipoDeCuenta;
    }
    public int getNroCuenta() {
        return nroCuenta;
    }
    public void setNroCuenta(int nroCuenta) {
        this.nroCuenta = nroCuenta;
    }
    public String getCbu() {
        return cbu;
    }
    public void setCbu(String cbu) {
        this.cbu = cbu;
    }
    public LocalDate getFechaDeCreacion() {
        return fechaDeCreacion;
    }
    public void setFechaDeCreacion(LocalDate fechaDeCreacion) {
        this.fechaDeCreacion = fechaDeCreacion;
    }
    public double getMontoGiroEnDescubierto() {
        return montoGiroEnDescubierto;
    }
    public void setMontoGiroEnDescubierto(double montoGiroEnDescubierto) {
        this.montoGiroEnDescubierto = montoGiroEnDescubierto;
    }
}
