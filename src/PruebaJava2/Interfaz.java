package PruebaJava2;

/**
 *
 * @author Vicente Solorza
 */
public interface Interfaz {
    
    double IVA = 0.19;
    double DESCUENTO_INFANTIL = 0.05;
    double DESCUENTO_DEPORTE = 0.10;
    
    int calcularPrecioConIva();
    int aplicarDescuento();

}
