package tp3;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDateTime;

public class Cuenta {
    // Atributos
    private int id;
    private BigDecimal saldo;
    private BigDecimal tasaInteresAnual;
    private LocalDateTime fechaCreacion;

    //Constructor para una cuenta predeterminada y uno para una cuenta con un determinado id y saldo inicial
    public Cuenta() {
        this.id = 0;
        this.saldo = BigDecimal.ZERO;
        this.tasaInteresAnual = BigDecimal.ZERO;
        this.fechaCreacion = LocalDateTime.now();
    }
    public Cuenta(int id, BigDecimal saldo) {
        this.id = id;
        this.saldo = saldo;
        this.tasaInteresAnual = BigDecimal.ZERO;
        this.fechaCreacion = LocalDateTime.now();
    }
    
    //getters y setters de saldo y tasaInteresAnual
    public BigDecimal getSaldo() {
        return saldo;
    }
    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }
    public BigDecimal getTasaInteresAnual() {
        return tasaInteresAnual;
    }
    public void setTasaInteresAnual(BigDecimal tasaInteresAnual) {
        this.tasaInteresAnual = tasaInteresAnual;
    }

    //metodos de acceso de id y fechaCreacion
    public int getId() {
        return id;
    }
    public LocalDateTime getFechaCreacion() {
        return fechaCreacion;
    }

    //metodos que devuelven la tasa de interés mensual y el interés mensual
    public BigDecimal getTasaInteresMensual() {
        return tasaInteresAnual.divide(BigDecimal.valueOf(12), 2, RoundingMode.HALF_UP);
    }
    public BigDecimal getInteresMensual() {
        return saldo.multiply(getTasaInteresMensual());
    }

    //metodos para depositar y retirar
    public void depositar(BigDecimal monto) {
        saldo = saldo.add(monto);
    }
    public void retirar(BigDecimal monto) {
        if (saldo.compareTo(monto) >= 0) {
            saldo = saldo.subtract(monto);
        } else {
            System.out.println("No hay saldo suficiente para retirar");
        }
        
    }

    //metodo que crea y retorna una cuenta con un id determinado y saldo cero
    public static Cuenta crearCuentaSimple(int id) {
        return new Cuenta(id, BigDecimal.ZERO);
    }

    //metodo que devuelve una cadena de caracteres que contiene los datos con los que se creó la cuenta
    @Override
    public String toString() {
        return "Cuenta\t" + id + " (id)" +
                "\n\tsaldo = " + saldo +
                "\n\ttasaInteresAnual = " + tasaInteresAnual +
                "\n\tfechaCreacion = " + fechaCreacion + 
                "\n";
    }
}
