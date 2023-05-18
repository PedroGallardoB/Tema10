package ejercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Funciones {//Ctrl Alt L

    public static double readDouble(Scanner sc) {
        double doub = 0;
        try {
            doub = sc.nextDouble();

        } catch (InputMismatchException e) {
            System.out.println("ERROR: El valor introducido no es de tipo double");
            //System.out.println(e.getMessage());
        } finally {
            sc.nextLine();
        }
        return doub;
    }

    public static int readInt(Scanner sc) {
        int entero = 0;
        try {
           entero = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("ERROR: El valor introducido no es de tipo int");
           // System.out.println(e.getMessage());
        } finally {
            sc.nextLine();
        }
        return entero;
    }
}
