package PruebaJava2;

/**
 *
 * @author Vicente Solorza
 */
public class Principal {
    public static void main(String[] args) {
        
        Deporte deporte = new Deporte("Natacion", "El arte de nadar", "Armando Casas", 10000, 2);
        Infantil infantil = new Infantil(7, 12, "Coraline", "Neil Gaiman", 12000, 3);
        
        ColeccionLibro listaLibros = new ColeccionLibro();
        
        listaLibros.añadirLibro(infantil);
        listaLibros.añadirLibro(deporte);
        
        listaLibros.mostrarLibros();
        
    }
}
