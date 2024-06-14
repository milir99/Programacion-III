public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        ColaPrioridad<String> colaPrioridad = new ColaPrioridad<>();

        // Agregar elementos con diferentes prioridades
        colaPrioridad.agregar("Elemento1", 3);
        colaPrioridad.agregar("Elemento2", 1);
        colaPrioridad.agregar("Elemento3", 2);
        colaPrioridad.agregar("Elemento4", 2); // Elemento con la misma prioridad que "Elemento3"

        // Obtener y quitar elementos en orden de prioridad
        while (colaPrioridad.obtenerMayorPrioridad() != null) {
            System.out.println("Elemento de mayor prioridad: " + colaPrioridad.obtenerMayorPrioridad());
            colaPrioridad.quitar();
        }
    
        /*
// Prueba con enteros en orden ascendente
        ListaOrdenada<Integer> listaEnterosAsc = new ListaOrdenada<>(true);
        listaEnterosAsc.agregar(3);
        listaEnterosAsc.agregar(1);
        listaEnterosAsc.agregar(2);
        System.out.println("Lista de enteros en orden ascendente: " + listaEnterosAsc);
        System.out.println("Elemento en posición 1: " + listaEnterosAsc.obtener(1));
        listaEnterosAsc.eliminar(2);
        System.out.println("Lista de enteros después de eliminar 2: " + listaEnterosAsc);

        // Prueba con enteros en orden descendente
        ListaOrdenada<Integer> listaEnterosDesc = new ListaOrdenada<>(false);
        listaEnterosDesc.agregar(3);
        listaEnterosDesc.agregar(1);
        listaEnterosDesc.agregar(2);
        System.out.println("Lista de enteros en orden descendente: " + listaEnterosDesc);
        System.out.println("Elemento en posición 1: " + listaEnterosDesc.obtener(1));
        listaEnterosDesc.eliminar(2);
        System.out.println("Lista de enteros después de eliminar 2: " + listaEnterosDesc);

        // Prueba con cadenas en orden ascendente
        ListaOrdenada<String> listaCadenasAsc = new ListaOrdenada<>(true);
        listaCadenasAsc.agregar("Beta");
        listaCadenasAsc.agregar("Alpha");
        listaCadenasAsc.agregar("Gamma");
        System.out.println("Lista de cadenas en orden ascendente: " + listaCadenasAsc);
        System.out.println("Elemento en posición 1: " + listaCadenasAsc.obtener(1));
        listaCadenasAsc.eliminar("Alpha");
        System.out.println("Lista de cadenas después de eliminar 'Alpha': " + listaCadenasAsc);

        // Prueba con cadenas en orden descendente
        ListaOrdenada<String> listaCadenasDesc = new ListaOrdenada<>(false);
        listaCadenasDesc.agregar("Beta");
        listaCadenasDesc.agregar("Alpha");
        listaCadenasDesc.agregar("Gamma");
        System.out.println("Lista de cadenas en orden descendente: " + listaCadenasDesc);
        System.out.println("Elemento en posición 1: " + listaCadenasDesc.obtener(1));
        listaCadenasDesc.eliminar("Alpha");
        System.out.println("Lista de cadenas después de eliminar 'Alpha': " + listaCadenasDesc);

         Conjunto<Integer> conjuntoEnteros = new Conjunto<>();
        conjuntoEnteros.agregar(1);
        conjuntoEnteros.agregar(2);
        conjuntoEnteros.agregar(3);
        System.out.println("Conjunto de enteros: " + conjuntoEnteros);
        System.out.println("Contiene 2: " + conjuntoEnteros.contiene(2));
        conjuntoEnteros.eliminar(2);
        System.out.println("Conjunto de enteros después de eliminar 2: " + conjuntoEnteros);
        System.out.println("Contiene 2: " + conjuntoEnteros.contiene(2));

        // Prueba con cadenas
        Conjunto<String> conjuntoCadenas = new Conjunto<>();
        conjuntoCadenas.agregar("Hola");
        conjuntoCadenas.agregar("Mundo");
        conjuntoCadenas.agregar("Hola"); // Elemento duplicado
        System.out.println("Conjunto de cadenas: " + conjuntoCadenas);
        System.out.println("Contiene 'Mundo': " + conjuntoCadenas.contiene("Mundo"));
        conjuntoCadenas.eliminar("Mundo");
        System.out.println("Conjunto de cadenas después de eliminar 'Mundo': " + conjuntoCadenas);
        System.out.println("Contiene 'Mundo': " + conjuntoCadenas.contiene("Mundo"));

        // Prueba con números de punto flotante (Float)
        Conjunto<Float> conjuntoFloats = new Conjunto<>();
        conjuntoFloats.agregar(1.1f);
        conjuntoFloats.agregar(2.2f);
        conjuntoFloats.agregar(3.3f);
        System.out.println("Conjunto de floats: " + conjuntoFloats);
        System.out.println("Contiene 2.2: " + conjuntoFloats.contiene(2.2f));
        conjuntoFloats.eliminar(2.2f);
        System.out.println("Conjunto de floats después de eliminar 2.2: " + conjuntoFloats);
        System.out.println("Contiene 2.2: " + conjuntoFloats.contiene(2.2f));

        OperacionesMatematicas<Integer> operacionesEnteros = new OperacionesMatematicas<>();
        OperacionesMatematicas<Double> operacionesDobles = new OperacionesMatematicas<>();

        // Ejemplo con números enteros
        int entero1 = 10;
        int entero2 = 5;

        System.out.println("Suma de enteros: " + operacionesEnteros.suma(entero1, entero2));
        System.out.println("Resta de enteros: " + operacionesEnteros.resta(entero1, entero2));
        System.out.println("Multiplicación de enteros: " + operacionesEnteros.multiplicacion(entero1, entero2));
        System.out.println("División de enteros: " + operacionesEnteros.division(entero1, entero2));

        // Ejemplo con números de punto flotante
        double decimal1 = 7.5;
        double decimal2 = 2.5;

        System.out.println("Suma de decimales: " + operacionesDobles.suma(decimal1, decimal2));
        System.out.println("Resta de decimales: " + operacionesDobles.resta(decimal1, decimal2));
        System.out.println("Multiplicación de decimales: " + operacionesDobles.multiplicacion(decimal1, decimal2));
        System.out.println("División de decimales: " + operacionesDobles.division(decimal1, decimal2));
        OperacionesMatematicas<Float> operacionesFloat = new OperacionesMatematicas<>();

        // Ejemplo con números de punto flotante
        float float1 = 7.5f;
        float float2 = 2.5f;

        System.out.println("Suma de floats: " + operacionesFloat.suma(float1, float2));
        System.out.println("Resta de floats: " + operacionesFloat.resta(float1, float2));
        System.out.println("Multiplicación de floats: " + operacionesFloat.multiplicacion(float1, float2));
        System.out.println("División de floats: " + operacionesFloat.division(float1, float2));

         Pila<Integer> pilaInt= new Pila<Integer>();
        pilaInt.agregar(10);
        pilaInt.agregar(12);
        pilaInt.agregar(11);
        pilaInt.agregar(1);
        pilaInt.agregar(19);
        System.out.println(pilaInt.mostrar());
        System.out.println(pilaInt.tamanio());
        pilaInt.eliminar();
        System.out.println(pilaInt.tamanio());
        System.out.println(pilaInt.mostrar());



       Almacenamiento<Integer> almacenamientoInt = new Almacenamiento<>();
        almacenamientoInt.agregar(10);
        almacenamientoInt.agregar(20);
        almacenamientoInt.agregar(30);
        System.out.println("Almacenamiento de Integer:");
        almacenamientoInt.mostrarTodos();
        System.out.println("Buscar 20: " + almacenamientoInt.buscar(20));
        almacenamientoInt.eliminar(20);
        System.out.println("Almacenamiento después de eliminar 20:");
        almacenamientoInt.mostrarTodos();


        // Prueba con String
        Almacenamiento<String> almacenamientoString = new Almacenamiento<>();
        almacenamientoString.agregar("Hola");
        almacenamientoString.agregar("Mundo");
        almacenamientoString.agregar("Java");
        System.out.println("\nAlmacenamiento de String:");
        almacenamientoString.mostrarTodos();
        System.out.println("Buscar 'Mundo': " + almacenamientoString.buscar("Mundo"));
        almacenamientoString.eliminar("Mundo");
        System.out.println("Almacenamiento después de eliminar 'Mundo':");
        almacenamientoString.mostrarTodos();

        // Prueba con un objeto de una clase personalizada
        class Persona {
            String nombre;
            int edad;

            Persona(String nombre, int edad) {
                this.nombre = nombre;
                this.edad = edad;
            }

            @Override
            public String toString() {
                return nombre + " (" + edad + " años)";
            }
        }

        Almacenamiento<Persona> almacenamientoPersona = new Almacenamiento<>();
        almacenamientoPersona.agregar(new Persona("Juan", 25));
        almacenamientoPersona.agregar(new Persona("Ana", 30));
        almacenamientoPersona.agregar(new Persona("Luis", 35));
        System.out.println("\nAlmacenamiento de Persona:");
        almacenamientoPersona.mostrarTodos();
        System.out.println("Buscar 'Ana': " + almacenamientoPersona.buscar(new Persona("Ana", 30))); // Esto fallará debido a la comparación de objetos
        almacenamientoPersona.eliminar(new Persona("Ana", 30)); // Esto también fallará por la misma razón
        System.out.println("Almacenamiento después de intentar eliminar 'Ana':");
        almacenamientoPersona.mostrarTodos();*/




    }
}