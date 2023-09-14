package ActividadesPorClase.Interfaces;

import java.util.ArrayList;
import java.util.List;

public class AlimentoNutritivo implements Imprimible {
    private String nombre;
    private double cantidadCalorias;
    private List<String> vitaminas;

    public AlimentoNutritivo(String nombre, double cantidadCalorias){
        this.nombre = nombre;
        this.cantidadCalorias = cantidadCalorias;
        this.vitaminas = new ArrayList<>();
    }

    public String getNombre(){
        return this.nombre;
    }

    public double getCantidadCalorias(){
        return this.cantidadCalorias;
    }

    public List<String> getVitaminas(){
        return this.vitaminas;
    }

    public void setVitaminas(String vitamina){
        this.vitaminas.add(vitamina);
    }

    @Override
    public void mostrar() {
        System.out.println(this.nombre + " " + this.cantidadCalorias);
        System.out.println("Vitaminas");
        for (String vitamina: this.vitaminas) {
            System.out.print(vitamina + " ");
        }
    }

}
