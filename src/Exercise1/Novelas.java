package Exercise1;

public class Novelas extends Libro {

    private String tipo;
    public Novelas(String titulo, String autor, double precio, String tipo) {
        super(titulo, autor, precio);
        this.tipo = tipo;
    }

    @Override
    public void imprimir() {
        System.out.println(this.titulo +" "+this.autor);
        System.out.println(this.tipo);
        System.out.println(this.precio);
    }
}
