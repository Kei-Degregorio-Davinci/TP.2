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

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Equipo getLocal() {
        return local;
    }

    public void setLocal(Equipo local) {
        this.local = local;
    }

    public Equipo getVisitante() {
        return visitante;
    }

    public void setVisitante(Equipo visitante) {
        this.visitante = visitante;
    }

    public Resultado getResultado() {
        return resultado;
    }

    public void setResultado(Resultado resultado) {
        this.resultado = resultado;
        this.local.addPartidosJugados(this);
        this.visitante.addPartidosJugados(this);
        if (this.getResultado().ganoLocal()){
            this.local.partidoGanado();
        }
        else if (this.getResultado().empate()){
            this.local.partidoEmpatado();
            this.visitante.partidoEmpatado();
        } else {
            this.visitante.partidoGanado();
        }

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
