package Archivo;

import Biblioteca.Articulo;
import Biblioteca.Libro;
import Biblioteca.Material;
import Biblioteca.Revista;

import java.io.*;
import java.util.ArrayList;

public class ArchivoTXT {
    public void grabarArchivoTxt(String nombre, ArrayList<Material> listaMateriales) {
        ObjectOutputStream objectOutputStream = null;
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(nombre);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            for (Material material : listaMateriales) {
                    objectOutputStream.writeObject(material);

            }

        } catch (FileNotFoundException E) {
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {

                objectOutputStream.close();
            } catch (IOException ex) {

            }
        }

    }

    public  void leerArchivoTxt(String nombre,ArrayList<Material> listado)  {
        ObjectInputStream objectInputStream = null;
        try {
            FileInputStream fileInputStream = new FileInputStream(nombre);
            objectInputStream = new ObjectInputStream(fileInputStream);
            while (true) {
                Material material = (Material) objectInputStream.readObject();
                listado.add(material);
            }


        } catch (FileNotFoundException e) {
            System.out.println("No se encontro el archivo");
        } catch (IOException e) {
            System.out.println("Fin del archivo");
        } catch (ClassNotFoundException e) {
            System.out.println("nO SE ENCONTRO LA CLASE");
        }finally {
            try {

                objectInputStream.close();

            } catch (IOException e) {

            }

        }

    }
}
