package MarteGroupSA;

import MarteGroupSA.FuegoArtificial.FuegoArtificial;
import MarteGroupSA.Invitado.Invitado;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Evento {
    private String nombre;
    private List<Invitado> invitados;
    private List<FuegoArtificial> fuegosArtificiales;

    public Evento(String nombre) {
        this.nombre = nombre;
        this.fuegosArtificiales = new ArrayList<>();
        this.invitados = new ArrayList<>();
    }

    public void agregarFuegoArtificical(FuegoArtificial ... fuegosArtificiales) {
        Collections.addAll(this.fuegosArtificiales, fuegosArtificiales);
    }

    public void agregarInvitado(Invitado ... invitados) {
        Collections.addAll(this.invitados, invitados);
    }

    public void apagarVelas() {
        this.fuegosArtificiales.forEach(FuegoArtificial::reventar);
        this.invitados.forEach(Invitado::comer);
    }
}
