package TiendaMascotas;

public abstract class Perros extends Mascotas {

    protected String tamaño;
    protected String raza;
    protected String nombre;
    protected int edad;
    protected String color;
    protected boolean muerde;


    public Perros(String tipoDeAnimal) {
        super(tipoDeAnimal);
    }

    public Perros(String tipoDeAnimal, String tamaño, String raza, String nombre, int edad, String color, boolean muerde) {
        super(tipoDeAnimal);
        this.tamaño = tamaño;
        this.raza = raza;
        this.nombre = nombre;
        this.edad = edad;
        this.color = color;
        this.muerde = muerde;
    }

    @Override
    public void sonido() {
        System.out.println("Los perros ladran");
    }
}
