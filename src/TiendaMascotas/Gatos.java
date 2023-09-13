package TiendaMascotas;

public abstract class Gatos extends Mascotas {

    protected String tipo;
    protected String raza;
    protected String nombre;
    protected int edad;
    protected String color;

    public Gatos(String tipoDeAnimal) {
        super(tipoDeAnimal);
    }

    public Gatos(String tipoDeAnimal, String tipo, String raza, String nombre, int edad, String color) {
        super(tipoDeAnimal);
        this.tipo = tipo;
        this.raza = raza;
        this.nombre = nombre;
        this.edad = edad;
        this.color = color;
    }

    public String getRaza() {
        return raza;
    }

    public String getTipo() {
        return tipo;
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

    @Override
    public void sonido() {
        System.out.println("Los gatos maullan y ronronean");
    }
}
