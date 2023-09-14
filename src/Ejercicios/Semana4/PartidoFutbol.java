package Ejercicios.Semana4;

public class PartidoFutbol {
    private final String equipoLocal;
    private final String equipoVisitante;
    private int golesLocal;
    private int golesVisitante;
    public enum Estado { EMPEZADO, FINALIZADO }
    private Estado estado;
    private Fecha fecha;

    public PartidoFutbol(String equipoLocal, String equipoVisitante, Fecha fecha, Estado estado){
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
        this.fecha = fecha;
        this.estado = estado;
    }
    public void resultadoPartido(){
        if(estado == Estado.EMPEZADO || estado == Estado.FINALIZADO){
            System.out.println(this.equipoLocal + " VS " + this.equipoVisitante);
            System.out.println("Estado: " + estado);
            System.out.println("Resultado: " + golesLocal + " - " + golesVisitante);
            System.out.println("Fecha: " + this.obtenerFecha().mostrar());
        }
    }

    public Fecha obtenerFecha(){
        return this.fecha;
    }

    public void anotarGolLocal(){
        if (this.estado == Estado.EMPEZADO) {
            golesLocal++;
        }
    }

    public void anotarGolVisitante(){
        if (this.estado == Estado.EMPEZADO) {
            golesVisitante++;
        }
    }

}
