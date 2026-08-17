package personaje;

import utiles.Utiles;

public class Personaje {
    private String nombre;
    private int dinero;

    public Personaje(String nombre, int dinero) {
        this.nombre = nombre;
        this.dinero = dinero;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDinero() {
        return dinero;
    }

    private Garage garage = new Garage();

    public Garage getGarage() {
        return garage;
    }
    public void descontarDinero(int monto){
        dinero -= monto;
    }
}
