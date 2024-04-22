/*Escriba un programa que solicite al usuario que ingrese una cadena y muestre el número de
vocales (a, e, i, o, u) y consonantes (el resto de los caracteres) que contiene. */

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Ingrese una cadena:");
        String cadena = in.nextLine();
        in.close();

        String cadenaSinEspacios = cadena.replaceAll("[ ]", "");
        String cadenaSinVocales = cadenaSinEspacios.replaceAll("[aeiouAEIOU]", "");

        int cantConsonantes = cadenaSinVocales.length();
        int cantVocales = (cadenaSinEspacios.length() - cadenaSinVocales.length());

        System.out.println(
                "La cadena " + cadena + " tiene " + cantVocales + " vocales y " + cantConsonantes + " consonantes.");
    }
}
