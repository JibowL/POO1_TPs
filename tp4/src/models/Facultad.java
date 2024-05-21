package models;

import java.util.ArrayList;
import java.util.List;

public class Facultad {
    //Atributos
    private String nombre;
    private String direccion;
    private List <Curso> cursos;

    //Constructores
    public Facultad() {
        this.nombre = "Facultad x";
        this.direccion = "Direccion x";
        this.cursos = new ArrayList<>();
    }
    public Facultad(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.cursos = new ArrayList<>();
    }
    //Getters y Setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public List<Curso> getCursos() {
        return cursos;
    }

    public void agregarCurso(Curso curso){
        this.cursos.add(curso);
    }

}