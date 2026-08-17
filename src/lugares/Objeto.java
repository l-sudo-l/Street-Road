package lugares;

public class Objeto {
    private String nombre;
    private int precio;
    private int precioVenta;
    private int aumentoVelicidad;

    public Objeto(String nombre, int precio, int precioVenta, int aumentoVelicidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.precioVenta = precioVenta;
        this.aumentoVelicidad = aumentoVelicidad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public int getPrecioVenta() {
        return precioVenta;
    }

    public int getAumentoVelicidad() {
        return aumentoVelicidad;
    }
}
