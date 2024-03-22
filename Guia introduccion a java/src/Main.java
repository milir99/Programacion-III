import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido");
        System.out.println("Por favor, elija una opción:");
        System.out.println("1. Calcular el promedio");
        System.out.println("2. Calcular si un número es par o no.");
        System.out.println("3. Mostrar los primeros 100 números primos.");
        Scanner scanner = new Scanner(System.in);
        int opcion = scanner.nextInt();


        // Utilizar un switch para ejecutar el código correspondiente a la opción ingresada
        switch (opcion) {
            case 1:
                int [] arreglo = {2,2};
                int suma = 0;
                for (int j : arreglo) {
                    suma = suma + j;
                }
                double promedio= (double) suma / arreglo.length;
                System.out.println("el promedio del arreglo es de:" + promedio);
                break;
            case 2:
                Scanner scan = new Scanner (System.in);
                int num = scan.nextInt();
                if (num %2==0) {
                    System.out.println("es un numero par");
                }else
                {
                    System.out.println("No es par");}
                scan.close();
                break;
            case 3:
                System.out.println("La hora actual es: " + java.time.LocalTime.now());
                int contador



                break;
            default:
                System.out.println("Opción no válida. Por favor, elija una opción del 1 al 3.");
        }

        scanner.close();



    }




}