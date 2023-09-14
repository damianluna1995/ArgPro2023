package Ejercicios.Semana4;

public class Main {
    public static void main(String[] args) {
        Fecha f = new Fecha(30,4,2000);
        f.cambiarDia();
        Fecha f2 = new Fecha();
        System.out.println(f.mostrar());
        f2.cambiarDia();
        System.out.println(f2.mostrar());

        PartidoFutbol p1 = new PartidoFutbol("Chicago","Chacarita",new Fecha(), PartidoFutbol.Estado.EMPEZADO);
        p1.anotarGolLocal();
        p1.anotarGolVisitante();
        p1.anotarGolVisitante();
        p1.anotarGolLocal();
        p1.resultadoPartido();
    }
}
