package Ejercicios.Semana1;
import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribir nombre");
        String nombre = sc.nextLine();
        System.out.println("Hola " + nombre);
        sc.close();
    }
}
