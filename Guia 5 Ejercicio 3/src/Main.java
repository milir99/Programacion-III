import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int longLista=5;
        Password  [] lista = new Password[longLista];
        System.out.println("Ingrese la longitud de la contrasenia: ");
       int longitud =scan.nextInt();
       boolean [] estado = new boolean[longLista];
       for(int i=0; i<longLista;i++)
        {
            lista[i]=new Password(longitud);
            estado[i]=lista[i].esFuerte();
        }
       for(int i=0;i<longLista;i++)
       {
           System.out.println("Contrasenia numero "+(i+1));
           System.out.println(lista[i].getContrasenia());
           System.out.println("La contrasenia es fuerte? "+ estado[i]);
       }

    }
}