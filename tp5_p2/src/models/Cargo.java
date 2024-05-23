package models;

import java.util.ArrayList;
import java.util.List;

public class Cargo {
    private List<CargosDocente> cargo = new ArrayList<>();
    private int dedicacion;

    public Cargo() {
        this.cargo = new ArrayList<>();
        this.dedicacion = 0;
    }

    public Cargo(CargosDocente cargo, int dedicacion){
        this.cargo.add(cargo);
        this.dedicacion = dedicacion;
    }

    public int getDedicacion(){
        return this.dedicacion;
    }

    //metodo tostring
    @Override
    public String toString(){
        return "Cargo: " + this.cargo + " - Dedicacion: " + this.dedicacion;
    }
}
