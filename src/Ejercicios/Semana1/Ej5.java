package Ejercicios.Semana1;
import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double pi = Math.PI;
        System.out.println("Ingrese radio, para calcular superficie y volumen de una esfera");
        int radio = sc.nextInt();
        double superficie = 4 * pi * Math.pow(radio,2);
        double volumen = (4/3) * pi * Math.pow(radio,3);
        System.out.println("Superficie: " + superficie);
        System.out.println("Volumen: " + volumen);
        sc.close();
    }
}
