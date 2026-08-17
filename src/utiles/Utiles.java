package utiles;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Utiles {
    private static Scanner sc = new Scanner(System.in);

    public static int verificarEntero(int min , int max){
        boolean error = false;
        int num = 0;
        do {
            try {
                error = false;
                sc.nextLine();
                if (num < min || num > max){
                    System.out.println("ERROR: ingrese un numero entre: " + min + " y " + max);
                    error = true;
                    sc.nextLine();
                }
            }catch (InputMismatchException e){
                System.out.println("ERROR: ingrese un numero entero");
                error = true;
                sc.nextLine();
            }

        }while(error);
        return num;
    }

    public static String verificarString(){
        boolean error = false;
        String texto = "";
            do {
                if (texto.contains(" ")){
                    System.out.println("ERROR: ingrese el texto sin espacios dentro de las palabras");
                    error = true;
                    sc.nextLine();
                }
            }while(error);

        return texto;
    }
}
