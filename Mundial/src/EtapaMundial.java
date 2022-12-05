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

    public EtapaMundial(String descripcionEtapa, ArrayList<Partido> partidos, ArrayList<Equipo> equipoQueAvanza) {
        this.descripcionEtapa = descripcionEtapa;
        this.partidos = partidos;
        this.equipoQueAvanza = equipoQueAvanza;
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

    public void setPartidos(ArrayList<Partido> partidos) {
        this.partidos = partidos;
    }

    public ArrayList<Equipo> getEquipoQueAvanza() {
        return equipoQueAvanza;
    }

    public void setEquipoQueAvanza(ArrayList<Equipo> equipoQueAvanza) {
        this.equipoQueAvanza = equipoQueAvanza;
    }

    public void addPartido(Partido partido){
        this.partidos.add(partido);
    }

    public void addEquipoQueAvanza(Equipo equipo){
        this.equipoQueAvanza.add(equipo);
    }

    @Override
    public String toString() {
        return "EtapaMundial{" +
                "descripcionEtapa='" + descripcionEtapa + '\'' +
                ", partidos=" + partidos +
                ", equipoQueAvanza=" + equipoQueAvanza +
                '}';
    }
}
