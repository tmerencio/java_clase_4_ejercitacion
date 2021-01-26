package SaveTheRopa;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GuardaRopa {
    private HashMap<Integer, List<Prenda>> prendasGuardadas;
    private Integer contador;

    public GuardaRopa() {
        this.contador = 0;
        this.prendasGuardadas = new HashMap<>();
    }

    public Integer guardarPrendas(List<Prenda> listaDePrenda) {
        this.contador++;
        this.prendasGuardadas.put(this.contador, listaDePrenda);
        return this.contador;
    }

    public void mostrarPrendas() {
        for(Map.Entry m : this.prendasGuardadas.entrySet()){
            System.out.println("Codigo " + m.getKey()+": ");
            mostrarListaDePrenda((List<Prenda>) m.getValue());
        }
    }

    private void mostrarListaDePrenda(List<Prenda> listaDePrenda){
        listaDePrenda.stream().forEach(p ->
                System.out.println("Marca: " + p.getMarca() +
                        ", Modelo: " + p.getModelo()));
    }

    public List<Prenda> devolverPrendas(Integer numero) {
        if (!this.prendasGuardadas.containsKey(numero)){
            return null;
        }
        return this.prendasGuardadas.get(numero);
    }
}
