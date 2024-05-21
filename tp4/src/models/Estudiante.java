package models;

import java.util.ArrayList;
import java.util.List;

public class Estudiante {
    //crea los atributos legajo, nombres, apellidos, documento y una lista de cursosinscriptos
    private String legajo;
    private String nombres;
    private String apellidos;
    private String documento;
    private List<Curso> cursosInscriptos;

    //constructores
    public Estudiante() {
    }
    public Estudiante(String legajo, String nombres, String apellidos, String documento){
        this.legajo = legajo;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.documento = documento;
        this.cursosInscriptos = new ArrayList<>();
    }

    //Getters y Setters
    public String getLegajo() {
        return legajo;
    }
    public void setLegajo(String legajo) {
        this.legajo = legajo;
    }
    public String getNombres() {
        return nombres;
    }
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public String getDocumento() {
        return documento;
    }
    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public List<Curso> getCursosInscriptos() {
        return cursosInscriptos;
    }

    //metodos
    public void inscribirse(Curso curso){
        this.cursosInscriptos.add(curso);
    }

    //metodo toString
    @Override
    public String toString() {
        return "Estudiante " + nombres + " " + apellidos +
                "\n\tLegajo: '" + legajo + '\'' +
                "\n\tDocumento: '" + documento + '\'' + "\n";
    }
}
