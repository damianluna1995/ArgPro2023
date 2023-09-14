package Ejercicios.Semana3.POO;

public class Semaforo {
    private boolean luzRoja = false;
    private boolean luzAmarilla = false;
    private boolean luzVerde = false;

    public Semaforo(boolean luzRoja, boolean luzAmarilla, boolean luzVerde){
        this.luzRoja = luzRoja;
        this.luzAmarilla = luzAmarilla;
        this.luzVerde = luzVerde;
    }
    public void prenderLuzVerde(){
        if(!luzVerde) {
            this.luzVerde = true;
            System.out.println("Luz Verde encendida");
        }
    }
    public void prenderLuzAmarilla(){
        if(!luzAmarilla) {
            this.luzAmarilla = true;
            System.out.println("Luz Amarilla encendida");
        }
    }
    public void prenderLuzRoja(){
        if(!luzRoja) {
            this.luzRoja = true;
            System.out.println("Luz Roja encendida");
        }
    }
    public void apagarLuzVerde(){
        if(luzVerde) {
            this.luzVerde = false;
            System.out.println("Luz Verde apagada");
        }
    }
    public void apagarLuzAmarilla(){
        if(luzAmarilla) {
            this.luzAmarilla = false;
            System.out.println("Luz Amarilla apagada");
        }
    }
    public void apagarLuzRoja(){
        if(luzRoja) {
            this.luzRoja = false;
            System.out.println("Luz Roja apagada");
        }
    }
    public void verEstado(){
        System.out.println("Luces del semaforo: \n" +
                "Rojo: " + this.luzRoja + "\n" +
                "Amarillo: " + this.luzAmarilla + "\n" +
                "Verde: " + this.luzVerde);
    }

}