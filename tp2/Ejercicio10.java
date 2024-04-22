/*Escriba un programa que solicite al usuario que ingrese una cadena y muestre los caracteres en
posiciones impares */

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese una cadena: ");
        String cadena = in.nextLine();
        in.close();

        int longitud = cadena.length();

        for (int i = 0; i < longitud; i++) {
            if (i % 2 != 0) {
                System.out.print(cadena.charAt(i));
            }
        }
    }
}