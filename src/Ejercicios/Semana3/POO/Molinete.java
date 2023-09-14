package Ejercicios.Semana3.POO;

public class Molinete {
    private boolean habilitado;
    private int cantidadPersonas;

    public Molinete(){
        this.habilitado = false;
        this.cantidadPersonas = 0;
    }

    public boolean estaHabilitado(){
        return this.habilitado;
    }
    public void cambiarEstado(){
        this.habilitado = !this.habilitado;
    }
    public void aumentarCantidad(){
        if(this.habilitado)
            this.cantidadPersonas++;
    }
    public int verCantidadTotal(){
        return this.cantidadPersonas;
    }

}
