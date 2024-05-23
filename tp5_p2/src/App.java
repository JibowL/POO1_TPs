import models.*;

public class App {
    public static void main(String[] args) throws Exception {

        Docente docente1 = new Docente("Perez", "Juan", 1, new Cargo(CargosDocente.ADJUNTO, 20));
        docente1.agregarCargo(new Cargo(CargosDocente.ASOCIADO, 10));
        Docente docente2 = new Docente("Ramirez", "Ricardo", 3, new Cargo(CargosDocente.AYUDANTE_SEGUNA, 10));
        Docente docente3 = new Docente();
        docente3.setNombreCompleto("Gomez", "Maria");
        docente3.setFechaDeIngreso();
        docente3.agregarCargo(new Cargo(CargosDocente.JEFE_TRABAJOS_PRACTICOS, 5));
        
        NoDocente noDocente1 = new NoDocente("Lopez", "Raul", 2, Categoria.CATEGORIA_1);

        System.out.println(docente1);
        System.out.println(docente2);
        System.out.println(docente3);
        System.out.println(noDocente1);
    }
}
