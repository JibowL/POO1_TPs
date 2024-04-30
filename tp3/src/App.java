import java.math.BigDecimal;
import models.Cuenta;
import models.Ventilador;

public class App {
    public static void main(String[] args) {
        //se crea una cuenta con nro. de cuenta 1122 y tasa de interes anual 4.5%
        Cuenta cuenta1 = new Cuenta(1122, BigDecimal.valueOf(20000));
        cuenta1.setTasaInteresAnual(BigDecimal.valueOf(4.5));

        //se realiza un retiro de 2500 y un deposito de 3000 y se imprime
        cuenta1.retirar(BigDecimal.valueOf(2500));
        cuenta1.depositar(BigDecimal.valueOf(3000));
        System.out.println(cuenta1);

        //se crea una cuenta por defecto con nro. de cuenta 2234 y se imprime
        Cuenta cuenta2 = Cuenta.crearCuentaSimple(2234);
        System.out.println(cuenta2);

        //se crean los ventiladores
        Ventilador liliana = new Ventilador();
        liliana.setVelocidad(Ventilador.RAPIDO);
        liliana.setRadio(10);
        liliana.setColor("amarillo");
        liliana.encender();

        Ventilador brisa = new Ventilador();
        brisa.setVelocidad(Ventilador.MEDIO);
        brisa.setRadio(5);
        brisa.setColor("azul");
        brisa.apagar();

        //se imprime la info de los ventiladores
        System.out.println("Liliana:\n" + liliana);
        System.out.println("Brisa:\n" + brisa);
        
    }
}
