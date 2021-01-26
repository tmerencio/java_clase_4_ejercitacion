package Dakar;

import java.util.*;
import java.util.stream.Collectors;

public class Carrera {
    private Float distancia;
    private Float premioEnDolares;
    private String nombre;
    private Integer cantidadDeVehiculosPermitidos;
    private List<Vehiculo> listaDeVehiculos;
    private Integer cupo;
    private SocorristaAuto socorristaAuto;
    private SocorristaMoto socorristaMoto;

    public Carrera(String nombre, Integer cantidadDeVehiculosPermitidos) {
        this.nombre = nombre;
        this.cantidadDeVehiculosPermitidos = cantidadDeVehiculosPermitidos;
        this.cupo = cantidadDeVehiculosPermitidos;
        this.listaDeVehiculos = new ArrayList<>();
    }

    public void darDeAltaAuto(String patente, Double velocidad,
                              Double aceleracion, Double anguloDeGiro) {
        if(cupoDisponible()) {
            agregarVehiculo(new Auto(patente, velocidad, aceleracion, anguloDeGiro));
        }
    }

    public void darDeAltaMoto(String patente, Double velocidad,
                              Double aceleracion, Double anguloDeGiro) {
        if(cupoDisponible()) {
            agregarVehiculo(new Moto(patente, velocidad, aceleracion, anguloDeGiro));
        }
    }

    public void agregarVehiculo(Vehiculo vehiculo) {
        this.listaDeVehiculos.add(vehiculo);
        this.cupo--;
    }

    public boolean cupoDisponible() {
        return this.cupo > 0;
    }

    public void eliminarVehiculo(Vehiculo vehiculo) {
        this.listaDeVehiculos.remove(vehiculo);
    }

    public void eliminarVehiculoConPatente(String patente) {
        Vehiculo vehiculoAEliminar = this.listaDeVehiculos.stream().filter(v -> v.getPatente().equals(patente)).collect(Collectors.toList()).get(0);
        eliminarVehiculo(vehiculoAEliminar);
    }

    public Vehiculo definirGanador() {
        Vehiculo ganador = null;

        OptionalDouble valorMax = listaDeVehiculos
                .stream()
                .mapToDouble(Vehiculo::calcularValor)
                .max();

        ganador = listaDeVehiculos
                .stream()
                .filter(v -> v.calcularValor() == valorMax.getAsDouble())
                .collect(Collectors.toList())
                .get(0);

        return ganador;
    }

    public List<Vehiculo> getListaDeVehiculos() {
        return listaDeVehiculos;
    }

    public void setSocorristaAuto(SocorristaAuto socorristaAuto) {
        this.socorristaAuto = socorristaAuto;
    }

    public void setSocorristaMoto(SocorristaMoto socorristaMoto) {
        this.socorristaMoto = socorristaMoto;
    }

    public void socorrerAuto(String patente) {
        Auto autoASocorrer = (Auto) this.listaDeVehiculos
                .stream()
                .filter(vehiculo -> vehiculo.getPatente().equals(patente) && vehiculo instanceof Auto)
                .collect(Collectors.toList())
                .get(0);

        this.socorristaAuto.socorrer(autoASocorrer);
    }

    public void socorrerMoto(String patente) {
        Moto motoASocorrer = (Moto) this.listaDeVehiculos
                .stream()
                .filter(vehiculo -> vehiculo.getPatente().equals(patente) && vehiculo instanceof Moto)
                .collect(Collectors.toList())
                .get(0);

        this.socorristaMoto.socorrer(motoASocorrer);
    }
}
