import Entradas.Entrada;
import Entradas.EntradaGeneral;
import Entradas.EntradaVip;
import Eventos.Recital;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Recital recital1 = new Recital("El recital más Gonzalo que el mismo Gonzalo","7/5/2024","Santiago del Estero");
        int preciobase=2000;
        //Cargar Entradas
        EntradaGeneral entrada1 = new EntradaGeneral("1",preciobase,false,"platea");
        recital1.cargarEntrada(entrada1);
        EntradaGeneral entrada2 = new EntradaGeneral("2",preciobase,false,"platea");
        recital1.cargarEntrada(entrada2);
        EntradaGeneral entrada3 = new EntradaGeneral("3",preciobase,false,"platea");
        recital1.cargarEntrada(entrada3);
        EntradaGeneral entrada4 = new EntradaGeneral("4",preciobase,false,"platea");
        recital1.cargarEntrada(entrada4);
        EntradaGeneral entrada5 = new EntradaGeneral("5",preciobase,false,"platea");
        recital1.cargarEntrada(entrada5);
        EntradaVip entrada6 = new EntradaVip("6",preciobase,false,"VIP");
        recital1.cargarEntrada(entrada6);
        EntradaVip entrada7 = new EntradaVip("7",preciobase,false,"VIP");
        recital1.cargarEntrada(entrada7);

        EntradaVip entrada8 = new EntradaVip("8",preciobase,false,"VIP");
        recital1.cargarEntrada(entrada8);

        EntradaVip entrada9 = new EntradaVip("9",preciobase,false,"VIP");
        recital1.cargarEntrada(entrada9);

        //VENTA DE ENTRADAS
        recital1.venderEntrada("VIP");
        recital1.venderEntrada("GENERAL");

        //Entradas dsiponibles
        System.out.println("Las entradas disponibles son "+recital1.entradasDisponibles());
        //Total recaudado,
        System.out.println("El total recaudado del recital es de: "+ recital1.totalRecaudado());
        // Entradas vendidas por tipo
        System.out.println("se vendieron"+recital1.EntradasPorTipoVendidas("VIP")+"entradas VIP");
        System.out.println("se vendieron"+recital1.EntradasPorTipoVendidas("GENERAL")+"entradas GENERAL");







    }
}