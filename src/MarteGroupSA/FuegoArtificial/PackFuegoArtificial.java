package MarteGroupSA.FuegoArtificial;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PackFuegoArtificial extends FuegoArtificial{
    private List<FuegoArtificial> fuegosArtificiales;

    public PackFuegoArtificial() {
        this.fuegosArtificiales = new ArrayList<>();
    }

    public void agregarFuegoArtificical(FuegoArtificial ... fuegosArtificiales) {
        Collections.addAll(this.fuegosArtificiales, fuegosArtificiales);
    }

    @Override
    public void reventar() {
        this.fuegosArtificiales.forEach(FuegoArtificial::reventar);
    }
}
