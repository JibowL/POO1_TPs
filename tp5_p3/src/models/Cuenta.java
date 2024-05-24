package models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Cuenta {
    private Titular titular;
    private TipoCuenta tipoCuenta;
    private int nroCuenta;
    private String cbu;
    private LocalDate fechaDeCreacion;
    private double montoGiroEnDescubierto;
    private ArrayList<Movimiento> historialMovimientos = new ArrayList<>();

    public Cuenta(){
        this.titular = new Titular();
        this.tipoCuenta = TipoCuenta.SIN_TIPO_CUENTA;
        this.nroCuenta = ThreadLocalRandom.current().nextInt(1111, 9999 + 1);
        this.cbu = "Sin CBU";
        this.fechaDeCreacion = LocalDate.of(1, 1, 1);
        this.montoGiroEnDescubierto = 0;
    }

    public Cuenta(Titular titular, TipoCuenta tipoCuenta, String cbu){
        this.titular = titular;
        this.tipoCuenta = tipoCuenta;
        this.nroCuenta = ThreadLocalRandom.current().nextInt(1111, 9999 + 1);
        this.cbu = cbu;
        this.fechaDeCreacion = LocalDate.now();
    }

    public Cuenta(Titular titular, TipoCuenta tipoCuenta, String cbu, double montoGiroEnDescubierto){
        this.titular = titular;
        this.tipoCuenta = tipoCuenta;
        this.nroCuenta = ThreadLocalRandom.current().nextInt(1111, 9999 + 1);
        this.cbu = cbu;
        this.fechaDeCreacion = LocalDate.now();
        //Controlo si es cuenta corriente para agregar el monto
        if (this.tipoCuenta == TipoCuenta.CORRIENTE){
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
        return tipoCuenta;
    }
    public void setTipoDeCuenta(TipoCuenta tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
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

    public void agregarMovimiento(Movimiento movimiento){
        this.historialMovimientos.add(movimiento);
    }

    public double calcularSaldo(){
        double saldo = 0;
        for (Movimiento movimiento : historialMovimientos) {
            if(movimiento.getTipoMovimiento() == Movimiento.TipoMovimiento.CREDITO){
                saldo += movimiento.getMonto();
            } else if (movimiento.getTipoMovimiento() == Movimiento.TipoMovimiento.DEBITO) {
                saldo -= movimiento.getMonto();
            }
        }
        return saldo;
    }

    public void imprimirSaldo(){
        System.out.println("Saldo de la cuenta: " + this.calcularSaldo());
    }

    public void imprimirHistorialMovimientos(){
        for (int i = 0; i < historialMovimientos.size(); i++) {
            System.out.println(historialMovimientos.get(i).toString());
        }
    }

    @Override
    public String toString() {
        return "Cuenta: [" + this.nroCuenta + "] CBU: " + this.cbu +
        "\nTitular: " + this.titular.getApellidos() + " " + this.titular.getNombres() + 
        "\nTipo de Cuenta: " + this.getTipoDeCuenta() + 
        "\nSaldo: " + this.calcularSaldo() + "\n";
    }
}
