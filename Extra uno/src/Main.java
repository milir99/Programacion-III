import ejercicio1.saludobienvanida;
import ejercicio2.Productos;
import ejercicio3.Personas;


import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int ejercicio;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("1.Saludo de bienvenida");
            System.out.println("2.Total de una compra");
            System.out.println("3.Estadistica de personas");
            System.out.println("4.To do list");
            System.out.println("5.Cuenta bancaria");
            System.out.println("6.indice de masa corporal");
            System.out.println("0.Salir del programa");
            System.out.println("Scanner hasNextInt(): " + scan.hasNextInt());

            if (scan.hasNext()) {
                ejercicio = scan.nextInt();
                // Procesar el elemento
                System.out.println(ejercicio);
            } else {
                ejercicio = 0;

            }

            switch (ejercicio) {
                case 1:
                    System.out.println("Ingrese su nombre");
                    String nombre = scan.next();
                    System.out.println("Ingrese su edad");
                    int edad = scan.nextInt();
                    scan.nextLine();
                    saludobienvanida saludo1 = new saludobienvanida(nombre, edad);
                    imprimirNombre(saludo1);
                    break;
                case 2:
                    System.out.println("A continuacion debere ingresar los datos de los productos a comprar");
                    Productos[] lista = crearListaDeCompras(50);
                    System.out.println("Scanner hasNextInt(): " + scan.hasNextInt());
                    double total = TotalCompra(lista);
                    System.out.printf("El valor Total de su compra es de %.2f\n ", total);
                    break;
                case 3:
                    Personas[] lista1 =listaDePersonas(50);
                    double validos = cantPersonasEnLista(lista1);
                    imprimirLista(lista1);
                   double porcMuejeres = PorcentajePorGenero('M',lista1,validos);
                   double porcHombres = PorcentajePorGenero('H',lista1,validos);
                   double promedioEdades = PromedioDeEdades(lista1,validos);
                   System.out.printf("El porcentaje de mujeres de la lista es de %.2f\n",porcMuejeres);
                    System.out.printf(" El porcentaje de Hombres de la lista es de %.2f\n",porcHombres);
                    System.out.printf("El promedio de edades es de %.0f\n",promedioEdades);

                    break;
                default:
                    if (ejercicio != 0)
                        System.out.println("No ha ingresado una opcion correcta, intentelo otra vez");
                    break;
            }


        } while (ejercicio != 0);
        scan.close();
    }

    public static void imprimirNombre(saludobienvanida saludo1_p) {
        System.out.println("¡Bienvenidad " + saludo1_p.getNombre() + " de " + saludo1_p.getEdad() + " Anios!");
    }

    public static Productos[] crearListaDeCompras(int cantMax) {
        Scanner scan2 = new Scanner(System.in);
        char eleccion;
        int cantidadProductosIngresados = 0; //inicializo la cantidad de productos de la lista
        Productos[] listaDeCompras = new Productos[cantMax];//Inicializo lista de compras

        do {
            System.out.println("Desea ingresar un producto para comprar? Y/N");
            eleccion = Character.toUpperCase(scan2.next().charAt(0));
            if (eleccion == 'Y') {
                System.out.println("Ingrese los datos del producto:");
                System.out.println("Nombre:");
                String nombre = scan2.next();

                System.out.println("Precio:");
                double precio = scan2.nextDouble();


                System.out.println("Cantidad:");
                int cantidad = scan2.nextInt();


                // Crear un nuevo objeto Productos con los datos ingresados
                Productos producto = new Productos(nombre, precio, cantidad);

                // Agregar el producto a la lista de compras
                if (cantidadProductosIngresados < listaDeCompras.length) {
                    listaDeCompras[cantidadProductosIngresados] = producto;
                    cantidadProductosIngresados++;
                } else {
                    System.out.println("No hay suficiente espacio en la lista de compras.");
                    break; // Salir del bucle si no hay espacio disponible
                }


            } else if (eleccion != 'N') {

                System.out.println("Opción no válida. Por favor, ingrese Y o N.");
                eleccion = 'Y';

            }
        } while (eleccion == 'Y');
        scan2.close();
        return listaDeCompras;
    }

    public static double TotalCompra(Productos[] listaDeCompras) {
        // Recorre el array y multiplica precio por cantidad updteando el total, para al final devolverlo
        double total = 0;

        for (Productos producto : listaDeCompras) {
            if (producto != null) { // Verifica si el producto no es null
                total += producto.getPrecio() * producto.getCantidad();
            }
        }
        return total;
    }


    public static Personas[] listaDePersonas(int cantMax) {
        int cantidadPersonas = 0;
        Personas[] lista = new Personas[cantMax];
        Scanner scan = new Scanner(System.in);
        char eleccion;
        do {

            System.out.println("Ingrese los datos Pedidos:");
            System.out.println("Nombre:");
            String nombre = scan.next();

            System.out.println("Edad:");
            int edad = scan.nextInt();

            System.out.println("Genero (m/h):");
            char genero = Character.toUpperCase(scan.next().charAt(0));
            Personas persona = new Personas(nombre,edad,genero);

            // Agregar el producto a la lista de compras
            if (cantidadPersonas < lista.length) {

                lista[cantidadPersonas] = persona;

                System.out.println("Datos ingresados correctamente:");

                cantidadPersonas++;
                System.out.println("Desea ingresar otra persona? Y/N");
                eleccion = Character.toUpperCase(scan.next().charAt(0));
                while (eleccion != 'N' && eleccion != 'Y') {
                    System.out.println("Opción no válida. Por favor, ingrese Y o N.");
                    eleccion = Character.toUpperCase(scan.next().charAt(0));

                }

            } else {
                System.out.println("No hay suficiente espacio en la lista de compras.");
                break; // Salir del bucle si no hay espacio disponible
            }
        } while (eleccion == 'Y');
        scan.close();

        return lista;
    }
    public static double cantPersonasEnLista (Personas[] lista) {

        double contador =0;
        for (Personas persona : lista) {
            if (persona != null) {

                contador++;
            }
        }
        return contador;
    }

    public static double PromedioDeEdades (Personas[] lista, double validos) {
        double total = 0;
        for (Personas persona : lista) {
            if (persona != null) {
              total+= persona.getEdad();
            }
        }

        return total/validos;
    }
    public static double PorcentajePorGenero (char genero, Personas[]lista,double validos) {
        double total = 0;
        double porcentaje =0;
        for (Personas persona : lista) {

                if (persona != null && persona.getGenero() == genero) {
                    total++;

                }
        }
        if (validos > 0 && total>0) {
            porcentaje = (total / validos) * 100;
        }

        return porcentaje;

    }
    public static void imprimirLista(Personas  [] lista) {
        System.out.println("Datos de la lista de personas:");
        for (Personas persona : lista) {
            if (persona != null) {
                System.out.println("Nombre: " + persona.getNombre());
                System.out.println("Edad: " + persona.getEdad());
                System.out.println("Género: " + persona.getGenero());
                System.out.println("--------------------------");
            }
        }
    }
}