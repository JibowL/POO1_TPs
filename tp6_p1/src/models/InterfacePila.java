package models;

public interface InterfacePila<T> {
    void agregar(T elemento);
    T quitar();
    T obtenerSinQuitar();
    int tamaño();
}
