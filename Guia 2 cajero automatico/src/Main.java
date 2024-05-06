import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Cuenta cuentaUno = new Cuenta();
        int opcion;
        do {
            System.out.println("\n Bienvenido");
            System.out.println("1. Crear cuenta vacía");
            System.out.println("2. Crear cuenta saldo inicial");
            System.out.println("3. Ingresar dinero");
            System.out.println("4. Sacar dinero");
            System.out.println("5. Ver saldo");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
             opcion = scan.nextInt();
            switch (opcion) {
                case 1:
                    cuentaUno = new Cuenta();
                    break;
                case 2:
                    System.out.println("Ingrese el saldo de la cuenta");
                    float saldoInicial = scan.nextFloat();
                    cuentaUno = new Cuenta(saldoInicial);
                    break;
                case 3:
                    System.out.println("Cuanto dinero ingresa?");
                    float dineroIngresado = scan.nextFloat();
                    cuentaUno.ingresa(dineroIngresado);
                    System.out.println("Dinero ingresado exitosamente");
                    break;
                case 4:
                    System.out.println("Cuanto dinero desea extraer?");
                    float extraer = scan.nextFloat();
                    if (cuentaUno.validacionAntesDeExtraccion(extraer)) {
                        cuentaUno.extraer(extraer);
                        System.out.println("Dinero extraido exitosamente");
                    } else {
                        System.out.println("Saldo insuficiente, no puede retirar esa cantidad de dinero");
                    }
                    break;
                case 5:

                        System.out.printf("Su saldo es de: %.2f", cuentaUno.getSaldo());

                    break;
                default:
                    if (opcion!=6)
                    {
                    System.out.println("Opcion ingresada es incorrecta intentelo otra vez");
                    }
                    break;
            }
        } while( opcion != 6);
        scan.close();

    }
}