package ejercicio2;

public class NegativeHourException extends Exception{

    @Override
    public String toString() {
        return "ERROR: Hora negativa";
    }
}
