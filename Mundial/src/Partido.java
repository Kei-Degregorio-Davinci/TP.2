import java.util.Date;

public class Partido {
    private Date fecha;
    private Equipo local;
    private Equipo visitante;
    private Resultado resultado;

    public Partido(Date fecha, Equipo local, Equipo visitante) {
        this.fecha = fecha;
        this.local = local;
        this.visitante = visitante;

    }

    public Equipo getLocal() {
        return local;
    }

    public Equipo getVisitante() {
        return visitante;
    }

    public Resultado getResultado() {
        return resultado;
    }

    @Override
    public String toString() {
        return "Partido{" +
                "fecha=" + fecha +
                ", local=" + local +
                ", visitante=" + visitante +
                ", resultado=" + resultado +
                '}';
    }
}
