package MarteGroupSA.Invitado;

public abstract class Invitado {
    private String nombre;

    public Invitado(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public abstract void comer();
}
