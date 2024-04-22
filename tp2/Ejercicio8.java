/*Escriba un programa que solicite al usuario que ingrese dos cadenas y muestre el prefijo común
más grande de las dos cadenas. */

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Ingrese dos cadenas: ");
        String cadena1 = in.nextLine();
        String cadena2 = in.nextLine();
        in.close();

        String prefijoComun = obtenerPrefijoComun(cadena1, cadena2);
        if (prefijoComun.isEmpty()) {
            System.out.println(cadena1 + " y " + cadena2 + " no tienen prefijo comun");
        } else {
            System.out.println("El prefijo comun es: " + prefijoComun);
        }
    }

    public static String obtenerPrefijoComun(String cadena1, String cadena2) {
        int minLenght = Math.min(cadena1.length(), cadena2.length());
        StringBuilder prefijoComun = new StringBuilder();

        for (int i = 0; i < minLenght; i++) {
            if (cadena1.charAt(i) == cadena2.charAt(i)) {
                prefijoComun.append(cadena1.charAt(i));
            } else {
                break;
            }
        }

        return prefijoComun.toString();
    }
}
