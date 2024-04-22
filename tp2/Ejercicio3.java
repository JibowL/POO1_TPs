/* Usando métodos de la clase Math, se debe desarrollar un programa que solicite al usuario el
ingreso de un valor expresado en radianes y obtenga e imprima el seno, coseno y tangente de dicho
valor */

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("ingresa un valor wachin: ");
        double entrada = in.nextDouble();

        double seno = Math.sin(entrada);
        double coseno = Math.cos(entrada);
        double tangente = Math.tan(entrada);

        System.out.println("Seno: " + seno);
        System.out.println("Coseno: " + coseno);
        System.out.println("Tangente: " + tangente);

        in.close();
    }
}
