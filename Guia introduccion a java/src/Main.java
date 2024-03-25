import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int contador = 0;
        System.out.println("Bienvenido");
        System.out.println("Por favor, elija una opción:");
        System.out.println("1. Calcular el promedio");
        System.out.println("2. Calcular si un número es par o no.");
        System.out.println("3. Mostrar los primeros 100 números primos.");
        System.out.println("4. Mostrar los primeros n numeros primos.");
        System.out.println("6. Mostrar si el numero ingresado es primo.");
        System.out.println("7. Encontrar la suma de los pri eros 10 numeros naturales");
        System.out.println("8. Saber cuantos numeros positivos ingresa un usuario");
        System.out.println("9. Revisar si un anio ingresado es bisiesto o no.");
        System.out.println("10.Encontrar el valor ASCII de un caracter.");
        System.out.println("11.Multiplicar dos numeros.");


        Scanner scanner = new Scanner(System.in);
        int opcion = scanner.nextInt();


        // Utilizar un switch para ejecutar el código correspondiente a la opción ingresada
        switch (opcion) {
            case 1:
                int[] arreglo = {2, 2};
                int suma = 0;
                for (int j : arreglo) {
                    suma = suma + j;
                }
                double promedio = (double) suma / arreglo.length;
                System.out.println("el promedio del arreglo es de:" + promedio);
                break;
            case 2:
                Scanner scan = new Scanner(System.in);
                System.out.println("Ingrese el numero que desea saber si es par o no");
                int num = scan.nextInt();
                if (num % 2 == 0) {
                    System.out.println("es un numero par");
                } else {
                    System.out.println("No es par");
                }
                scan.close();
                break;
            case 3:

                for (int numero = 2; numero <= 100; numero++) {
                    boolean esPrimo = true;
                    for (int i = 2; i <= Math.sqrt(numero); i++) {
                        if (numero % i == 0) {
                            esPrimo = false;
                            break;
                        }
                    }
                    if (esPrimo) {
                        System.out.println(numero + " es primo");
                        contador++;
                    }
                }
                System.out.println("Hay " + contador + " numeros primos entre 1 y 100");


                break;
            case 4:
                Scanner scanear = new Scanner(System.in);
                System.out.println("Ingres la cantidad de numero primos que quiere saber");
                int cant = scanear.nextInt();
                int actual = 2;
                while (contador < cant) {
                    boolean esPrimo = true;

                    for (int i = 2; i <= Math.sqrt(actual); i++) {
                        if (actual % i == 0) {
                            esPrimo = false;
                            break;
                        }
                    }
                    if (esPrimo) {
                        System.out.println(contador + 1 + ". el numero " + actual + " es primo");
                        contador++;
                    }
                    actual++;
                }
                scanear.close();
                break;
            case 6:
                Scanner scaneare = new Scanner(System.in);
                char eleccion = 's';
                while (eleccion == 's') {
                    System.out.println("Ingres un numero que desea saber si es primo");
                    int numero = scaneare.nextInt();
                    boolean esPrimo = true;
                    for (int i = 2; i <= Math.sqrt(numero); i++) {
                        if (numero % i == 0) {
                            esPrimo = false;
                            break;
                        }
                    }
                    if (esPrimo) {
                        System.out.println(numero + " es primo");
                    } else {
                        System.out.println(numero + " NO  es primo");
                    }
                    System.out.println("Desea probar con otro numero? s/n");
                    eleccion = scaneare.next().charAt(0);


                }
                scaneare.close();

                break;
            case 7:
                int sumar = 0;
                for (int i = 1; i <= 10; i++) {
                    sumar = sumar + i;
                }
                System.out.println("La suma de los 10 primeros numero naturales es de " + sumar);

                break;
            case 8:
                Scanner numerospn = new Scanner(System.in);
                char respuesta = 's';
                int numpon;
                int positivos = 0;
                while (respuesta == 's') {
                    System.out.println("Ingrese numero");
                    numpon = numerospn.nextInt();
                    if (numpon > 0) {
                        positivos++;
                    }
                    System.out.println("Desea ingresar otro numero?");
                    respuesta = numerospn.next().charAt(0);
                }
                System.out.println("El usuario ingreso " + positivos + " numeros positivos.");
                numerospn.close();
                break;
            case 9:
                Scanner anioB = new Scanner(System.in);
                System.out.println("Ingrese el anio a analizar:");
                int anio = anioB.nextInt();
                if ((anio % 4 == 0 && anio % 100 != 0) || anio % 400 == 0) {
                    System.out.println("El anio " + anio + " es bisiesto");
                } else {
                    System.out.println("El anio " + anio + " NO es bisiesto");
                }
                anioB.close();
                break;
            case 10:
                Scanner Carac = new Scanner(System.in);
                System.out.println("Ingrese el caracter del cual desea saber su ASCII");
                char caracter = Carac.next().charAt(0);
                System.out.println("EL valor en ASCII del caracter '"+ caracter+"' es de "+ (int)caracter);
                Carac.close();

                break;
            case 11:
                Scanner multiplicar = new Scanner(System.in);
                System.out.println("Ingres el primer numero a utilizar en la multiplicacion");
                int num1 = multiplicar.nextInt();
                System.out.println("Ingrese el segundo numero para ultilizar en la multiplicacion");
                int num2 = multiplicar.nextInt();
                int multiplicacion = num1 * num2;
                System.out.println("La multiplicacion de "+ num1+"x"+ num2+ " es igual a "+ multiplicacion);
                multiplicar.close();
                break;

            default:
                System.out.println("Opción no válida. Por favor, elija una opción del 1 al 6.");
        }

        scanner.close();


    }

}