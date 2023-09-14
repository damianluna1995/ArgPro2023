package Ejercicios.Semana2.EstructurasRepetitivas;

import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresar numero");
        int numero = sc.nextInt();
        int resultado = 1;
        for (int i = numero; i >= 1 ; i--) {
            resultado *= i;
        }
        System.out.println("Factorial de " + numero + " = " + resultado);
        sc.close();
    }
}
