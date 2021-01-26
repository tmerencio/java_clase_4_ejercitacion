package Dakar;

public class Moto extends Vehiculo{
    public static final Double PESO = 300.0;
    public static final Integer RUEDAS = 2;

    public Moto(String patente, Double velocidad, Double aceleracion, Double anguloDeGiro) {
        super(patente, velocidad, aceleracion, anguloDeGiro);
        this.peso = PESO;
        this.ruedas = RUEDAS;
    }
}
