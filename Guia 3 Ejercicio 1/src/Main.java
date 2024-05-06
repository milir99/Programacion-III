//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
      Autor autor1 = new Autor("Joshua", "Bloch", "joshua@email.com", 'M');
      System.out.println(autor1.imprimirAutor());
      Libro libro1 = new Libro("Effective Java",450,150,autor1);
      System.out.println( libro1.imprimirDatos() );
      libro1.setPrecio(500);
      libro1.aumentarStock(50);
     System.out.println( libro1.imprimirAutor());
      System.out.println(libro1.imprimirMensaje());

    }
}