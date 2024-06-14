package Modelo;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class jsonAJava {
    public static  void pasarDatosALista (ArrayList<Jugador>listaJugadores){
        try{
            JSONArray jsonArray= new JSONArray(json.JsonUtiles.leer("jugadores"));
            for(int i=0 ; i< jsonArray.length();i++)
            {

                JSONObject jsonObject1 = jsonArray.getJSONObject(i);

                String _id = jsonObject1.getString("_id");
                String guid=jsonObject1.getString("guid") ;
                boolean isActive=jsonObject1.getBoolean("isActive");
                String balance=jsonObject1.getString("balance");
                int age= jsonObject1.getInt("age");
                String eyeColor=jsonObject1.getString("eyeColor");

                JSONObject jsonObject2 = jsonObject1.getJSONObject("name");
                String nombre=jsonObject2.getString("first");
                String apellido=jsonObject2.getString("last");
                String email=jsonObject1.getString("email");
                String phone=jsonObject1.getString("phone");
                String position=jsonObject1.getString("position");
                Jugador jugador = new Jugador(_id,guid,isActive,balance,age,eyeColor,nombre,apellido,email,phone,position);
                listaJugadores.add(jugador);

            }
        }
        catch(JSONException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
