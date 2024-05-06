
import modelo.EnvioPorAire;
import modelo.EnvioPorTierra;
import modelo.GestionDeEnvios;

public class Main {
    public static void main(String[] args) {
        GestionDeEnvios gestion = new GestionDeEnvios();

        EnvioPorAire paquete1 = new EnvioPorAire("1", 3, "Buenos Aires", false, false, "AA", "NORMAL");
        gestion.agregarEnvio(paquete1);
        EnvioPorTierra paquete2 = new EnvioPorTierra("2", 10, "Buenos Aires", true, true, 105, "CAMION");
        gestion.agregarEnvio(paquete2);
        EnvioPorAire paquete3 = new EnvioPorAire("3", 20, "Buenos Aires", false, false, "BB", "NORMAL");
        gestion.agregarEnvio(paquete3);
        EnvioPorTierra paquete4 = new EnvioPorTierra("4", 5, "Buenos Aires", false, false, 100, "AUTO");
        gestion.agregarEnvio(paquete4);
        EnvioPorAire paquete5 = new EnvioPorAire("5", 9, "Buenos Aires", false, false, "AA", "NORMAL");
        gestion.agregarEnvio(paquete5);

        System.out.println("");
        gestion.agregarEnvio();
        System.out.println("");
        gestion.listado();
        System.out.println("");
        gestion.mostraEstado();
        System.out.println("");
        gestion.cambiarEstadoDeEnvio("1");
        System.out.println("");
        gestion.mostraEstado();
        System.out.println("");
        System.out.println("La cantidad de paquetes es de : "+ gestion.cantidadDePaquetes());




    }
}