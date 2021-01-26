package MarteGroupSA.FuegoArtificial;

public class FuegoArtificialIndividual extends FuegoArtificial{
    private String ruido;

    public FuegoArtificialIndividual(String ruido) {
        this.ruido = ruido;
    }

    @Override
    public void reventar() {
        System.out.println(ruido);
    }
}
