package PruebaJava2;

/**
 *
 * @author Vicente Solorza
 */
abstract public class Libro {
    
    protected String titulo, autor;
    protected int precioSinIva, stock;

    public Libro() {
    }

    public Libro(String titulo, String autor, int precioSinIva, int stock) {
        this.titulo = titulo;
        this.autor = autor;
        this.precioSinIva = precioSinIva;
        this.stock = stock;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPrecioSinIva() {
        return precioSinIva;
    }

    public void setPrecioSinIva(int precioSinIva) {
        this.precioSinIva = precioSinIva;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", autor=" + autor + ", precioSinIva=" + precioSinIva + ", stock=" + stock + '}';
    }
 
    abstract public int obtenerTotalCompra();    

}
