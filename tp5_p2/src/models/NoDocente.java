package models;

public class NoDocente extends Empleado {
    private Categoria categoria;

    public NoDocente() {
        super();
        this.categoria = Categoria.CATEGORIA_SN;
        }
    
    public NoDocente(String apellidos, String nombres, int documento, Categoria categoria){
        super(apellidos, nombres, documento);
        this.categoria = categoria;
    }

    public Categoria getCategoria(){
        return this.categoria;
    }

    @Override
    public String toString(){
        return "\n+\tNo Docente: " + this.getApellidos() + " " + this.getNombres() + 
        "\n\tFecha de ingreso: " + this.getFechaDeIngreso() + "\n\tCategoria: " + categoria;
    }
}
