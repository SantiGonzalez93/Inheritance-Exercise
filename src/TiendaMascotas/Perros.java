package TiendaMascotas;

public abstract class Perros extends Mascotas {

    protected String tamaño;
    protected double peso;
    protected String raza;
    protected String nombre;
    protected int edad;
    protected String color;
    protected boolean muerde;


    public Perros(String tipoDeAnimal) {
        super(tipoDeAnimal);
    }

    public Perros(String tipoDeAnimal, String tamaño, double peso, String raza, String nombre, int edad, String color, boolean muerde) {
        super(tipoDeAnimal);
        this.tamaño = tamaño;
        this.peso = peso;
        this.raza = raza;
        this.nombre = nombre;
        this.edad = edad;
        this.color = color;
        this.muerde = muerde;
    }

    public double getPeso() {
        return peso;
    }

    public String getTamaño() {
        return tamaño;
    }

    public String getRaza() {
        return raza;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getColor() {
        return color;
    }

    public boolean isMuerde() {
        return muerde;
    }

    @Override
    public void sonido() {
        System.out.println("Los perros ladran");
    }
}
