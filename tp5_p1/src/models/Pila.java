package models;

public class Pila {

    //crea un array pila
    private int[] pila;
    private int tope;

    public Pila(int n){
        pila = new int[n];
        tope = 0;
    }

    public void apilar(int valor){
        if(tope < pila.length){
            pila[tope] = valor;
            tope++;
        } else {
            System.out.println("Pila llena");
        }
    }

    public void desapilar(){
        if(tope > 0){
            tope--;
            System.out.println("Elemento desapilado: " + pila[tope]);
        } else {
            System.out.println("Pila vacia");
        }
    }

    public int cantidadElementos(){
        return tope;
    }

    public void imprimirPila(){
        System.out.println("Elementos de la pila:");
        for(int i = 0; i < tope; i++){
            System.out.println("[ " + pila[i] + " ]");
        }
    }
}