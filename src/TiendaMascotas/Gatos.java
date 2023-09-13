package TiendaMascotas;

public abstract class Gatos extends Mascotas {

    protected String tipo;
    protected String nombre;
    protected int edad;
    protected String color;

    public Gatos(String tipoDeAnimal) {
        super(tipoDeAnimal);
    }

    public Gatos(String tipoDeAnimal, String tipo, String nombre, int edad, String color) {
        super(tipoDeAnimal);
        this.tipo = tipo;
        this.nombre = nombre;
        this.edad = edad;
        this.color = color;
    }

    @Override
    public void sonido() {
        System.out.println("Los gatos maullan y ronronean");
    }
}
