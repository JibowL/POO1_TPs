package models;

import java.util.LinkedList;
import java.util.Queue;

public class Cola<T> extends Pila<T> implements InterfaceCola<T>{
    private Queue<T> elementos = new LinkedList<>();

    @Override
    public T quitar(){
        if (!elementos.isEmpty()) {
            System.out.println("Elemento quitado: " + elementos.peek());
            return elementos.poll();
        }
        throw new IllegalStateException("La cola está vacia");
    }

    @Override
    public T obtenerSinQuitar(){
        if (!elementos.isEmpty()) {
            return elementos.peek();
        }
        throw new IllegalStateException("La cola está vacia");
    }
}
