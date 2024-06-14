public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        OperacionesMatematicas<Number> operaciones = new OperacionesMatematicas<>();

        try {
            System.out.println(operaciones.division(10, 2));
            System.out.println(operaciones.division(10.0, 2.0));
            System.out.println(operaciones.division(10.0f, 2.0f));
            System.out.println(operaciones.division(10, 2.5));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }

c
}
