package PruebaJava2;

import java.util.ArrayList;

/**
 *
 * @author Vicente Solorza
 */
public class ColeccionLibro {
    
    ArrayList<Libro> listaLibros;

    public ColeccionLibro() {
        listaLibros = new ArrayList<>();
    }
    
    public void añadirLibro(Libro libroAñadido) {
        
        boolean flag = true;
        
        for (Libro libro : listaLibros) {
            
            if (libro.getAutor().equalsIgnoreCase(libroAñadido.getAutor()) && libro.getTitulo().equalsIgnoreCase(libroAñadido.getTitulo())) {
                flag = false;
                System.out.println("El libro que intenta ingresar ya existe.");
            }
            
        }
        
        if (flag = true) {
            listaLibros.add(libroAñadido);
        }
        
    }
    
    public void mostrarLibros() {
        
        int total = 0;
        
        System.out.println("-----------------------------------------");
        
        for (Libro libroMostrado : listaLibros) {
            
            System.out.println("Titulo: " + libroMostrado.getTitulo());
            System.out.println("Autor: " + libroMostrado.getAutor());
            System.out.println("Categoria: " +  libroMostrado.getClass().getName());
            System.out.println("Precio (IVA y descuento aplicado): $" + libroMostrado.obtenerTotalCompra());
                        
            System.out.println("-----------------------------------------");
            
            total += libroMostrado.obtenerTotalCompra();
            
        }
        
        System.out.println("Total a pagar: $" +  total);
        System.out.println("-----------------------------------------");
        
    }
   
}
