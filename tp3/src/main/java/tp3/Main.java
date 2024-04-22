package tp3;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        Cuenta cuenta1 = new Cuenta(1122, BigDecimal.valueOf(20000));
        cuenta1.setTasaInteresAnual(BigDecimal.valueOf(4.5));

        cuenta1.retirar(BigDecimal.valueOf(2500));
        cuenta1.depositar(BigDecimal.valueOf(3000));
        System.out.println(cuenta1);

        //cree una cuenta por defecto con nro. de cuenta 2234
        Cuenta cuenta2 = Cuenta.crearCuentaSimple(2234);
        System.out.println(cuenta2);

    }
}