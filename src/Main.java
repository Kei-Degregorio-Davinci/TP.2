import sistemaGarage.Garage;
import torneo.*;
import vehiculos.Auto;
import vehiculos.Contacto;
import vehiculos.Moto;
import vehiculos.Vehiculo;
import torneo.Resultado;


import java.util.Date;

public class Main {
    public static void main(String[] args) {

        //GRUPO A
        Equipo catar = new Equipo("Catar");
        Equipo ecuador = new Equipo("Ecuador");
        Equipo senegal = new Equipo("Senegal");
        Equipo paisesbajos = new Equipo("Paises Bajos");

        //GRUPO B
        Equipo inglaterra = new Equipo("Inglaterra");
        Equipo iran = new Equipo("Iran");
        Equipo estadosunidos = new Equipo("Estados Unidos");
        Equipo gales = new Equipo("Gales");

        //GRUPO C
        Equipo argentina = new Equipo("Argentina");
        Equipo arabiasaudita = new Equipo("Arabia Saudita");
        Equipo mexico = new Equipo("México");
        Equipo polonia = new Equipo("Polonia");

        //GRUPO D
        Equipo dinamarca = new Equipo("Dinamarca");
        Equipo tunez = new Equipo("Tunez");
        Equipo francia = new Equipo("Francia");
        Equipo australia = new Equipo("Australia");

        //GRUPO E
        Equipo alemania = new Equipo("Alemania");
        Equipo japon = new Equipo("Japón");
        Equipo españa = new Equipo("España");
        Equipo costarica = new Equipo("Costa Rica");

        //GRUPO F
        Equipo marruecos = new Equipo("Marruecos");
        Equipo croacia = new Equipo("Croacia");
        Equipo belgica = new Equipo("Bélgica");
        Equipo canada = new Equipo("Canada");

        //GRUPO G
        Equipo suiza = new Equipo("Suiza");
        Equipo camerun = new Equipo("Camerun");
        Equipo brasil = new Equipo("Brasil");
        Equipo serbia = new Equipo("Serbia");

        //GRUPO H
        Equipo uruguay = new Equipo("Uruguay");
        Equipo corea = new Equipo("República De Corea");
        Equipo portugal = new Equipo("Portugal");
        Equipo ghana = new Equipo("Ghana");


        //OCTAVOS

        Partido p1= new Partido(new Date(2022,12,03), paisesbajos, estadosunidos);
        Partido p2= new Partido(new Date(2022,12,03), argentina, australia);
        Partido p3= new Partido(new Date(2022,12,04), francia,polonia);
        Partido p4= new Partido(new Date(2022,12,04), inglaterra, senegal);
        Partido p5= new Partido(new Date(2022,12,05), japon, croacia);
        Partido p6= new Partido(new Date(2022,12,05), brasil, corea);
        Partido p7= new Partido(new Date(2022,12,06), marruecos, españa);
        Partido p8= new Partido(new Date(2022,12,06), portugal, suiza);

        System.out.println("Partidos del torneo.Octavos");
        System.out.println("torneo.Partido:" + p1);
        System.out.println("torneo.Partido:" + p2 );
        System.out.println("torneo.Partido:" + p3 );
        System.out.println("torneo.Partido:" + p4 );
        System.out.println("torneo.Partido:" + p5 );
        System.out.println("torneo.Partido:" + p6 );
        System.out.println("torneo.Partido:" + p7 );
        System.out.println("torneo.Partido:" + p8 );

        Resultado rp1= new Resultado(3,1);
        Resultado rp2= new Resultado(2,1);
        Resultado rp3= new Resultado(3,1);
        Resultado rp4= new Resultado(3,0);
        Resultado rp5= new Resultado(1,3);
        Resultado rp6= new Resultado(4,1);
        Resultado rp7= new Resultado(3,0);
        Resultado rp8= new Resultado(6,1);
        System.out.println("Resultados del torneo.Octavos");
        System.out.println(rp1);
        System.out.println(rp2);
        System.out.println(rp3);
        System.out.println(rp4);
        System.out.println(rp5);
        System.out.println(rp6);
        System.out.println(rp7);
        System.out.println(rp8);

        Grupo grupoA= new Grupo();
        Grupo grupoB= new Grupo();
        Grupo grupoC= new Grupo();
        Grupo grupoD= new Grupo();
        Grupo grupoE= new Grupo();
        Grupo grupoF= new Grupo();
        Grupo grupoG= new Grupo();
        Grupo grupoH= new Grupo();

        p1.setResultado(rp1);
        p2.setResultado(rp2);
        p3.setResultado(rp3);
        p4.setResultado(rp4);
        p5.setResultado(rp5);
        p6.setResultado(rp6);
        p7.setResultado(rp7);
        p8.setResultado(rp8);

        grupoA.addPartido(p1);
        grupoA.addPartido(p4);
        grupoB.addPartido(p1);
        grupoB.addPartido(p4);
        grupoC.addPartido(p2);
        grupoC.addPartido(p3);
        grupoD.addPartido(p2);
        grupoD.addPartido(p3);
        grupoE.addPartido(p5);
        grupoE.addPartido(p7);
        grupoF.addPartido(p7);
        grupoF.addPartido(p5);
        grupoG.addPartido(p8);
        grupoG.addPartido(p6);
        grupoH.addPartido(p6);
        grupoH.addPartido(p8);

        System.out.println("Puntaje Senegal:" + senegal.getPuntajeEtapaGrupos());
        System.out.println("Puntaje Holanda:" + paisesbajos.getPuntajeEtapaGrupos());
        System.out.println("Puntaje Inglaterra:" + inglaterra.getPuntajeEtapaGrupos());
        System.out.println("Puntaje Estados Unidos:" + estadosunidos.getPuntajeEtapaGrupos());
        System.out.println("Puntaje Argentina" + argentina.getPuntajeEtapaGrupos());
        System.out.println("Puntaje Polonia:" + polonia.getPuntajeEtapaGrupos());
        System.out.println("Puntaje Francia:" + francia.getPuntajeEtapaGrupos());
        System.out.println("Puntaje Australia:" + australia.getPuntajeEtapaGrupos());
        System.out.println("Puntaje Japón:" + japon.getPuntajeEtapaGrupos());
        System.out.println("Puntaje España:" + españa.getPuntajeEtapaGrupos());
        System.out.println("Puntaje Marruecos:" + marruecos.getPuntajeEtapaGrupos());
        System.out.println("Puntaje Croacia:" + croacia.getPuntajeEtapaGrupos());
        System.out.println("Puntaje Suiza:" + suiza.getPuntajeEtapaGrupos());
        System.out.println("Puntaje Brasil:" + brasil.getPuntajeEtapaGrupos());
        System.out.println("Puntaje Corea:" + corea.getPuntajeEtapaGrupos());
        System.out.println("Puntaje Portugal:" + portugal.getPuntajeEtapaGrupos());

        grupoA.addEquipoQueAvanza(paisesbajos);
        grupoB.addEquipoQueAvanza(inglaterra);
        grupoC.addEquipoQueAvanza(argentina);
        grupoD.addEquipoQueAvanza(francia);
        grupoF.addEquipoQueAvanza(croacia);
        grupoF.addEquipoQueAvanza(marruecos);
        grupoG.addEquipoQueAvanza(brasil);
        grupoH.addEquipoQueAvanza(portugal);

        System.out.println("Equipos que avanzan a Cuartos:");
        System.out.println(grupoA.getEquipoQueAvanza().get(0).getNombre());
        System.out.println(grupoB.getEquipoQueAvanza().get(0).getNombre());
        System.out.println(grupoC.getEquipoQueAvanza().get(0).getNombre());
        System.out.println(grupoD.getEquipoQueAvanza().get(0).getNombre());
        System.out.println(grupoF.getEquipoQueAvanza().get(0).getNombre());
        System.out.println(grupoF.getEquipoQueAvanza().get(1).getNombre());
        System.out.println(grupoG.getEquipoQueAvanza().get(0).getNombre());
        System.out.println(grupoH.getEquipoQueAvanza().get(0).getNombre());

        //CUARTOS
        Partido p9= new Partido(new Date(2022,12,9), croacia, brasil);
        Partido p10= new Partido(new Date(2022,12,9), paisesbajos, argentina);
        Partido p11= new Partido(new Date(2022,12,10), marruecos, portugal);
        Partido p12= new Partido(new Date(2022,12,10), inglaterra, francia);

        System.out.println("Partidos del torneo.Cuartos");
        System.out.println("torneo.Partido:" + p9);
        System.out.println("torneo.Partido:" + p10);
        System.out.println("torneo.Partido:" + p11);
        System.out.println("torneo.Partido:" + p12);

        Resultado rp9= new Resultado(4,2);
        Resultado rp10= new Resultado(3,4);
        Resultado rp11= new Resultado(1,0);
        Resultado rp12= new Resultado(1,2);

        System.out.println("Resultados del torneo.Cuartos");
        System.out.println(rp9);
        System.out.println(rp10);
        System.out.println(rp11);
        System.out.println(rp12);

        p9.setResultado(rp9);
        p10.setResultado(rp10);
        p11.setResultado(rp11);
        p12.setResultado(rp12);

        grupoA.addPartido(p10);
        grupoB.addPartido(p12);
        grupoC.addPartido(p10);
        grupoD.addPartido(p12);
        grupoF.addPartido(p9);
        grupoF.addPartido(p11);
        grupoG.addPartido(p9);
        grupoH.addPartido(p11);

        System.out.println("Puntaje Croacia:" + croacia.getPuntajeEtapaGrupos());
        System.out.println("Puntaje Brasil:" + brasil.getPuntajeEtapaGrupos());
        System.out.println("Puntaje Holanda:" + paisesbajos.getPuntajeEtapaGrupos());
        System.out.println("Puntaje Argentina:" + argentina.getPuntajeEtapaGrupos());
        System.out.println("Puntaje Marruecos:" + marruecos.getPuntajeEtapaGrupos());
        System.out.println("Puntaje Portugal:" + portugal.getPuntajeEtapaGrupos());
        System.out.println("Puntaje Inglaterra:" + inglaterra.getPuntajeEtapaGrupos());
        System.out.println("Puntaje Francia:" + francia.getPuntajeEtapaGrupos());

        grupoC.addEquipoQueAvanza(argentina);
        grupoD.addEquipoQueAvanza(francia);
        grupoF.addEquipoQueAvanza(croacia);
        grupoF.addEquipoQueAvanza(marruecos);

        System.out.println("Equipos que avanza a la SemiFinal:");
        System.out.println(grupoC.getEquipoQueAvanza().get(0).getNombre());
        System.out.println(grupoD.getEquipoQueAvanza().get(0).getNombre());
        System.out.println(grupoF.getEquipoQueAvanza().get(0).getNombre());
        System.out.println(grupoF.getEquipoQueAvanza().get(1).getNombre());

        //SEMIFINAL
        Partido p13= new Partido(new Date(2022,12,13), argentina,croacia);
        Partido p14= new Partido(new Date(2022,12,14), francia,marruecos);

        System.out.println("Partidos del torneo.SemiFinal");
        System.out.println("torneo.Partido:" + p13);
        System.out.println("torneo.Partido:" + p14);

        Resultado rp13= new Resultado(3,0);
        Resultado rp14= new Resultado(2,0);

        System.out.println("Resultados del torneo.SemiFinal");
        System.out.println(rp13);
        System.out.println(rp14);

        p13.setResultado(rp13);
        p14.setResultado(rp14);

        grupoC.addPartido(p13);
        grupoD.addPartido(p14);
        grupoF.addPartido(p13);
        grupoF.addPartido(p14);

        System.out.println("Puntaje Argentina:" + argentina.getPuntajeEtapaGrupos());
        System.out.println("Puntaje Croacia:" + croacia.getPuntajeEtapaGrupos());
        System.out.println("Puntaje Francia:" + francia.getPuntajeEtapaGrupos());
        System.out.println("Puntaje Marruecos:" + marruecos.getPuntajeEtapaGrupos());

        grupoC.addEquipoQueAvanza(argentina);
        grupoD.addEquipoQueAvanza(francia);

        System.out.println("Equipos que avanza a la Final:");
        System.out.println(grupoC.getEquipoQueAvanza().get(0).getNombre());
        System.out.println(grupoD.getEquipoQueAvanza().get(0).getNombre());

        //FINAL
        Partido p15= new Partido(new Date(2022,12,18), argentina,francia);

        System.out.println("Partidos del torneo.Final");
        System.out.println("torneo.Partido:" + p15);

        Resultado rp15= new Resultado(4,2);

        System.out.println("Resultados del torneo.Final");
        System.out.println(rp15);

        p15.setResultado(rp15);

        grupoC.addPartido(p13);
        grupoF.addPartido(p13);

        System.out.println("Puntaje Argentina:" + argentina.getPuntajeEtapaGrupos());
        System.out.println("Puntaje Francia:" + francia.getPuntajeEtapaGrupos());

        System.out.println("Equipo ganador del Mundial: " + " Argentina");

        Llave octavos= new Llave("Octavos de Final");
        Llave cuartos= new Llave("Cuartos de Final");
        Llave semi= new Llave("Semifinal");



        //GARAGE

        System.out.println("Garaje:");

        Garage garage1= new Garage(8, 12, "Sarmiento 125", 100, 200,100);
        Vehiculo v1 = new Vehiculo("Moto", 9, 10,true, 85);
        Moto m1= new Moto("Honda", 25, "EDF 321");
        Contacto c1 = new Contacto("Juan Cruz", "Fernandez", 123456788);

        System.out.println("Hora de apertura:" + garage1.getHoraApertura());
        System.out.println("Hora de cierre: " + garage1.getHoraCierre());
        System.out.println("Direccion: " + garage1.getDireccion());
        System.out.println("Capacidad Maxima: " + garage1.getCapacidadMaxima());
        System.out.println("Cambio rueda de auto: $" + garage1.getPrecioCambioRuedaDeAuto());
        System.out.println("Cambio rueda de moto: $" + garage1.getPrecioCambioRuedaDeMoto());

        System.out.println("Nombre: " + c1.getNombre());
        System.out.println("Apellido: " + c1.getApellido());
        System.out.println("Numero de Celular: " + c1.getNumeroCelular());

        System.out.println("Vehiculo ingresado: " + v1.getTipoDeVehiculo());
        System.out.println("Hora que ingreso: " + v1.getHoraIngreso());
        System.out.println("Hora que se retiró: " + v1.getHoraRetirada());
        System.out.println("Cambio de ruedas: " + v1.isCambiarRueda());
        System.out.println("Kilometrajes: " + v1.getKilometraje());

        System.out.println("Marca de la moto: " + m1.getMarca());
        System.out.println("Cilindrada:" + m1.getCilindrada());
        System.out.println("Patente: " + m1.getPatente());

        Garage garage2= new Garage(10,20,"Mitre 123", 200, 500, 800);
        Vehiculo v2= new Vehiculo("Auto", 11, 13, false, 56);
        Auto a1= new Auto("Peugeot", 4, "KGF 365");
        Contacto c2= new Contacto("Alejo", "Molina", 1245784966);

        System.out.println("Hora de apertura:" + garage2.getHoraApertura());
        System.out.println("Hora de cierre: " + garage2.getHoraCierre());
        System.out.println("Direccion: " + garage2.getDireccion());
        System.out.println("Capacidad Maxima: " + garage2.getCapacidadMaxima());
        System.out.println("Cambio rueda de auto: $" + garage2.getPrecioCambioRuedaDeAuto());
        System.out.println("Cambio rueda de moto: $" + garage2.getPrecioCambioRuedaDeMoto());

        System.out.println("Nombre: " + c2.getNombre());
        System.out.println("Apellido: " + c2.getApellido());
        System.out.println("Numero de Celular: " + c2.getNumeroCelular());

        System.out.println("Vehiculo ingresado: " + v2.getTipoDeVehiculo());
        System.out.println("Hora que ingreso: " + v2.getHoraIngreso());
        System.out.println("Hora que se retiró: " + v2.getHoraRetirada());
        System.out.println("Cambio de ruedas: " + v2.isCambiarRueda());
        System.out.println("Kilometrajes: " + v2.getKilometraje());

        System.out.println("Marca del auto: " + a1.getMarca());
        System.out.println("Cantidad de puertas:" + a1.getNumeroDePuertas());
        System.out.println("Patente: " + a1.getPatente());










    }
}








