package Dakar;

public class Main {
    public static void main(String[] args) {
        Carrera carrera = new Carrera("MiniDakar", 10000);

        carrera.darDeAltaAuto("1A",200.0,20.0,10.0);
        carrera.darDeAltaMoto("2B",100.0,40.0,5.0);
        carrera.darDeAltaMoto("3C",300.0,30.0,7.0);
        carrera.eliminarVehiculoConPatente("3C");
        carrera.darDeAltaAuto("5E",200.0,20.0,10.0);
        carrera.darDeAltaMoto("4D",150.0,30.0,7.0);

        System.out.println("Participantes: " + carrera.getListaDeVehiculos());
        System.out.println("Ganador: " + carrera.definirGanador());

        SocorristaAuto socorristaAuto = new SocorristaAuto();
        SocorristaMoto socorristaMoto = new SocorristaMoto();

        carrera.setSocorristaAuto(socorristaAuto);
        carrera.setSocorristaMoto(socorristaMoto);

        carrera.socorrerAuto("1A");
    }
}
