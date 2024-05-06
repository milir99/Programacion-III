package modelo;

import javax.swing.*;

abstract public class Servicios {
    private String id;
    private float peso;
    private String destino;

    private boolean seguro;
    private boolean entregaDia;
    private String estado;


    public Servicios(String idP, float pesoP, String destinoP, boolean seguroP, boolean entregaDiaP) {
        this.id = idP;
        this.peso = pesoP;
        this.destino = destinoP;
        this.seguro = seguroP;
        this.entregaDia = entregaDiaP;
        this.estado = "NO ENVIADO ";
    }

    public Servicios() {
        this.id = "";
        this.peso = 0;
        this.destino = "";
        this.seguro = false;
        this.entregaDia = false;
        this.estado = "NO ENVIADO";
    }

    public String getId() {
        return id;
    }

    public void setId(String idP) {
        this.id = idP;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float pesoP) {
        this.peso = pesoP;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destinoP) {
        this.destino = destinoP;
    }

    public boolean isSeguro() {
        return seguro;
    }

    public void setSeguro(boolean seguroP) {
        this.seguro = seguroP;
    }

    public boolean isEntregaDia() {
        return entregaDia;
    }

    public void setEntregaDia(boolean entregaDiaP) {
        this.entregaDia = entregaDiaP;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estadoP) {
        this.estado = estadoP;
    }

    @Override
    public String toString() {
        return "PAQUETE: \n" + " \n ID: " + id +
                "\nPeso: " + peso +
                "\nDestino: " + destino +
                "\nTiene seguro? " + seguro +
                "\nSe entrega en el dia? " + entregaDia +
                "\nSe envio ?" + estado;
    }

    abstract public float calcularTarifaEnvio();

    abstract public float CalcularTotalPaquete();

    abstract public float calcularCostoAdicional();

