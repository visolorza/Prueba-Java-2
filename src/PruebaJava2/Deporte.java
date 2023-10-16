package PruebaJava2;

/**
 *
 * @author Vicente Solorza
 */
public class Deporte extends Libro implements Interfaz {
    
    private String nombreDeporte;

    public Deporte() {
        super();
    }

    public Deporte(String nombreDeporte, String titulo, String autor, int precioSinIva, int stock) {
        super(titulo, autor, precioSinIva, stock);
        this.nombreDeporte = nombreDeporte;
    }

    public String getNombreDeporte() {
        return nombreDeporte;
    }

    public void setNombreDeporte(String nombreDeporte) {
        this.nombreDeporte = nombreDeporte;
    }

    @Override
    public String toString() {
        return "Deporte{" + "nombreDeporte=" + nombreDeporte + '}';
    }
    
    @Override
    public int calcularPrecioConIva() {
        return (int) ((this.getPrecioSinIva() * IVA) + this.getPrecioSinIva());
    }

    @Override
    public int aplicarDescuento() {
        return (int) (this.getPrecioSinIva() - (this.getPrecioSinIva() * DESCUENTO_DEPORTE));
    }

    @Override
    public int obtenerTotalCompra() {
        return aplicarDescuento();
    }

}
