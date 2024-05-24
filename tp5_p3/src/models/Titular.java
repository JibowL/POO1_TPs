package models;

public class Titular {
    private String apellidos;
    private String nombres;

    public Titular(){
        this.apellidos = "Sin Nombre";
        this.nombres = "";
    }

    public Titular(String apellidos, String nombres){
        this.apellidos = apellidos;
        this.nombres = nombres;
    }

    public String getApellidos(){
        return this.apellidos;
    }
    public void setApellidos(String apellidos){
        this.apellidos = apellidos;
    }
    public String getNombres(){
        return this.nombres;
    }
    public void setNombres(String nombres){
        this.nombres = nombres;
    }
}
