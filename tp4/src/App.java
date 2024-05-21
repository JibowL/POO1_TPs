import java.util.Date;
import java.util.List;
import java.util.ArrayList;

import models.Curso;
import models.Estudiante;
import models.Facultad;

public class App {
    public static void main(String[] args) throws Exception {
        List<Estudiante> listaEstudiantes = new ArrayList<>();
        //Facultades
        Facultad exactas = new Facultad("Exactas", "Apostoles");
        Facultad humanidades = new Facultad("Humanidades", "Posadas");
       
        //se crean los cursos
        Date fechaInicio = new Date(2024-03-01);
        Date fechaFin = new Date(2024-07-01);
        Curso logicaIlogica = new Curso("La Logica de lo Ilogico", fechaInicio, fechaFin, humanidades);
        Curso fisicaCuantica = new Curso("Fisica Cuantica", fechaInicio, fechaFin, exactas);
        Curso hacerCervezas = new Curso("Hacer Cerveza Cero Desde Cero", fechaInicio, fechaFin, exactas);
        humanidades.agregarCurso(logicaIlogica);
        exactas.agregarCurso(fisicaCuantica);
        exactas.agregarCurso(hacerCervezas);

        //Estudiantes
        Estudiante juanPerez = new Estudiante("1", "Juan", "Perez", "11111111");
        listaEstudiantes.add(juanPerez);
        Estudiante mariaLopez = new Estudiante("2", "Maria", "Lopez", "22222222");
        listaEstudiantes.add(mariaLopez);
        Estudiante pedroGomez = new Estudiante("3", "Pedro", "Gomez", "33333333");
        listaEstudiantes.add(pedroGomez);
        Estudiante ramonValdez = new Estudiante("4", "Ramon", "Valdez", "44444444");
        listaEstudiantes.add(ramonValdez);
        Estudiante martaJuarez = new Estudiante("5", "Marta", "Juarez", "55555555");
        listaEstudiantes.add(martaJuarez);
        //Inscribir a los estudiantes
        juanPerez.inscribirse(logicaIlogica);
        mariaLopez.inscribirse(logicaIlogica);
        pedroGomez.inscribirse(logicaIlogica);
        ramonValdez.inscribirse(fisicaCuantica);
        martaJuarez.inscribirse(fisicaCuantica);
        juanPerez.inscribirse(hacerCervezas);
        mariaLopez.inscribirse(hacerCervezas);
        pedroGomez.inscribirse(hacerCervezas);
        ramonValdez.inscribirse(hacerCervezas);
        martaJuarez.inscribirse(hacerCervezas);

        imprimirEstudiantesxCurso(logicaIlogica, listaEstudiantes);
        imprimirEstudiantesxCurso(fisicaCuantica, listaEstudiantes);
        imprimirEstudiantesxCurso(hacerCervezas, listaEstudiantes);
        
    }
    public static void imprimirEstudiantesxCurso(Curso curso, List<Estudiante> listaEstudiantes){
        System.out.println("Curso \"" + curso.getNombre() + "\": \n");
        for (Estudiante estudiante : listaEstudiantes) {
            if (estudiante.getCursosInscriptos().contains(curso)) {
                System.out.println(estudiante);
            }
        }
        System.out.println("\n-------------------------------------------------------------\n");
    }
}
