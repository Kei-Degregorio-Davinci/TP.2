public class Resultado {
    private int golesLocal;
    private int golesVisitante;

    public Resultado(int golesLocal, int golesVisitante) {
        this.golesLocal = golesLocal;
        this.golesVisitante = golesVisitante;
    }

    public int getGolesLocal() {
        return golesLocal;
    }

    public void setGolesLocal(int golesLocal) {
        this.golesLocal = golesLocal;
    }

    public int getGolesVisitante() {
        return golesVisitante;
    }

    public void setGolesVisitante(int golesVisitante) {
        this.golesVisitante = golesVisitante;
    }

    public boolean ganoLocal() {
        if (this.golesLocal>this.golesVisitante){
            return true;
        } else {
            return false;
        }
    }

    public boolean ganoVisitante(){
        if (this.golesVisitante>this.golesLocal){
            return true;
        } else {
            return false;
        }
    }

    public boolean empate(){
        if (this.golesLocal == this.golesVisitante){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Resultado{" +
                "golesLocal=" + golesLocal +
                ", golesVisitante=" + golesVisitante +
                '}';
    }
}

