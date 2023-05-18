package ejercicio2;

public class Main {
    public static void main(String[] args) throws NegativeMinuteException, NegativeHourException, NegativeSecondException {
        Hora hora = new Hora(-2,4,-1);
        System.out.println(hora);
    }
}
