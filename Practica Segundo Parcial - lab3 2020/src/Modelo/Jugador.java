package Modelo;
public class Jugador {
    private String _id;
    private String guid;
    private boolean isActive;
   private  String balance;
    private int age;
    private String eyeColor;
    private String nombre;
    private String apellido;
    private String email;
    private String phone;
    private String position;

    public Jugador(String _id, String guid, boolean isActive, String balance, int age, String eyeColor, String nombre, String apellido, String email, String phone, String position) {
        this._id = _id;
        this.guid = guid;
        this.isActive = isActive;
        this.balance = balance;
        this.age = age;
        this.eyeColor = eyeColor;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.phone = phone;
        this.position = position;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return"\n"+ "Jugador" + "\n" +
                "_id =" + _id + '\'' + "\n" +
                ", guid='" + guid + '\'' + "\n" +
                ", isActive=" + isActive + "\n" +
                ", balance=" + balance + "\n" +
                ", age=" + age + "\n" +
                ", eyeColor='" + eyeColor + '\'' + "\n" +
                ", nombre='" + nombre + '\'' + "\n" +
                ", apellido='" + apellido + '\'' + "\n" +
                ", email='" + email + '\'' + "\n" +
                ", phone='" + phone + '\'' + "\n" +
                ", position='" + position + '\'' + "\n" +
                '}';
    }
}
