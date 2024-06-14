import Archivo.ArchivoTXT;
import Archivo.ManejarJson;
import Biblioteca.Biblioteca;
import Biblioteca.Libro;
import Biblioteca.Material;
import Biblioteca.Revista;
import Biblioteca.Articulo;

import java.util.ArrayList;

public class GestionDeBiblioteca {
    public static void gestionDeBiblioteca() {

        Libro libro1 = new Libro("El señor de los anillos", "J.R.R. Tolkien", 1954, 10, true, 1000);
        Libro libro2 = new Libro("Cien años de soledad", "Gabriel García Márquez", 1967, 8, true, 500);
        Libro libro3 = new Libro("1984", "George Orwell", 1949, 5, true, 300);

        // Crear algunas revistas
        Revista revista1 = new Revista("National Geographic", "National Geographic Society", 2021, 5, true, 100, true);
        Revista revista2 = new Revista("Time", "Time Inc.", 2021, 7, true, 50, false);
        Revista revista3 = new Revista("Scientific American", "Springer Nature", 2021, 3, true, 80, true);

        // Crear algunos artículos
        Articulo articulo1 = new Articulo("Artículo 1", "Autor 1", 2021, 3, true, "Resumen del artículo 1");
        Articulo articulo2 = new Articulo("Artículo 2", "Autor 2", 2021, 4, true, "Resumen del artículo 2");
        Articulo articulo3 = new Articulo("Artículo 3", "Autor 3", 2021, 2, true, "Resumen del artículo 3");
        Articulo articulo4 = new Articulo("Artículo 4", "Autor 4", 2021, 1, true, "Resumen del artículo 4");

        // Crear una lista para almacenar los materiales
        Biblioteca<Material> biblioteca = new Biblioteca<Material>();

        // Agregar los materiales a la biblioteca
        biblioteca.agregar(libro1);
        biblioteca.agregar(libro2);
        biblioteca.agregar(libro3);
        biblioteca.agregar(revista1);
        biblioteca.agregar(revista2);
        biblioteca.agregar(revista3);
        biblioteca.agregar(articulo1);
        biblioteca.agregar(articulo2);
        biblioteca.agregar(articulo3);
        biblioteca.agregar(articulo4);
        //System.out.println(biblioteca.listarMateriales());
        ArchivoTXT archivoTXT = new ArchivoTXT();

        archivoTXT.grabarArchivoTxt("biblioteca.txt",biblioteca.getListaDeMateriales());
        ArrayList<Material> listado = new ArrayList<>();
        archivoTXT.leerArchivoTxt("biblioteca.txt",listado);
        //System.out.println(listado);
        ManejarJson manejarJson = new ManejarJson();
        manejarJson.javaAJson("bibliotecaJ",listado);
        ArrayList<Material> listadoJson = new ArrayList<>();
        manejarJson.jsonAJava("bibliotecaJ",listadoJson);
       // System.out.println(listadoJson);



    }
}
