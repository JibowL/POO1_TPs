/*Escriba un programa que muestre la siguiente tabla (tenga en cuenta que 1 milla son 1,609
kilómetros) */

public class Ejercicio12 {
    public static void main(String[] args) {

        double kilometros = 0;
        final double mlToKm = 1.609;

        System.out.println("Millas\tKilómetros");
        for (int i = 1; i <= 10; i++) {
            kilometros = i * mlToKm;
            System.out.println(i + "\t" + kilometros);
        }
    }
}