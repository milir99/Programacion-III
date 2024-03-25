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
        System.out.println("12.Calcular area de rectangulo/cuadrado/triangulo/circulo.");
        System.out.println("13.Mensaje de bienvenida con nombre");
        System.out.println("14.Doble y Triple del numero ingresado");
        System.out.println("15.Centigrados a Fahrenheit");
        System.out.println("16.Radio y longitude de un circunferencia");
        System.out.println("17.Km a mph");
        System.out.println("18.Calculo de hipotenusa segun pitagoras");
        System.out.println("19.Calculo de maximo, minimo y promedio de temperaturas");
        System.out.println("20.Numeros random dentro de un rango ingresado");
        System.out.println("21.Dia laboral o no");
        System.out.println("22.Saber cantidad de cifras de un numero");
        System.out.println("23.CalculadoraPolacaInversaApp");
        Scanner scan = new Scanner(System.in);
        int opcion = scan.nextInt();


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
                System.out.println("Ingres la cantidad de numero primos que quiere saber");
                int cant = scan.nextInt();
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

                break;
            case 6:

                char eleccion = 's';
                while (eleccion == 's') {
                    System.out.println("Ingres un numero que desea saber si es primo");
                    int numero = scan.nextInt();
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
                    eleccion = scan.next().charAt(0);


                }


                break;
            case 7:
                int sumar = 0;
                for (int i = 1; i <= 10; i++) {
                    sumar = sumar + i;
                }
                System.out.println("La suma de los 10 primeros numero naturales es de " + sumar);

                break;
            case 8:
                char respuesta = 's';
                int numpon;
                int positivos = 0;
                while (respuesta == 's') {
                    System.out.println("Ingrese numero");
                    numpon = scan.nextInt();
                    if (numpon > 0) {
                        positivos++;
                    }
                    System.out.println("Desea ingresar otro numero?");
                    respuesta = scan.next().charAt(0);
                }
                System.out.println("El usuario ingreso " + positivos + " numeros positivos.");

                break;
            case 9:
                System.out.println("Ingrese el anio a analizar:");
                int anio = scan.nextInt();
                if ((anio % 4 == 0 && anio % 100 != 0) || anio % 400 == 0) {
                    System.out.println("El anio " + anio + " es bisiesto");
                } else {
                    System.out.println("El anio " + anio + " NO es bisiesto");
                }
                break;
            case 10:

                System.out.println("Ingrese el caracter del cual desea saber su ASCII");
                char caracter = scan.next().charAt(0);
                System.out.println("EL valor en ASCII del caracter '" + caracter + "' es de " + (int) caracter);


                break;
            case 11:

                System.out.println("Ingres el primer numero a utilizar en la multiplicacion");
                int num1 = scan.nextInt();
                System.out.println("Ingrese el segundo numero para ultilizar en la multiplicacion");
                int num2 = scan.nextInt();
                int multiplicacion = num1 * num2;
                System.out.println("La multiplicacion de " + num1 + "x" + num2 + " es igual a " + multiplicacion);

                break;
            case 12:
                int opcion2;
                System.out.println("Elija el area de que forma deseasacar");
                System.out.println("1. Rectangulo");
                System.out.println("2. Cuadrado");
                System.out.println("3. Triangulo");
                System.out.println("4. Circulo");

                opcion2 = scan.nextInt();
                float area;
                float base;
                float altura;


                switch (opcion2) {
                    case 1:
                        System.out.println("Ingrese la base del rectangulo:");
                        base = scan.nextFloat();
                        System.out.println("Ingrese la altura del rectangulo:");
                        altura = scan.nextFloat();
                        area = base * altura;
                        System.out.println("El area del rectangulo de base " + base + "y altura" + altura + "es de : " + area);
                        break;
                    case 2:
                        System.out.println("Ingrese valor de datos");
                        base = scan.nextFloat();
                        area = (float) Math.pow(base, 2);
                        System.out.println("El area del cuadrado de lado " + base + "es de : " + area);

                        break;
                    case 3:
                        System.out.println("Ingrese la base del rectangulo:");
                        base = scan.nextFloat();
                        System.out.println("Ingrese la altura del rectangulo:");
                        altura = scan.nextFloat();
                        area = (base * altura) / 2;
                        System.out.println("El area del triangulo de base " + base + "y altura" + altura + "es de : " + area);

                        break;
                    case 4:
                        System.out.println("Ingrese la radio del circulo:");
                        base = scan.nextFloat();
                        area = (float) Math.PI * (float) Math.pow(base, 2);
                        System.out.println("El area del circulo de radio " + base + "es de " + area);
                        break;
                    default:
                        System.out.println("Opción no válida. Por favor, elija una opción del 1 al 4.");

                }

                break;
            case 13:

                System.out.println("Ingrese su nombre");
                String nombre = scan.nextLine();
                System.out.println("Buenos dias " + nombre);
                scan.close();
                break;
            case 14:

                System.out.println("Ingrese el numero del cual desea saber su doble y triple");
                int numIngresado = scan.nextInt();
                System.out.println("EL doble del numero " + numIngresado + " es de " + numIngresado * 2 + "y el triple es " + numIngresado * 3);


                break;
            case 15:

                System.out.println("Ingrese los grados en centigrados");
                int C = scan.nextInt();
                int F = 32 + (9 * C / 5);
                System.out.println(C + "°C =" + F + "°F");

                break;
            case 16:
                System.out.println("Ingrese el radio de la circunferencia");
                int radio2 = scan.nextInt();
                double area2 = Math.PI * (Math.pow(radio2, 2));
                double longitud = 2 * Math.PI * radio2;
                System.out.println("EL area de la circunferencias es de " + area2 + " y su longitud es de " + longitud);
                break;
            case 17:

                System.out.println("Ingrese los kilometros ");
                double km = scan.nextInt();
                double Mph = km / 1.60934;
                System.out.printf("%.2f km = %.2f mph\n", km, Mph);
                break;
            case 18:

                System.out.println("Ingrese la longitude del primer cateto");
                double cateto1 = scan.nextDouble();
                System.out.println("Ingrese la longitude del segundo cateto");
                double cateto2 = scan.nextDouble();
                double longitudH = Math.sqrt((cateto1 * cateto1 + cateto2 * cateto2));
                System.out.println("La longitude la hipotenusa es de  " + longitudH);

                break;
            case 19:
                float[] temperaturas = new float[5];
                float sumat = 0;
                System.out.println("A continuacion ingrese las 30 temperaturas del mes ( recuerde usar coma y no punto");
                for (int i = 0; i < 5; i++) {
                    System.out.println("Dia " + (i + 1));
                    temperaturas[i] = scan.nextFloat();
                    sumat = sumat + temperaturas[i];

                }

                System.out.println("temperaturas " + sumat);
                float Promedio = sumat / (float) temperaturas.length;

                float Maxima = tempMaxima(temperaturas);
                float Minima = tempMinima(temperaturas);
                System.out.println("El promedio de temperatura del mes es de " + Promedio + "°C");
                System.out.println("La temperatura  Maxima  del mes es de " + Maxima + "°C");
                System.out.println("La temperatura Minima del mes es de " + Minima + "°C");

                break;
            case 20:
                System.out.println("Ingrese la base:");
                int primero = scan.nextInt();
                System.out.println("Ingrese el tope:");
                int ultimo = scan.nextInt();
                int []arr= new int[10];
                for(int i=0;i< 10;i++)
                {
                    arr[i] = (int) (Math.random() * (ultimo - primero + 1)) + primero;
                    System.out.println( (i+1)+".  "+arr[i]);

                }

                break;
            case 21:
                String mensaje;
                System.out.println("Ingrese un día de la semana:");
                String dia = scan.nextLine().toLowerCase();
                switch (dia) {
                    case "lunes":
                    case "martes":
                    case "miércoles":
                    case "miercoles":
                    case "jueves":
                    case "viernes":
                        mensaje = "Es un día laboral.";
                        break;
                    case "sábado":
                    case "sabado":
                    case "domingo":
                        mensaje = "No es un día laboral.";
                        break;
                    default:
                        mensaje = "Día inválido.";
                }

                System.out.println(mensaje);
                break;
            case 22:
                System.out.println("Ingrese un nUmero entero positivo:");
                int numero = scan.nextInt();
                int conta = 0;
                int numTemp = numero;
                while (numTemp != 0) {
                    numTemp = numTemp / 10;
                    conta++;
                }
                if (conta == 0) {
                    System.out.println("El número tiene 1 dígito.");
                } else {
                    System.out.println("El número tiene " + conta + " dígitos.");
                }
                break;
            case 23:
                System.out.println("Ingrese el primer número:");
                num1 = scan.nextInt();

                System.out.println("Ingrese el segundo número:");
                num2 = scan.nextInt();

                System.out.println("Ingrese el signo aritmético (+, -, *, /, ^, %):");
                String signo = scan.next();

                double resultado = 0;
                switch (signo) {
                    case "+":
                        resultado = num1 + num2;
                        break;
                    case "-":
                        resultado = num1 - num2;
                        break;
                    case "*":
                        resultado = num1 * num2;
                        break;
                    case "/":
                        resultado = (double) num1 / num2;
                        break;
                    case "^":
                        resultado = Math.pow(num1, num2);
                        break;
                    case "%":
                        resultado = num1 % num2;
                        break;
                    default:
                        System.out.println("Signo aritmético no válido.");
                        return;
                }


                System.out.println("El resultado es: " + resultado);

                break;
            default:
                System.out.println("Opción no válida. Por favor, elija una opción del 1 al 6.");
        }

        scan.close();


    }

    public static float tempMinima(float[] temperatura) {
        float minima = temperatura[0];
        for (int i = 1; i < temperatura.length; i++) {
            if (temperatura[i] < minima) {
                minima = temperatura[i];
            }
        }
        return minima;
    }

    public static float tempMaxima(float[] temperatura) {
        float maxima = temperatura[0];
        for (int i = 1; i < temperatura.length; i++) {
            if (temperatura[i] > maxima) {
                maxima = temperatura[i];
            }
        }
        return maxima;
    }
}



