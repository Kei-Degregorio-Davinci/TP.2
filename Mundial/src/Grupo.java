import java.util.ArrayList;

public class Grupo extends EtapaMundial{
    private ArrayList<Equipo> equipoQueAvanza;

    public Grupo(){
        this.equipoQueAvanza= new ArrayList<Equipo>();
    }

    public Grupo(ArrayList<Equipo> equipoQueAvanza){
        this.equipoQueAvanza= equipoQueAvanza;
    }

    @Override
    public ArrayList<Equipo> getEquipoQueAvanza() {
        return super.getEquipoQueAvanza();
    }
}
