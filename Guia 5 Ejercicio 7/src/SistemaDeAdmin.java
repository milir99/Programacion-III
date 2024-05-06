import java.util.ArrayList;
import java.util.Scanner;

public class SistemaDeAdmin {
    private ArrayList<Socios> listado;
    private Scanner scan;

    public SistemaDeAdmin() {
        listado = new ArrayList<>();
        scan = new Scanner(System.in);
    }

    public void ejecutar() {
        int opcion;
        do {
            System.out.println("BIENVENIDO\nIngrese una opción:");
            System.out.println("1. Agregar Socio.");
            System.out.println("2. Pago de cuota.");
            System.out.println("3. Listado de Información.");
            System.out.println("0. Salir.");
            opcion = scan.nextInt();
            scan.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    agregarSocio();
                    break;
                case 2:
                    pagarCuota();
                    break;
                case 3:
                    listarInformacion();
                    break;
                case 0:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 0);

    }

    private void agregarSocio() {
        System.out.println("Ingrese el nombre del socio:");
        String nombre = scan.nextLine();
        System.out.println("Ingrese el ID del socio:");
        String id = scan.nextLine();
        System.out.println("Ingrese el teléfono del socio:");
        String telefono = scan.nextLine();
        System.out.println("Seleccione el tipo de socio:");
        System.out.println("1. Normal");
        System.out.println("2. Vitalicio");
        System.out.println("3. Ausente");
        int tipo = scan.nextInt();
        scan.nextLine(); // Limpiar el buffer

        switch (tipo) {
            case 1:
                System.out.println("Ingrese la cuota mensual:");
                float cuotaMensual = scan.nextFloat();
                listado.add(new Normal(cuotaMensual, nombre, id, telefono, false));
                break;
            case 2:
                listado.add(new Vitalicio(nombre, id, telefono, false));
                break;
            case 3:
                System.out.println("Ingrese la cuota de mantenimiento:");
                float cuotaMantenimiento = scan.nextFloat();
                System.out.println("Ingrese el valor reducido de acceso:");
                float valorReducido = scan.nextFloat();
                listado.add(new Ausente(cuotaMantenimiento, valorReducido, nombre, id, telefono, false));
                break;
            default:
                System.out.println("Tipo de socio inválido.");
        }
    }

    private void pagarCuota() {
        System.out.println("Ingrese el ID del socio:");
        String id = scan.nextLine();
        boolean encontrado = false;
        for (Socios socio : listado) {
            if (socio.getId().equals(id)) {
                socio.setEstadoCuota(true);
                System.out.println("Cuota pagada exitosamente.");
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontró ningún socio con ese ID.");
        }
    }

    private void listarInformacion() {
        System.out.println("Listado de Información de Socios:");
        for (Socios socio : listado) {
            System.out.println(socio);

            if (socio.isEstadoCuota() || socio instanceof Vitalicio) {

                System.out.println("Estado de cuota: Pagada.");
            } else {
                System.out.println("Estado de cuota: Pendiente.");
            }
            System.out.println("--------------------");
        }
    }


}