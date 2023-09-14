package Ejercicios.Semana3.Vectores;

import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresar el tamaño para el vector");
        int tamanio = sc.nextInt();
        int[] vector = new int[tamanio];
        int suma = 0;
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Ingresar valor");
            int valor = sc.nextInt();
            vector[i] = valor;
        }
        for (int i = 0; i < vector.length; i++) {
            suma += vector[i];
            System.out.print("Valor: " + vector[i] + "\n");
        }
        System.out.println("Resultado de la suma: " + suma);
        sc.close();
    }
}
