/*Usando solo el operador condicional, escriba un programa que lea tres enteros e imprima el más
grande. Luego utilice Math.max.*/

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Ingresa tres numeros wachin");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();
        int max = 0;

        if (num1 > num2) {
            max = num1;
        } else if (num2 > num3) {
            max = num2;
        } else {
            max = num3;
        }

        System.out.println("El maximo (if) es: " + max);
        System.out.println("El maximo (Math.max) es " + Math.max(num1, Math.max(num2, num3)));

        in.close();
    }
}
