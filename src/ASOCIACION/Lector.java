package ASOCIACION;

public class Lector {
    private String cedula;
    private String nombre;
    private Libro libroActual;

    Lector(String ced, String nom) {
        this.cedula = ced;
        this.nombre = nom;
    }

    public String getCedula() {
        return this.cedula;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setCedula(String ced) {
        this.cedula = ced;
    }

    public void setNombre(String nom) {
        this.nombre = nom;
    }

    public void tomarPrestado(Libro libro) {
        if (this.libroActual != null) {
            System.out.println(this.nombre + " ya tiene el libro \"" + this.libroActual.getTitulo()
                    + "\".Debe devolverlo primero.");
        } else {
            if (libro.prestar()) {
                this.libroActual = libro;
            }
        }
    }

    public void regresarLibro() {
        if (this.libroActual == null) {
            System.out.println(this.nombre + "no tiene libro sapo despeguela");

        } else {
            this.libroActual.devolver();
            this.libroActual = null;
        }
    }

    public void mostrarEstado() {
        String estado = (this.libroActual == null) ? "no tiene ningun libro" : this.libroActual.getTitulo();
        System.out.println(" lector " + this.nombre + " | libro: " + estado);
    }
}