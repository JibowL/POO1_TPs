/*Escriba un programa que debe crear un objeto StringBuilder, luego usando los métodos del
objeto se debe agregar el texto “aloh”, insertar al inicio el texto “avaj ” y luego invertir el contenido.
Para finalizar se debe guardar el contenido del objeto StringBuilder en un String e imprimirlo.*/

public class Ejercicio4 {
    public static void main(String[] args) {
        StringBuilder volteador = new StringBuilder();

        volteador.append(" aloh");
        volteador.insert(0, "avaj");
        volteador.reverse();

        String volteado = volteador.toString();
        System.out.println(volteado);
    }
}
