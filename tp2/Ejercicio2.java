/* Desarrolle un programa que lea desde el teclado un valor entero y obtenga el resultado de hacer 2
x PI x E x el valor ingresado. Use de ser posible constantes definidas en la clase Math. */

import java.util.Scanner;

public class Ejercicio2 {

    final static double pi = Math.PI;
    final static double e = Math.E;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Ingresa un numero wacho: ");
        int numero = in.nextInt();

        System.out.println("El resultado de 2 * pi * e * " + numero + " es: " + calculo(numero));

        in.close();
    }

    public static double calculo(int entrada) {
        double resultado = 2 * pi * e * entrada;
        return resultado;
    }
}
