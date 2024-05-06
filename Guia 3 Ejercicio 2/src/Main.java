//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        float deposito= 1;
        float extraer =2000;


        Cliente clienteuno = new Cliente("25","Pablo Rod", 'm');
        System.out.println(clienteuno.imprimirCliente());
        Cuenta cuenta1 = new Cuenta("23",10000,clienteuno,'Y');
        System.out.println(cuenta1.imprimirCuenta() + "\n");
        for (int i=0;i<10;i++)
        {

            cuenta1.depositar(deposito);
            System.out.println(cuenta1.imprimirCuenta() + "\n");
            System.out.println(cuenta1.Extraccion(extraer));
            System.out.println(cuenta1.imprimirCuenta() + "\n");
            System.out.println(extraer);
        }




    }
}