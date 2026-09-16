package ASOCIACION;

public class Lector {

    private String nombre;
    private String cedula;
    private Libro libroActual;  // referencia a un objeto Libro — puede ser null


    // --- CONSTRUCTORES ---

    public Lector() {
    }

    public Lector(String nombre, String cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
    }


    // --- GETTERS ---

    public String getNombre() {
        return nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public Libro getLibroActual() {
        return libroActual;
    }


    // --- SETTERS ---

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }


    // --- MÉTODOS ---

    // Toma un libro prestado — llama al método prestar() del libro
    public void tomarPrestado(Libro libro) {
        if (libroActual != null) {
            System.out.println(nombre + " ya tiene el libro \"" + libroActual.getTitulo() + "\". Debe devolverlo primero.");
        } else {
            libroActual = libro;
            libro.prestar();
        }
    }

    // Devuelve el libro actual — llama al método devolver() del libro
    public void regresarLibro() {
        if (libroActual == null) {
            System.out.println(nombre + " no tiene ningún libro.");
        } else {
            libroActual.devolver();
            libroActual = null;
        }
    }

    // Muestra el estado del lector
    public void mostrarEstado() {
        String estado = (libroActual != null) ? libroActual.getTitulo() : "sin libro";
        System.out.println("Lector: " + nombre + " | Libro: " + estado);
    }

}
