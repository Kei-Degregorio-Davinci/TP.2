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

        Partido p1= new Partido(new Date(22/11/2022), argentina, arabiasaudita);
        Partido p2= new Partido(new Date(22/11/2022), mexico, polonia);
        Partido p3= new Partido(new Date(26/11/2022), polonia, arabiasaudita);
        Partido p4= new Partido(new Date(26/11/2022), argentina, mexico);
        Partido p5= new Partido(new Date(30/11/2022), polonia, argentina);
        Partido p6= new Partido(new Date(30/11/2022), arabiasaudita,mexico);

        Resultado rp1= new Resultado(1,2);
        Resultado rp2= new Resultado(0,0);
        Resultado rp3= new Resultado(2,0);
        Resultado rp4= new Resultado(2,0);
        Resultado rp5= new Resultado(0,2);
        Resultado rp6= new Resultado(1,0);

        Grupo grupoA= new Grupo();
        Grupo grupoB= new Grupo();
        Grupo grupoC= new Grupo();
        Grupo grupoD= new Grupo();
        Grupo grupoE= new Grupo();
        Grupo grupoF= new Grupo();
        Grupo grupoG= new Grupo();
        Grupo grupoH= new Grupo();

        grupoC.addPartido(p1);
        grupoC.addPartido(p2);
        grupoC.addPartido(p3);
        grupoC.addPartido(p4);
        grupoC.addPartido(p5);
        grupoC.addPartido(p6);

        grupoC.addEquipoQueAvanza(argentina);

        Llave octavos= new Llave("Octavos de Final");
        Llave cuartos= new Llave("Cuartos de Final");
        Llave semi= new Llave("Semifinal");
        Llave finalDelTorneo= new Llave("Final del torneo");
    }

}
