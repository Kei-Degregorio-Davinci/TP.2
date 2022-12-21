package sistemaGarage;

import vehiculos.Auto;
import vehiculos.Moto;
import vehiculos.Vehiculo;

public class Garage {
    private int horaApertura;
    private int horaCierre;
    private String direccion;
    private int capacidadMaxima;
    private int precioCambioRuedaDeAuto;
    private int PrecioCambioRuedaDeMoto;
    private Vehiculo precioTotalEnCambioDeRueda;
    private Vehiculo kilometrajeEnTotal;
    private Vehiculo totalVehiculosRecibidos;

    public Garage(int horaApertura, int horaCierre, String direccion, int capacidadMaxima, int precioCambioRuedaDeAuto, int PrecioCambioRuedaDeMoto) {
        this.horaApertura = horaApertura;
        this.horaCierre = horaCierre;
        this.direccion = direccion;
        this.capacidadMaxima = capacidadMaxima;
        this.precioCambioRuedaDeAuto = precioCambioRuedaDeAuto;
        this.PrecioCambioRuedaDeMoto = PrecioCambioRuedaDeMoto;
    }

    public Garage(int horaApertura, int horaCierre, String direccion, int capacidadMaxima, int precioCambioRuedaDeAuto, int PrecioCambioRuedaDeMoto,
                  Vehiculo precioTotalEnCambioDeRueda, Vehiculo kilometrajeEnTotal, Vehiculo totalVehiculosRecibidos) {
        this.horaApertura = horaApertura;
        this.horaCierre = horaCierre;
        this.direccion = direccion;
        this.capacidadMaxima = capacidadMaxima;
        this.precioCambioRuedaDeAuto = precioCambioRuedaDeAuto;
        this.PrecioCambioRuedaDeMoto = PrecioCambioRuedaDeMoto;
        this.precioTotalEnCambioDeRueda = precioTotalEnCambioDeRueda;
        this.kilometrajeEnTotal = kilometrajeEnTotal;
        this.totalVehiculosRecibidos = totalVehiculosRecibidos;
    }

    public int getHoraApertura() {
        return horaApertura;
    }

    public void setHoraApertura(int horaApertura) {
        this.horaApertura = horaApertura;
    }

    public int getHoraCierre() {
        return horaCierre;
    }

    public void setHoraCierre(int horaCierre) {
        this.horaCierre = horaCierre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getPrecioCambioRuedaDeAuto() {
        return precioCambioRuedaDeAuto;
    }

    public void setPrecioCambioRuedaDeAuto(int precioCambioRuedaDeAuto) {
        this.precioCambioRuedaDeAuto = precioCambioRuedaDeAuto;
    }

    public int getPrecioCambioRuedaDeMoto() {
        return PrecioCambioRuedaDeMoto;
    }

    public void setPrecioCambioRuedaDeMoto(int getPrecioCambioRuedaDeMoto) {
        this.PrecioCambioRuedaDeMoto = getPrecioCambioRuedaDeMoto;
    }

    public Vehiculo getPrecioTotalEnCambioDeRueda() {
        return precioTotalEnCambioDeRueda;
    }

    public void setPrecioTotalEnCambioDeRueda(Vehiculo precioTotalEnCambioDeRueda) {
        this.precioTotalEnCambioDeRueda = precioTotalEnCambioDeRueda;
    }

    public Vehiculo getKilometrajeEnTotal() {
        return kilometrajeEnTotal;
    }

    public void setKilometrajeEnTotal(Vehiculo kilometrajeEnTotal) {
        this.kilometrajeEnTotal = kilometrajeEnTotal;
    }


    public Vehiculo getTotalVehiculosRecibidos() {
        return totalVehiculosRecibidos;
    }

    public void setTotalVehiculosRecibidos(Vehiculo totalVehiculosRecibidos) {
        this.totalVehiculosRecibidos = totalVehiculosRecibidos;
    }

    @Override
    public String toString() {
        return "Garage{" +
                "horaApertura=" + horaApertura +
                ", horaCierre=" + horaCierre +
                ", direccion='" + direccion + '\'' +
                ", capacidadMaxima=" + capacidadMaxima +
                ", precioCambioRuedaDeAuto=" + precioCambioRuedaDeAuto +
                ", PrecioCambioRuedaDeMoto=" + PrecioCambioRuedaDeMoto +
                ", precioTotalEnCambioDeRueda=" + precioTotalEnCambioDeRueda +
                ", kilometrajeEnTotal=" + kilometrajeEnTotal +
                ", totalVehiculosRecibidos=" + totalVehiculosRecibidos +
                '}';
    }
}
