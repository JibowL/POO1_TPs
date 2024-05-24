package models;

import java.time.LocalDate;

public class Empleado {
    private String apellidos;
    private String nombres;
    private int documento;
    private LocalDate fechaDeIngreso = LocalDate.now();

    public Empleado(){
        this.apellidos = "Sin Nombre";
        this.nombres = "";
        this.documento = 0;
        this.fechaDeIngreso = null;

    }
    
    public Empleado(String apellidos, String nombres, int documento){
        this.apellidos = apellidos;
        this.nombres = nombres;
        this.documento = documento;
    }

    public String getApellidos(){
        return this.apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public String getNombres() {
        return this.nombres;
    }
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    public void setNombreCompleto(String nombres, String apellidos){
        this.nombres = nombres;
        this.apellidos = apellidos;
    }
    public int getDocumento() {
        return this.documento;
    }
    public void setDocumento(int documento) {
        this.documento = documento;
    }
    public LocalDate getFechaDeIngreso() {
        return this.fechaDeIngreso;
    }
    public void setFechaDeIngreso() {
        this.fechaDeIngreso = LocalDate.now();
    }
}
