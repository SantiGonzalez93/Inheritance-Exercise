import Exercise1.Libro_De_Texto;
import Exercise1.Novelas;
import TiendaMascotas.Perro;

public class Main {
    public static void main(String[] args) {

        // para instanciar un libro de texto String titulo, String autor, double precio, String facultadPubli,
        // String curso

        Libro_De_Texto papers = new Libro_De_Texto("Las nuevas IAs", "Pepito Honguito", 0.25, "IMB", "Programacion");

        papers.imprimir();

        // para instanciar una novela String titulo, String autor, double precio, String tipo

        Novelas elantris = new Novelas("Elantris", "Brandon Sanderson", 55, "Fantasía");

        elantris.imprimir();

        // Exercise number 2
        //String tipoDeAnimal, String tamaño, String raza, String nombre, int edad, String color, boolean muerde

        Perro wolf = new Perro("Perro", "Grande", 56, "Obejero Belga", "Wolf", 13, "Negro", false);
        System.out.println(wolf.getTipoDeAnimal());
        System.out.println(wolf.getTamaño());
        System.out.println(wolf.getPeso());
        System.out.println(wolf.getColor());
        System.out.println(wolf.getRaza());
        System.out.println(wolf.getNombre());
        System.out.println(wolf.getEdad());

        wolf.sonido();


    }
}