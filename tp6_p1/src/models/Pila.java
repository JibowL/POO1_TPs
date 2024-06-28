package models;

import java.util.ArrayList;
import java.util.List;

public class Pila<T> implements InterfacePila<T> {
    private List<T> elementos = new ArrayList<>();

    @Override
    public void agregar(T elemento) {
        elementos.add(elemento);
    }

    @Override
    public T quitar() {
        if (!elementos.isEmpty()) {
            System.out.println("Elemento quitado: " + elementos.get(elementos.size() - 1));
            return elementos.remove(elementos.size() - 1);
        }
        throw new IllegalStateException("La pila está vacía");
    }

    @Override
    public T obtenerSinQuitar() {
        if (!elementos.isEmpty()) {
            System.out.println("Elemento obtenido: " + elementos.get(elementos.size() - 1));
            return elementos.get(elementos.size() - 1);
        }
        throw new IllegalStateException("La pila está vacía");
    }

    @Override
    public int tamaño(){
        return elementos.size();
    }
}
