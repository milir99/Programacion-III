import java.security.SecureRandom;
public class Password {
    private int longitud;
    private String contrasenia;
    private static final String caracteresPermitidos = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";


    public Password(int longitud, String contraseniaP) {
        this.longitud = 8;
        this.contrasenia = contraseniaP;
    }
    public Password(int longitudP) {
        this.longitud = longitudP;
        this.contrasenia = generarPassword();
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitudP) {
        this.longitud = longitudP;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contraseniaP) {
        this.contrasenia = contraseniaP;
    }
    public boolean esFuerte()
    {
        int mayusculas = 0;
        int minusculas = 0;
        int numeros = 0;

        // Iterar sobre cada carácter en la contraseña
        for (int i = 0; i < contrasenia.length(); i++) {
            char caracter = contrasenia.charAt(i);
            if (Character.isUpperCase(caracter)) {
                mayusculas++;
            } else if (Character.isLowerCase(caracter)) {
                minusculas++;
            } else if (Character.isDigit(caracter)) {
                numeros++;
            }
        }
        // Devolver true si se cumplen todas las condiciones
        return mayusculas > 2 && minusculas > 1 && numeros > 5;
    }
    private String generarPassword()
    {

        SecureRandom random = new SecureRandom();
        StringBuilder password = new StringBuilder();
        for (int i = 0; i < longitud ; i++) {
            int index = random.nextInt(caracteresPermitidos.length());
            password.append(caracteresPermitidos.charAt(index));
        }
        System.out.println(password.toString());
        return password.toString();

    }


}
