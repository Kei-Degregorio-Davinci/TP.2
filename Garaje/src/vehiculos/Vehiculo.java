package vehiculos;

public class Vehiculo {
    private String tipoDeVehiculo;
    private int horaIngreso;
    private int horaRetirada;
    private boolean cambiarRueda;
    private double kilometraje;
    private Contacto datosDelDueño;

    public Vehiculo(String tipoDeVehiculo, int horaIngreso, int horaRetirada, boolean cambiarRueda, double kilometraje) {
        this.tipoDeVehiculo = tipoDeVehiculo;
        this.horaIngreso = horaIngreso;
        this.horaRetirada = horaRetirada;
        this.cambiarRueda = cambiarRueda;
        this.kilometraje = kilometraje;

    }

    public String getTipoDeVehiculo() {
        return tipoDeVehiculo;
    }

    public void setTipoDeVehiculo(String tipoDeVehiculo) {
        this.tipoDeVehiculo = tipoDeVehiculo;
    }

    public int getHoraIngreso() {
        return horaIngreso;
    }

    public void setHoraIngreso(int horaIngreso) {
        this.horaIngreso = horaIngreso;
    }

    public int getHoraRetirada() {
        return horaRetirada;
    }

    public void setHoraRetirada(int horaRetirada) {
        this.horaRetirada = horaRetirada;
    }

    public boolean isCambiarRueda() {
        return cambiarRueda;
    }

    public void setCambiarRueda(boolean cambiarRueda) {
        this.cambiarRueda = cambiarRueda;
    }

    public double getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(double kilometraje) {
        this.kilometraje = kilometraje;
    }

    public Contacto getDatosDelDueño() {
        return datosDelDueño;
    }

    public void setDatosDelDueño(Contacto datosDelDueño) {
        this.datosDelDueño = datosDelDueño;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "tipoDeVehiculo='" + tipoDeVehiculo + '\'' +
                ", horaIngreso=" + horaIngreso +
                ", horaRetirada=" + horaRetirada +
                ", cambiarRueda=" + cambiarRueda +
                ", kilometraje=" + kilometraje +
                ", datosDelDueño=" + datosDelDueño +
                '}';
    }
}
