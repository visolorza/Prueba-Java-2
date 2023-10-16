package PruebaJava2;

/**
 *
 * @author Vicente Solorza
 */
public class Infantil extends Libro implements Interfaz {
    
    private int edadMinima, edadMaxima;

    public Infantil() {
        super();
    }

    public Infantil(int edadMinima, int edadMaxima, String titulo, String autor, int precioSinIva, int stock) {
        super(titulo, autor, precioSinIva, stock);
        this.edadMinima = edadMinima;
        this.edadMaxima = edadMaxima;
    }

    public int getEdadMinima() {
        return edadMinima;
    }

    public void setEdadMinima(int edadMinima) {
        this.edadMinima = edadMinima;
    }

    public int getEdadMaxima() {
        return edadMaxima;
    }

    public void setEdadMaxima(int edadMaxima) {
        this.edadMaxima = edadMaxima;
    }

    @Override
    public String toString() {
        return "Infantil{" + "edadMinima=" + edadMinima + ", edadMaxima=" + edadMaxima + '}';
    }

    @Override
    public int calcularPrecioConIva() {
        return (int) ((this.getPrecioSinIva() * IVA) + this.getPrecioSinIva());
    }

    @Override
    public int aplicarDescuento() {
        return (int) (this.getPrecioSinIva() - (this.getPrecioSinIva() * DESCUENTO_INFANTIL));
    }

    @Override
    public int obtenerTotalCompra() {
        return aplicarDescuento();
    }
    
}
