public class Libro {
    String titulo;
    String autor;
    int paginas;

    public Libro() {
        this.titulo = "Desconocido";
        this.autor = "Desconocido";
        this.paginas = 0;

    }
    //Esto es un constructor con parametros
    public Libro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    public void imprimirInformacion() {
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Paginas: " + this.paginas);
    }
}
