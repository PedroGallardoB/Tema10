package ejercicio2;

/**
 * Controla las horas
 *
 * @author Rexil
 */
public class Hora {
    /**
     * Indica la hora
     */
    private int hora;
    /**
     * Indica el minuto
     */
    private int minuto;
    /**
     * Indica los segundos
     */
    private int segundo;

    /**
     * Constructor por defecto
     */
    public Hora() {
        this.hora = 0;
        this.minuto = 0;
        this.segundo = 0;
    }

    /**
     * Constructor por parámetros
     *
     * @param hora
     * @param minuto
     * @param segundo
     */
    public Hora(int hora, int minuto, int segundo) throws NegativeSecondException, NegativeHourException, NegativeMinuteException {
        if (hora < 0) {
            throw new NegativeHourException();
        } else {
            this.hora = hora;
        }

        if (minuto < 0) {
            throw new NegativeMinuteException();
        } else {
            this.minuto = minuto;
        }
        if (segundo < 0) {
            throw new NegativeSecondException();
        } else {
            this.segundo = segundo;
        }


    }

    /**
     * Getter de hora (devuelve hora)
     *
     * @return hora
     */
    public int getHora() {
        return this.hora;
    }

    /**
     * Setter de hora (introduce hora)
     *
     * @param hora
     */
    public void setHora(int hora) throws NegativeHourException {
        if (hora>0){
            this.hora = hora;
        } else {
            throw new NegativeHourException();
        }

    }

    /**
     * Getter de minuto (devuelve minuto)
     *
     * @return minuto
     */
    public int getMinuto() {
        return this.minuto;
    }

    /**
     * Setter de minuto (devuelve minuto)
     *
     * @return hora
     */
    public void setMinuto(int minuto) throws NegativeMinuteException{
        if (minuto>0){
            this.minuto = minuto;
        }else{
            throw new NegativeMinuteException();
        }

    }

    /**
     * Devuelve los segundos al main
     *
     * @return segundo
     */
    public int getSegundo() {
        return this.segundo;
    }

    /**
     * Da valor a los segundos
     *
     * @param segundo
     */
    public void setSegundo(int segundo) throws NegativeSecondException{
        if (segundo>0){
            this.segundo = segundo;
        }else{
            throw new NegativeSecondException();
        }

    }

    /**
     * Incrementa un segundo a la hora
     */
    public void incrementaSegundo() {
        this.segundo++;
        if (this.segundo == 60) {
            this.segundo = 0;
            this.minuto++;
            if (this.minuto == 60) {
                this.minuto = 0;
                this.hora++;
                if (this.hora == 24) {
                    this.hora = 0;
                }
            }
        }
    }

}