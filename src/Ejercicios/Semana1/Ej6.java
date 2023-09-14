package Ejercicios.Semana1;
import java.util.Scanner;

public class Ej6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribir un numero");
        int a = sc.nextInt();
        System.out.println("Escribir otro numero");
        int b = sc.nextInt();
        System.out.println("Valores antes del intercambio: A = " + a + ", B = " + b);
        //Se utilizo una variable auxiliar para almacenar temporalmente el valor de a y luego realizar el intercambio.
        int aux;
        aux = a;
        a = b;
        b = aux;
        System.out.println("Valores despues del intercambio: A = " + a + ", B = " + b);
        sc.close();
    }
}
