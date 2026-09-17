package ASOCIACION;

public class App {
    public static void main(String[] args) throws Exception {
        Libro libro1 = new Libro("El Quijote", "Miguel de Cervantes");
        Libro libro2 = new Libro("Cien Años de Soledad", "Gabriel García Márquez");

        Lector lector1 = new Lector("123456789", "Juan Pérez");
        Lector lector2 = new Lector("987654321", "María Gómez");

        lector1.mostrarEstado();
        lector1.tomarPrestado(libro1);
        lector1.mostrarEstado();

        lector2.tomarPrestado(libro1);
        lector1.regresarLibro();
        lector2.tomarPrestado(libro1);
        lector2.mostrarEstado();
    }
}
