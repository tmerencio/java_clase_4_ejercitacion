package Dakar;

public class Auto extends Vehiculo{
    public static final Double PESO = 1000.0;
    public static final Integer RUEDAS = 4;


    public Auto(String patente, Double velocidad, Double aceleracion, Double anguloDeGiro) {
        super(patente, velocidad, aceleracion, anguloDeGiro);
        this.peso = PESO;
        this.ruedas = RUEDAS;
    }
}
