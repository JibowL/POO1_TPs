import java.util.ArrayList;

import models.*;

public class App {
    public static void main(String[] args) throws Exception {

        ArrayList<Empleado> empleados = new ArrayList<>();

        Docente docente1 = new Docente("Perez", "Juan", 1, new Cargo(CargosDocente.ADJUNTO, 20));
        docente1.agregarCargo(new Cargo(CargosDocente.ASOCIADO, 10));
        Docente docente2 = new Docente("Ramirez", "Ricardo", 3, new Cargo(CargosDocente.AYUDANTE_SEGUNA, 10));
        Docente docente3 = new Docente();
        docente3.setNombreCompleto("Gomez", "Maria");
        docente3.setFechaDeIngreso();
        docente3.setDocumento(5);
        docente3.agregarCargo(new Cargo(CargosDocente.JEFE_TRABAJOS_PRACTICOS, 5));
        
        NoDocente noDocente1 = new NoDocente("Lopez", "Raul", 2, Categoria.CATEGORIA_1);
        NoDocente noDocente2 = new NoDocente();
        noDocente2.setNombreCompleto("Armando", "Paredes");
        noDocente2.setFechaDeIngreso();
        noDocente2.setDocumento(15);
        noDocente2.setCategoria(Categoria.CATEGORIA_5);

        empleados.add(docente1);
        empleados.add(docente2);
        empleados.add(docente3);
        empleados.add(noDocente1);
        empleados.add(noDocente2);

        for (Empleado empleado : empleados) {
            System.out.println(empleado.toString());
        }
    }
}
