package TiendaMascotas;

public class Gato extends Gatos{

    public Gato(String tipoDeAnimal) {
        super(tipoDeAnimal);
    }

    public Gato(String tipoDeAnimal, String tipo, String raza, String nombre, int edad, String color) {
        super(tipoDeAnimal, tipo, raza, nombre, edad, color);
    }

    @Override
    public void sonido() {
        super.sonido();
    }
}
