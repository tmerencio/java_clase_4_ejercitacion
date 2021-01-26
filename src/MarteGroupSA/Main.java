package MarteGroupSA;

import MarteGroupSA.FuegoArtificial.FuegoArtificial;
import MarteGroupSA.FuegoArtificial.FuegoArtificialIndividual;
import MarteGroupSA.FuegoArtificial.PackFuegoArtificial;
import MarteGroupSA.Invitado.Invitado;
import MarteGroupSA.Invitado.InvitadoMeli;
import MarteGroupSA.Invitado.InvitadoStandard;

public class Main {
    public static void main(String[] args) {
        Evento evento = new Evento("Centenario de “La Chiqui” Legrand");

        Invitado invitado1 = new InvitadoStandard("Juan");
        Invitado invitado2 = new InvitadoStandard("Maria");
        Invitado invitado3 = new InvitadoStandard("Julieta");
        Invitado invitado4 = new InvitadoMeli("Tomas");
        Invitado invitado5 = new InvitadoMeli("Martin");
        Invitado invitado6 = new InvitadoMeli("Juana");

        evento.agregarInvitado(invitado1, invitado2, invitado3,
                               invitado4, invitado5, invitado6);

        FuegoArtificialIndividual fuegoArtificial1 = new FuegoArtificialIndividual("Pum!");
        FuegoArtificialIndividual fuegoArtificial2 = new FuegoArtificialIndividual("Pam!");
        FuegoArtificialIndividual fuegoArtificial3 = new FuegoArtificialIndividual("Pim!");
        FuegoArtificialIndividual fuegoArtificial4 = new FuegoArtificialIndividual("PUM!");
        FuegoArtificialIndividual fuegoArtificial5 = new FuegoArtificialIndividual("PAM!");
        FuegoArtificialIndividual fuegoArtificial6 = new FuegoArtificialIndividual("PIM!");
        FuegoArtificialIndividual fuegoArtificial7 = new FuegoArtificialIndividual("BUM!");
        FuegoArtificialIndividual fuegoArtificial8 = new FuegoArtificialIndividual("bum!");
        FuegoArtificialIndividual fuegoArtificial9 = new FuegoArtificialIndividual("POP!");

        PackFuegoArtificial packFuegoArtificial1 = new PackFuegoArtificial();
        packFuegoArtificial1.agregarFuegoArtificical(fuegoArtificial1, fuegoArtificial2, fuegoArtificial3);

        PackFuegoArtificial packFuegoArtificial2 = new PackFuegoArtificial();
        packFuegoArtificial2.agregarFuegoArtificical(fuegoArtificial8, fuegoArtificial9);

        evento.agregarFuegoArtificical(fuegoArtificial4, fuegoArtificial5, fuegoArtificial6,
                fuegoArtificial7, packFuegoArtificial1, packFuegoArtificial2, fuegoArtificial1);

        evento.apagarVelas();
    }
}
