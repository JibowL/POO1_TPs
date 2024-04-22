/*Escriba un programa que solicite al usuario que ingrese una cadena y muestra el número de
letras mayúsculas en la cadena. */

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese una cadena: ");
        String cadena = in.nextLine();
        in.close();

        int longitud = cadena.length();
        int mayusculas = 0;

        for (int i = 0; i < longitud; i++) {
            if (Character.isUpperCase(cadena.charAt(i))) {
                mayusculas++;
            }
        }

        System.out.println("La cadena " + cadena + " tiene " + mayusculas + " mayusculas");
    }
}
