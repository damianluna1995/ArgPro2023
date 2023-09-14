package Ejercicios.Semana1;
import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int n1 = sc.nextInt();
        System.out.println("Ingrese otro numero (No ingresar 0, para evitar la division por 0)");
        int n2 = sc.nextInt();
        System.out.println("Suma: " + (n1 + n2));
        System.out.println("Resta: " + (n1 - n2));
        System.out.println("Multiplicacion: " + (n1 * n2));
        System.out.println("Division entera: " + (n1 / n2));
        System.out.println("Division con decimales: " + (double)(n1 / n2));
        System.out.println("Resto de la division: " + (n1 % n2));
        sc.close();
    }
}
