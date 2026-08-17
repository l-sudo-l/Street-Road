package lugares;

import personaje.Personaje;
import utiles.Utiles;

public class Periodico extends Lugar{

    public Periodico(String nombre) {
        super(nombre);
    }

    @Override
    public void iniciar(Personaje personaje) {

    }

    private void comprarAutos(Personaje personaje){
        Auto chrevrolet = new Auto("1940 Chrevrolet coupe", 400, 150, "basico", "basica", 40);
        Auto dodge = new Auto("1955 Dodge Royal Lancer", 625, 170, "basico" , "basica", 40);
        Auto chrysler = new Auto("1954 Chrysler Monterrey", 900, 180, "basico", "basica", 40);
        Auto corvette = new Auto("1956 Corvette Rebuilt", 1450, 190, "basico", "basica", 40);

        Auto[] catalogoAutos ={
                chrevrolet, dodge, chrysler, corvette
        };

        for (int i = 0; i < catalogoAutos.length; i++){
            Auto auto =catalogoAutos[i];
            System.out.println((i+1) + ") nombre: " + auto.getNombre() + " ,precio: " + auto.getPrecio() + "$ ,velocidad maxima: " + auto.getVelocidadMaxima() + " Km/h ,motor: " + auto.getMotor() + " ,transmision: " + auto.getTransmision() + " ,tanque de gasolina de: " + auto.getTanqueGasolina() + " litros");
        }

        System.out.println("Ingrese el numero del auto que desea comprar: ");
        boolean error = false;
        int op = Utiles.verificarEntero(1, 4);
        Auto elegido = catalogoAutos[op-1];

        do {
            error = false;
            if(personaje.getDinero()>=elegido.getPrecio()){
                System.out.println("FELICIDADES, ahora " + elegido.getNombre() + " es todo tuyo");
                personaje.getGarage().agregarAutos(elegido);
                personaje.descontarDinero(elegido.getPrecio());
            }
            else{
                System.out.println("ERROR: dinero insuficiente");
                error = true;
            }
        }while(error);

    }
}
