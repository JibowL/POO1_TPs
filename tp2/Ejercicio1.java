/* Escriba un programa que lea un String que puede contener espacios en blanco e imprima:
    • El largo del String leido.
    • Si comienza con “Hola”.
    • Si termina con “forma”.
    • Reemplace las ocurrencias de “a” por “b” */

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa un String: ");
        String cadena = sc.nextLine();

        // Largo del String
        int largo = cadena.length();
        System.out.println("El largo del String es: " + largo);

        // Comienza con "Hola"
        if (cadena.startsWith("Hola")) {
            System.out.println("El String comienza con Hola.");
        } else {
            System.out.println("El String no comienza con Hola.");
        }

        // Termina con "forma"
        if (cadena.endsWith("forma")) {
            System.out.println("El String termina con forma.");
        } else {
            System.out.println("El String no termina con forma.");
        }

        // Reemplaza las ocurrencias de "a" por "b"
        String cadenaModificada = cadena.replace('a', 'b');
        System.out.println("El String modificado es: " + cadenaModificada);

        sc.close();
    }
}
