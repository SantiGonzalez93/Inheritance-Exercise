package TiendaMascotas;

public abstract class Mascotas {
    protected String tipoDeAnimal;


    public Mascotas(String tipoDeAnimal) {
        this.tipoDeAnimal = tipoDeAnimal;
    }
    public abstract void sonido();
}
