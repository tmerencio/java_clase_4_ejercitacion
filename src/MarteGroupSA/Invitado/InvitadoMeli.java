package MarteGroupSA.Invitado;

public class InvitadoMeli extends Invitado{

    public InvitadoMeli(String nombre) {
        super(nombre);
    }

    @Override
    public void comer() {
        System.out.println("Viva la chiqui!!");
    }
}
