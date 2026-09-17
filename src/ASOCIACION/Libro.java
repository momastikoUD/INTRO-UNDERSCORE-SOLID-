package ASOCIACION;

public class Libro {
    private String titulo;
    private String autor;
    private boolean disponible;

    Libro() {
        this.disponible = true;
    }

    Libro(String tit, String aut) {
        this.titulo = tit;
        this.autor = aut;
        this.disponible = true;
    }

    Libro(String tit, String aut, boolean disp) {
        this.titulo = tit;
        this.autor = aut;
        this.disponible = disp;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public boolean isDisponible() {
        return this.disponible;
    }

    public void setTitulo(String tit) {
        if (tit != null && !tit.isEmpty()) {
            this.titulo = tit;
        } else {
            System.out.println(" unu ¡ la string es invalida !");
        }
    }

    public void setAutor(String aut) {
        this.autor = aut;
    }

    public void setDisponible(boolean disp) {
        this.disponible = disp;
    }

    public void mostrarInfo() {
        System.out.println("-----libro-----");
        System.out.println("titulo: " + this.titulo);
        System.out.println("autor: " + this.autor);
        System.out.println("disponible: " + (this.disponible ? "si" : "no"));
    }

    public boolean prestar() {
        if (this.disponible) {
            this.disponible = false;
            System.out.println("El libro \"" + this.titulo + "\" ha sido prestado.");
            return true;
        } else {
            System.out.println("El libro \"" + this.titulo + "\" no está disponible para préstamo.");
            return false;
        }
    }

    public void devolver() {
        this.disponible = true;
        System.out.println("El libro \"" + this.titulo + "\" ha sido devuelto.");
    }
}
