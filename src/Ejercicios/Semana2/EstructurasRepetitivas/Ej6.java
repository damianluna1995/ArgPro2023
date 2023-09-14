package Ejercicios.Semana2.EstructurasRepetitivas;

import java.util.Scanner;

public class Ej6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresar numero");
        int a = sc.nextInt();
        System.out.println("Ingresar otro numero");
        int b = sc.nextInt();
        int c = 0;
        for (int i = 1; i <= b; i++) {
            c += a;
        }
        System.out.println("Resultado: " + c);
        sc.close();
    }
}
