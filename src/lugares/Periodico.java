package lugares;

import personaje.Personaje;
import utiles.Utiles;

public class Periodico extends Lugar{

    public Periodico() {
        super("periodico");
    }

    @Override
    public void iniciar(Personaje personaje) {
        System.out.println("valla al parecer hay cosas interesantes en el periodico");
        System.out.println("elije el numero de la opcion que desees");
        System.out.println("1) comprar auto usado");
        System.out.println("2) comprar partes para auto");
        System.out.println("3) salir");
        int op = Utiles.verificarEntero(1 ,3);

        do {
            switch (op){
                case 1:
                    comprarAutos(personaje);
                    break;

                case 2:
                    comprarPartes(personaje);
                    break;
            }
        }while(op != 3);
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
        int op = Utiles.verificarEntero(1, 4);
        Auto elegido = catalogoAutos[op-1];

            if(personaje.getDinero()>=elegido.getPrecio()){
                System.out.println("FELICIDADES, ahora " + elegido.getNombre() + " es todo tuyo");
                personaje.getGarage().agregarAutos(elegido);
                personaje.descontarDinero(elegido.getPrecio());
            }
            else{
                System.out.println("ERROR: dinero insuficiente");
            }

    }

    private void comprarPartes(Personaje personaje){
        Objeto motorBasico = new Objeto("Motor Basico Universal" , 100, 50, 0);
        Objeto transmisionBasica = new Objeto("Transmision basica universal" ,  100, 50, 0);
        Objeto motorUniversalV8_46 = new Objeto("Motor universal V-8, 4.6L", 350, 200 , 5);
        Objeto motorChryslerV8_46 = new Objeto("Motor Chrysler V-8, 4.6L", 360, 200, 8);
        Objeto motorUniversalV8_54 = new Objeto("Motor universal V-8, 5.4L", 500,300, 12);
        Objeto motorChryslerV8_58 = new Objeto("Motor Chrysler V-8, 5.8L", 525 , 350, 14);
        Objeto trans3VDodge = new Objeto("Transmisión 3 Vel Dodge", 125, 70, 4);
        Objeto trans3VCorvette = new Objeto("Transmisión 3 Vel Corvette", 170, 90, 5);
        Objeto transUniversal3V = new Objeto("Transmisión universal 3 Vel", 160, 80, 4);
        Objeto trans4VDodge = new Objeto("Transmisión 4 Vel Dodge", 250, 130, 10);
        Objeto trans4VCorvette = new Objeto("Transmisión 4 Vel Corvette", 405, 200, 10);
        Objeto trans4VUniversal = new Objeto("Transmisión 4 Vel universal", 350, 150, 12);

        Objeto[] partesAuto = {
                motorBasico, transmisionBasica, motorUniversalV8_46, motorChryslerV8_46, motorUniversalV8_54, motorChryslerV8_58, trans3VDodge, trans3VCorvette, transUniversal3V, trans4VDodge, trans4VCorvette, trans4VUniversal
        };

        for (int i = 0; i< partesAuto.length; i++){
            Objeto partes = partesAuto[i];
            System.out.println((i+1) + ") nombre: " + partes.getNombre() + " ,precio de compra: " + partes.getPrecioCompra() + " ,aumento de velidad: " + partes.getAumentoVelicidad());
        }

        System.out.println("Ingrese el numero del objeto que desea comprar");
        int op = Utiles.verificarEntero(1, partesAuto.length);
        Objeto elejido = partesAuto[op-1];

        if(personaje.getDinero()>= elejido.getPrecioCompra()){
            System.out.println("mejora agregada al garage para poder ser usada");
            personaje.descontarDinero(elejido.getPrecioCompra());
            personaje.getGarage().agregarPartes(elejido);
        }
        else {
            System.out.println("error: dinero insuficiente");
        }
    }
}
