package models;

public class Ventilador {
    //Constantes de las velocidades del ventilador
    public static final int LENTO = 1;
    public static final int MEDIO = 2;
    public static final int RAPIDO = 3;
    //atributos
    private int velocidad;
    private boolean encendido;
    private double radio;
    private String color;
    //getter y setter
    public int getVelocidad() {
        return velocidad;
    }
    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
    public boolean isEncendido() {
        return encendido;
    }
    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }
    public double getRadio() {
        return radio;
    }
    public void setRadio(double radio) {
        this.radio = radio;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    //constructor por defecto
    public Ventilador() {
        this.velocidad = LENTO;
        this.encendido = false;
        this.radio = 5;
        this.color = "azul";
    }
    //metodos encender y apagar
    public void encender() {
        this.encendido = true;
    }
    public void apagar() {
        this.encendido = false;
    }
    //metodo que devuelve una cadena que describe el ventilador
    @Override
    public String toString() {
        if (encendido) {
            return "\tVelocidad: " + velocidad +
                    "\n\tColor: " + color +
                    "\n\tRadio: " + radio + 
                    "\n";
        } else {
            return "\tEl ventilador esta apagado" +
            "\n\tColor: " + color +
            "\n\tRadio: " + radio + 
            "\n";
        }
    }
}
