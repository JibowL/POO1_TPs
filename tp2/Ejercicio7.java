/*Escriba un programa que solicite el ingreso de enteros hasta que se ingrese un valor cero, cuando
suceda esto se debe imprimir el promedio, máximo y mínimo (no se debe considerar el cero
ingresado). */

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<Integer> listaEnteros = new ArrayList<>();
        System.out.println("Ingrese una lista de enteros finalizando con 0:");

        int valor = in.nextInt();

        while (valor != 0) {
            listaEnteros.add(valor);
            valor = in.nextInt();
        }

        if (listaEnteros.isEmpty()) {
            System.out.println("La lista esta vacia");
        } else {
            int max = listaEnteros.get(0);
            int min = listaEnteros.get(0);

            for (int i = 0; i < listaEnteros.size(); i++) {
                if (listaEnteros.get(i) < min) {
                    min = listaEnteros.get(i);
                }
                if (listaEnteros.get(i) > max) {
                    max = listaEnteros.get(i);
                }
            }

            int suma = 0;
            for (int num : listaEnteros) {
                suma += num;
            }

            double promedio = (double) suma / listaEnteros.size();

            System.out.println("La lista ingresda es: " + listaEnteros);
            System.out.println("El maximo es: " + max + " y el minimo es " + min);
            System.out.printf("El promedio es %.3f", promedio);
        }

        in.close();
    }
}