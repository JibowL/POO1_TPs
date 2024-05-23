package models;

import java.util.ArrayList;
import java.util.List;

public class Docente extends Empleado {

    private Cargo cargo;
    private List<Cargo> cargosDocente = new ArrayList<>();

    // constructor vacio que inicialice con datos predeterminados
    public Docente() {
        super();
        this.cargo = new Cargo();
    }

    public Docente(String apellidos, String nombres, int documento, Cargo cargo) {
        super(apellidos, nombres, documento);
        this.cargosDocente.add(cargo);
    }

    public void agregarCargo(Cargo cargo) {
        this.cargo = cargo;
        this.cargosDocente.add(cargo);
    }

    public Cargo getCargo() {
        return cargo;
    }

    // un metodo que retorne la lista impresa de cargosDocente
    public String getCargosDocente() {
        String cargos = "";
        for (Cargo cargo : cargosDocente) {
            cargos += cargo.toString() + " | ";
        }
        return cargos;
    }

    @Override
    public String toString() {
        return "\n+\tDocente: " + this.getApellidos() + " " + this.getNombres() +
                "\n\tFecha de ingreso: " + this.getFechaDeIngreso() +
                "\n\t" + this.getCargosDocente();
    }
}
