package Ejercicios.Semana3.POO;

public class Main {
    public static void main(String[] args) {
        Semaforo s = new Semaforo(true,false,false);
        s.prenderLuzAmarilla();
        s.apagarLuzRoja();
        s.prenderLuzVerde();
        s.verEstado();

        Molinete m = new Molinete();
        m.cambiarEstado();
        m.cambiarEstado();
        for (int i = 1; i <= 40; i++) {
            m.aumentarCantidad();
        }
        System.out.println("Cantidad Total: " + m.verCantidadTotal());
    }
}
