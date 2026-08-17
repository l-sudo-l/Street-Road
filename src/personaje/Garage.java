package personaje;

import lugares.Auto;
import java.util.ArrayList;
import java.util.List;

public class Garage {
    private List<Auto> autos = new ArrayList<>();

    public void agregarAutos(Auto auto){
        autos.add(auto);
    }

    public List<Auto> getAutos() {
        return autos;
    }
}
