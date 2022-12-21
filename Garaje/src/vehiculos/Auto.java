package vehiculos;

public class Auto extends Vehiculo{
    private String marca;
    private int numeroDePuertas;
    private String patente;

    public Auto(String marca, int numeroDePuertas, String patente) {
        this.marca = marca;
        this.numeroDePuertas = numeroDePuertas;
        this.patente = patente;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getNumeroDePuertas() {
        return numeroDePuertas;
    }

    public void setNumeroDePuertas(int numeroDePuertas) {
        this.numeroDePuertas = numeroDePuertas;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "marca='" + marca + '\'' +
                ", numeroDePuertas=" + numeroDePuertas +
                ", patente='" + patente + '\'' +
                '}';
    }
}
