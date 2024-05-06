package Eventos;

import Entradas.Entrada;
import Entradas.EntradaGeneral;
import Entradas.EntradaVip;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;


public class Recital implements GestionEntradas {
    private String nombre;
    private String fecha;
    private String lugar;
    private HashMap<String, HashSet<Entrada>> stockDeEntradas;


    public Recital() {
        this.nombre = "";
        this.fecha = "";
        this.lugar = "";
        this.stockDeEntradas = new HashMap<>();
    }

    public Recital(String nombreP, String fechaP, String lugarP) {
        this.nombre = nombreP;
        this.fecha = fechaP;
        this.lugar = lugarP;
        this.stockDeEntradas = new HashMap<>();

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombreP) {
        this.nombre = nombreP;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fechaP) {
        this.fecha = fechaP;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugarP) {
        this.lugar = lugarP;
    }


    @Override
    public String toString() {
        return "Recital{" +
                "nombre='" + nombre + '\'' +
                ", fecha='" + fecha + '\'' +
                ", lugar='" + lugar + '\'' +
                ", entradasVip=" + stockDeEntradas
                + '}';
    }

    public String cargarEntrada(Entrada nueva) {
        String mensaje = "Entrada cargada Exitosamente";
        if (nueva instanceof EntradaVip) {

            if (!stockDeEntradas.containsKey("VIP")) {
                HashSet<Entrada> stockEntradasVip = new HashSet<>();
                stockDeEntradas.put("VIP", stockEntradasVip);
            }
            HashSet<Entrada> aux = stockDeEntradas.get("VIP");

            if (!stockDeEntradas.get("VIP").contains(nueva)) {
                aux.add(nueva);
                stockDeEntradas.replace("VIP",aux);
            } else {
                mensaje = "Error en la carga, ya existe una entrada con ese id";
            }

        }
        if (nueva instanceof EntradaGeneral) {

            if (!stockDeEntradas.containsKey("GENERAL")) {
                HashSet<Entrada> stockEntradasVip = new HashSet<>();
                stockDeEntradas.put("GENERAL", stockEntradasVip);
            }
            HashSet<Entrada> aux = stockDeEntradas.get("GENERAL");

            if (!stockDeEntradas.get("GENERAL").contains(nueva)) {
                aux.add(nueva);
                stockDeEntradas.replace("GENERAL",aux);
            } else {
                mensaje = "Error en la carga, ya existe una entrada con ese id";
            }

        }
        return mensaje;
    }


    public int EntradasPorTipoVendidas(String tipo) {
        int contador = 0;
        tipo = tipo.toUpperCase();
        if(stockDeEntradas.containsKey(tipo))
        {
            HashSet<Entrada> aux = stockDeEntradas.get(tipo);
            Iterator<Entrada> auxiliar = aux.iterator();
            while (auxiliar.hasNext())
            {
                if (auxiliar.next().isEstado())
                {
                    contador++;
                }

            }
        }

        return contador;
    }

    @Override
    public String venderEntrada(String tipo) {
        String vendida = "";
        boolean flag = false;
        if (stockDeEntradas.containsKey(tipo)) {
            HashSet<Entrada> aux = stockDeEntradas.get(tipo);
            Iterator<Entrada> auxiliar = aux.iterator();
            while ((auxiliar.hasNext()) && (flag = false)) {
                if (auxiliar.next().isEstado()) {
                    auxiliar.next().setEstado(true);
                    vendida += auxiliar.next().toString();
                }


            }
            if (flag= false){
                vendida="No quedan mas entradas para vender de ese tipo";
            }
            stockDeEntradas.replace(tipo,aux);
        }

      return vendida;

    }

    @Override
    public String entradasDisponibles() {
        String entradas = "";
        Iterator<Entrada> stock = stockDeEntradas.iterator();
        while (stock.hasNext())
        {
            HashSet<Entrada> aux = stockDeEntradas.get(stockDeEntradas.keySet());
            Iterator<Entrada> auxiliar = aux.iterator();
            while (auxiliar.hasNext())
            {
                if (auxiliar.next().isEstado())
                {
                    entradas+= auxiliar.next().toString();
                }

            }
        }
        return entradas;
    }

    @Override
    public double totalRecaudado() {
        int contador = 0;
        Iterator<Entrada> stock = stockDeEntradas.iterator();
        while (stock.hasNext())
        {
            HashSet<Entrada> aux = stockDeEntradas.get(stockDeEntradas.keySet());
            Iterator<Entrada> auxiliar = aux.iterator();
            while (auxiliar.hasNext())
            {
                if (!auxiliar.next().isEstado())
                {
                    contador+= auxiliar.next().getPrecio();
                }

            }
        }
        return contador;

    }

}




