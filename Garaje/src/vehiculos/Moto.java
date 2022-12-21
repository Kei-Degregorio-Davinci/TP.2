package vehiculos;

public class Moto extends Vehiculo {
    private String marca;
    private double cilindrada;
    private String patente;

      public Moto( String marca, double cilindrada, String patente) {
        this.marca = marca;
        this.cilindrada = cilindrada;
        this.patente = patente;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    @Override
    public String toString() {
        return "Moto{" +
                "marca='" + marca + '\'' +
                ", cilindrada=" + cilindrada +
                ", patente='" + patente + '\'' +
                '}';
    }
}
