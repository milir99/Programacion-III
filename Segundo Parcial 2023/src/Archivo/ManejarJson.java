package Archivo;

import Biblioteca.Articulo;
import Biblioteca.Libro;
import Biblioteca.Material;
import Biblioteca.Revista;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class ManejarJson {
    public void javaAJson(String nombre, ArrayList<Material> listado) {
        try {
            JSONArray jsonArray = new JSONArray();
            for (Material material : listado) {
                JSONObject jsonObject = new JSONObject();
                jsonObject.put("titulo", material.getTitulo());
                jsonObject.put("autor", material.getAutor());
                jsonObject.put("anio", material.getAnio());
                jsonObject.put("cantEjemplares", material.getCantEjemplares());
                jsonObject.put("disponible", material.isDisponible());
                switch (material) {
                    case Libro libro -> jsonObject.put("numeroPaginas", libro.getNumeroPaginas());
                    case Articulo articulo -> jsonObject.put("resumen", articulo.getResumen());
                    case Revista revista -> {
                        jsonObject.put("numeroEdicion", revista.getNumeroEdicion());
                        jsonObject.put("suscripcion", revista.isSuscripcion());
                    }
                    default -> {
                    }
                }
                jsonArray.put(jsonObject);

            }
            JsonUtiles.grabar(jsonArray, nombre);


        } catch (JSONException e) {
            System.out.println(e.getMessage());
        }


    }

    public void jsonAJava(String nombre, ArrayList<Material> listado) {

        try {
            JSONArray jsonArray = new JSONArray(JsonUtiles.leer(nombre));
            JSONObject jsonObject = new JSONObject();

            for (int i = 0; i < jsonArray.length(); i++) {
                jsonObject = jsonArray.getJSONObject(i);
               String titulo= jsonObject.getString("titulo");
                String autor= jsonObject.getString("autor");
                 int anio= jsonObject.getInt("anio");
                 int cantEjemplares= jsonObject.getInt("cantEjemplares");
                 boolean disponible = jsonObject.getBoolean("disponible");
                 if(jsonObject.has("numeroPaginas"))
                 {
                     int numeroPagians= jsonObject.getInt("numeroPaginas");
                     Libro libro = new Libro(titulo,autor,anio,cantEjemplares,disponible,numeroPagians);
                     listado.add(libro);

                 } else if (jsonObject.has("resumen")) {
                     String resumen = jsonObject.getString("resumen");
                     Articulo articulo = new Articulo(titulo,autor,anio,cantEjemplares,disponible,resumen);
                     listado.add(articulo);


                 }else if(jsonObject.has("suscripcion"))
                 {
                     int numeroEdicion= jsonObject.getInt("numeroEdicion");
                    boolean suscripcion = jsonObject.getBoolean("suscripcion");
                    Revista revista = new Revista(titulo,autor,anio,cantEjemplares,disponible,numeroEdicion,suscripcion);
                     listado.add(revista);

                 }
            }

        }
        catch (JSONException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
