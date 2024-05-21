package models;

import java.util.Date;

public class Curso {
    //Atributos
    private String nombre;
    private Date fechainicio;
    private Date fechafinalizacion;
    private Facultad facultad;

    //Constructores
    public Curso(){
    }
    public Curso(String nombre, Date fechainicio, Date fechafinalizacion, Facultad facultad){
        this.nombre = nombre;
        this.fechainicio = fechainicio;
        this.fechafinalizacion = fechafinalizacion;
        this.facultad = facultad;
    }
    //Getters y Setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Date getFechainicio() {
        return fechainicio;
    }
    public void setFechainicio(Date fechainicio) {
        this.fechainicio = fechainicio;
    }
    public Date getFechafinalizacion() {
        return fechafinalizacion;
    }
    public void setFechafinalizacion(Date fechafinalizacion) {
        this.fechafinalizacion = fechafinalizacion;
    }
    public Facultad getFacultad() {
        return facultad;
    }

    //metodo toString
    @Override
    public String toString() {
        return nombre;
    }
}
