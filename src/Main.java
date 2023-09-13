import Exercise1.Libro_De_Texto;
import Exercise1.Novelas;

public class Main {
    public static void main(String[] args) {

        // para instanciar un libro de texto String titulo, String autor, double precio, String facultadPubli,
        // String curso

        Libro_De_Texto papers = new Libro_De_Texto("Las nuevas IAs", "Pepito Honguito", 0.25, "IMB", "Programacion");

        papers.imprimir();

        // para instanciar una novela String titulo, String autor, double precio, String tipo

        Novelas elantris = new Novelas("Elantris", "Brandon Sanderson", 55, "Fantasía");

        elantris.imprimir();
    }
}