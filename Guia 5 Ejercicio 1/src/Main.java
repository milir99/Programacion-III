import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("Ingrese nombre:");
        String nombre= scan.next();
        System.out.println("Ingrese Edad: ");
        int edad = scan.nextInt();
        System.out.println("Ingrese genero (M/H): ");
        char genero= scan.next().charAt(0);
        System.out.println("Ingrese peso en kg: ");
        Double peso = scan.nextDouble();
        System.out.println("Ingrese altura en metros: ");
        Double altura = scan.nextDouble();
        Persona persona1 = new Persona(nombre,edad,genero,peso,altura);
        System.out.println(persona1.AString());
        Persona persona2 = new Persona("mili",21,'M',70,1.75);
        System.out.println(persona2.AString());
        Persona persona3 = new Persona();
        persona3.setAltura(1.90);
        persona3.setEdad(24);
        persona3.setGenero('H');
        persona3.setPeso(90);
        persona3.setNombre("tomi");
        System.out.println(persona3.AString());
        scan.close();
        int [] imb = new int [3];
        imb[0]= persona1.calcularIMC();
        imb[1]=persona2.calcularIMC();
        imb[2]=persona3.calcularIMC();
        for (int imc : imb) {
            if (imc == -1) {
                System.out.println("Por debajo del peso ideal.");
            } else if (imc == 0) {
                System.out.println("En su peso ideal.");
            } else if (imc == 1) {
                System.out.println("Tiene sobrepeso.");
            } else {
                System.out.println("Valor de IMC no válido.");
            }
        }
        System.out.println("Es mayor de edad: " + persona1.esMayorDeEdad());
        System.out.println("Es mayor de edad: " + persona2.esMayorDeEdad());
        System.out.println("Es mayor de edad: " + persona3.esMayorDeEdad());


    }
}