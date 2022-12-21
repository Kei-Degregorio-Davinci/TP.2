package torneo;

import java.util.ArrayList;

public abstract class EtapaMundial {
    private String descripcionEtapa;
    private ArrayList<Partido> partidos;
    private ArrayList<Equipo> equipoQueAvanza;

    public EtapaMundial() {
        super();
        this.partidos= new ArrayList<Partido>();
        this.equipoQueAvanza= new ArrayList<Equipo>();
    }

    public String getDescripcionEtapa() {
        return descripcionEtapa;
    }

    public void setDescripcionEtapa(String descripcionEtapa) {
        this.descripcionEtapa = descripcionEtapa;
    }


    protected ArrayList<Partido> getPartidos() {
        return partidos;
    }


    public ArrayList<Equipo> getEquipoQueAvanza() {
        return equipoQueAvanza;
    }

    public void addPartido(Partido partido){
        this.partidos.add(partido);
    }

    public void addEquipoQueAvanza(Equipo equipo){
        this.equipoQueAvanza.add(equipo);
    }

    @Override
    public String toString() {
        return "torneo.EtapaMundial{" +
                "descripcionEtapa='" + descripcionEtapa + '\'' +
                ", partidos=" + partidos +
                ", equipoQueAvanza=" + equipoQueAvanza +
                '}';
    }
}
