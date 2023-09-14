package ActividadesPorClase.Interfaces;

public class Main {
    public static void main(String[] args) {
        AlimentoNutritivo an = new AlimentoNutritivo("Arroz", 500);
        an.setVitaminas("d");
        an.setVitaminas("e");
        an.mostrar();
    }
}
