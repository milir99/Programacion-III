package Biblioteca;

import Excepciones.MaterialNoEncontradoException;

import java.util.ArrayList;

public class Biblioteca<E extends Material> {
    ArrayList<E> listaDeMateriales;

    public Biblioteca() {
        this.listaDeMateriales = new ArrayList<>();
    }

    public Biblioteca(ArrayList<E> listaDeMaterialesP) {
        this.listaDeMateriales = listaDeMaterialesP;

    }

    public ArrayList<E> getListaDeMateriales() {
        return listaDeMateriales;
    }

    public void setListaDeMateriales(ArrayList<E> listaDeMateriales) {
        this.listaDeMateriales = listaDeMateriales;
    }

    public void agregar(E material) {
        listaDeMateriales.add(material);

    }

    public boolean buscar(E material) throws MaterialNoEncontradoException {

        if (listaDeMateriales.contains(material)) {
            return true;
        } else {
            throw new MaterialNoEncontradoException("El material no se encuentra en la biblioteca");
        }
    }

    public boolean eliminar(E material) throws MaterialNoEncontradoException {
        boolean flag = false;
        if (buscar(material)) {
            listaDeMateriales.remove(material);
            flag = true;
        }
        return flag;

    }

    public String listarMateriales() {
        String lista= "";
        if (listaDeMateriales.isEmpty()) {
            System.out.println("La biblioteca está vacía.");
        } else {
            System.out.println("Materiales en la biblioteca:");
            for (E material : listaDeMateriales) {
                lista= lista+"\n"+material;
            }

        }
        return lista;
    }
}
