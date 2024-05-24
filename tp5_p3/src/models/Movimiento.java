package models;

import java.time.LocalDate;

public class Movimiento {
    private LocalDate fecha;
    private String descripcion;
    private double monto;
    private TipoMovimiento tipoMovimiento;

    public enum TipoMovimiento {CREDITO, DEBITO}

    public Movimiento(String descripción, double monto, TipoMovimiento tipoMovimiento){
        this.fecha = LocalDate.now();
        this.descripcion = descripción;
        this.monto = monto;
        this.tipoMovimiento = tipoMovimiento;
    }

    public LocalDate getFecha() {
        return fecha;
    }
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public double getMonto() {
        return monto;
    }
    public void setMonto(double monto) {
        this.monto = monto;
    }
    public TipoMovimiento getTipoMovimiento() {
        return tipoMovimiento;
    }
    public void setTipoMovimiento(TipoMovimiento tipoMovimiento) {
        this.tipoMovimiento = tipoMovimiento;
    }

    //metodo toString
    @Override
    public String toString() {
        return "Movimiento del " + fecha + "\nDescripcion: \"" + descripcion + 
        "\"\nTipo de Movimiento: [" + tipoMovimiento + "] Monto:" + monto + "\n";
    }
}
