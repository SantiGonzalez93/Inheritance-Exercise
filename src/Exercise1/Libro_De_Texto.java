package Exercise1;




public  class  Libro_De_Texto extends Libro {

    private String facultadPubli;
    private String curso;
    public Libro_De_Texto(String titulo, String autor, double precio, String facultadPubli, String curso) {
        super(titulo, autor, precio);
        this.facultadPubli = facultadPubli;
        this.curso = curso;
    }


    @Override
    public void imprimir() {
        System.out.println(this.titulo +" "+this.autor);
        System.out.println(this.facultadPubli+" "+this.curso);
        System.out.println(this.precio);
    }

}
