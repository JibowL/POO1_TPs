import models.*;

public class App {
    public static void main(String[] args) throws Exception {
        
        Pila pila1 = new Pila(5);

        pila1.apilar(10);
        pila1.apilar(20);

        System.out.println("Cantidad de elementos: " + pila1.cantidadElementos() + "\n");

        pila1.apilar(30);
        pila1.apilar(40);
        pila1.apilar(50);

        System.out.println("Cantidad de elementos: " + pila1.cantidadElementos() + "\n");

        pila1.apilar(60);

        System.out.println("\n" + "Cantidad de elementos: " + pila1.cantidadElementos() + "\n");
        pila1.imprimirPila();

        pila1.desapilar();
        pila1.desapilar();
        pila1.desapilar();

        System.out.println("\n" + "Cantidad de elementos: " + pila1.cantidadElementos() + "\n");
        pila1.imprimirPila();

        pila1.desapilar();
        pila1.desapilar();
        pila1.desapilar();

        System.out.println("\n" + "Cantidad de elementos: " + pila1.cantidadElementos() + "\n");

        pila1.apilar(100);

        System.out.println("Cantidad de elementos: " + pila1.cantidadElementos());

        pila1.desapilar();
    }
}
