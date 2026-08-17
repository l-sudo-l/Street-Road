import lugares.Periodico;
import utiles.Utiles;
import personaje.Personaje;

public class iniciarJuego {

    public void iniciar(){
        System.out.println("Bienvenido a Street Road");
        System.out.println("ingrese su nombre");
        String nombre = Utiles.verificarString();
        Personaje personaje = new Personaje(nombre, 750);

        System.out.println("ingrese el numero de la opcion que desea elegir");
        System.out.println("1) leer periodico");
        System.out.println("2) abir capot");
        System.out.println("3) ir a la gasolineria");
        System.out.println("4) ver info del auto");
        System.out.println("5) ver partes");
        System.out.println("6) vender auto");
        System.out.println("7) salir a la calle");
        System.out.println("8) salir del juego");
        int op = Utiles.verificarEntero(1,8);
        do {
            switch (op){
                case 1:
                    Periodico periodico = new Periodico();
                    periodico.iniciar(personaje);
                    break;

                case 2:
                    break;

                case 3:
                    break;

                case 4:
                    break;

                case 5:
                    break;

                case 6:
                    break;

                case 7:
                    break;
            }
        }while(op != 8);
    }


}
