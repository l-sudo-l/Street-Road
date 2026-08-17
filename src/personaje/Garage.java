package personaje;

import lugares.Auto;
import lugares.Objeto;

import java.util.ArrayList;
import java.util.List;

public class Garage {
    private List<Auto> autos = new ArrayList<>();
    private List<Objeto> partes = new ArrayList<>();

    public void agregarAutos(Auto auto){
        autos.add(auto);
    }
    public void agregarPartes(Objeto objeto) {partes.add(objeto);}

    public List<Auto> getAutos() {
        return autos;
    }

    public List<Objeto> getPartes() { return partes; }
}
