package torneo;

import java.util.ArrayList;

public class Equipo {
    private String nombre;
    private ArrayList<Partido> partidosJugados;
    private int puntajeEtapaGrupos;

    public Equipo(String nombre) {
        this.nombre = nombre;
        this.partidosJugados= new ArrayList<Partido>();
        this.puntajeEtapaGrupos=0;
    }

    public Equipo(String nombre, ArrayList<Partido> partidosJugados) {
        this.nombre = nombre;
        this.partidosJugados = partidosJugados;
        this.puntajeEtapaGrupos=0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntajeEtapaGrupos() {
        return puntajeEtapaGrupos;
    }

    public void setPuntajeEtapaGrupos(int puntajeEtapaGrupos) {
        this.puntajeEtapaGrupos = puntajeEtapaGrupos;
    }
    public void addPartidosJugados(Partido partido) {
        this.partidosJugados.add(partido);
    }

    public void partidoGanado(){
        this.puntajeEtapaGrupos += 3;
    }

    public void partidoEmpatado(){
        this.puntajeEtapaGrupos += 1;
    }

    @Override
    public String toString() {
        return "torneo.Equipo{" +
                "nombre='" + nombre +
        '}';
    }
}
