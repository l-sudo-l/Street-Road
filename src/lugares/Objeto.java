package lugares;

public class Objeto {
    private String nombre;
    private int precioCompra;
    private int precioVenta;
    private int aumentoVelicidad;

    public Objeto(String nombre, int precioCompra, int precioVenta, int aumentoVelicidad) {
        this.nombre = nombre;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
        this.aumentoVelicidad = aumentoVelicidad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPrecioCompra() {
        return precioCompra;
    }

    public int getPrecioVenta() {
        return precioVenta;
    }

    public int getAumentoVelicidad() {
        return aumentoVelicidad;
    }
}
