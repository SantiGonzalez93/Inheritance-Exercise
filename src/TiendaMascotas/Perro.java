package TiendaMascotas;

public class Perro extends Perros{
    public Perro(String tipoDeAnimal) {
        super(tipoDeAnimal);
    }

    public Perro(String tipoDeAnimal, String tamaño, double peso, String raza, String nombre, int edad, String color, boolean muerde) {
        super(tipoDeAnimal, tamaño, peso, raza, nombre, edad, color, muerde);
    }

    @Override
    public void sonido() {
        super.sonido();
    }
}
