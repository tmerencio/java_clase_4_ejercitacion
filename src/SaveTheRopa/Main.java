package SaveTheRopa;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        GuardaRopa guardaRopa = new GuardaRopa();
         Prenda remera = new Prenda("marca1", "remera");
         Prenda campera = new Prenda("marca2", "campera");

        List<Prenda> listaDePrendas = new ArrayList<>();
        listaDePrendas.add(remera);
        listaDePrendas.add(campera);

        Integer codigo = guardaRopa.guardarPrendas(listaDePrendas);

        guardaRopa.mostrarPrendas();

        List<Prenda> prendasReclamadas = guardaRopa.devolverPrendas(codigo);
        System.out.println("Prendas reclamadas: ");
        prendasReclamadas.stream().forEach(p ->
                System.out.println("Marca: " + p.getMarca() +
                        ", Modelo: " + p.getModelo()));
    }
}
