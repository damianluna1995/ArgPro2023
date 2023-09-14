package Ejercicios.Semana2.EstructurasRepetitivas;

import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresar numero");
        int numero = sc.nextInt();
        for (int i = numero; i <= numero + 20; i++) {
            System.out.print(i + " ");
        }
        sc.close();
    }
}
