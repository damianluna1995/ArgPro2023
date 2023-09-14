package Ejercicios.Semana1;
import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese base del rectangulo");
        double base = sc.nextDouble();
        System.out.println("Ingrese altura del rectangulo");
        double altura = sc.nextDouble();
        double perimetro = (2 * base) + (2 * altura);
        double area = base * altura;
        System.out.println("Perimetro: " + perimetro + ", Area: " + area);
        sc.close();
    }
}
