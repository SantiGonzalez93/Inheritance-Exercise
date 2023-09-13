package TiendaMascotas;

public class Gato extends Gatos{

    public Gato(String tipoDeAnimal) {
        super(tipoDeAnimal);
    }

    public Gato(String tipoDeAnimal, String tipo, String nombre, int edad, String color) {
        super(tipoDeAnimal, tipo, nombre, edad, color);
    }

    @Override
    public void sonido() {
        super.sonido();
    }
}
