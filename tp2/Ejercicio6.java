/*Escriba un programa que lea una cadena e imprima todas sus subcadenas no vacías */

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Ingrese una cadena: ");
        String cadena = in.nextLine();
        in.close();

        for (int i = 0; i < cadena.length(); i++) {
            for (int j = i; j < cadena.length(); j++) {
                System.out.println(cadena.substring(i, j + 1));
            }
        }
    }
}
