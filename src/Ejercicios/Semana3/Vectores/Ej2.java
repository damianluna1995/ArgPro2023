package Ejercicios.Semana3.Vectores;

import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresar el tamaño para los vectores A y B");
        int tamanio = sc.nextInt();
        int[] vectorA = new int[tamanio];
        int[] vectorB = new int[tamanio];
        int[] vectorSuma =  new int[tamanio];

        System.out.println("Ingresar valor para el vector A");
        for (int i = 0; i < vectorA.length; i++) {
            int valor = sc.nextInt();
            vectorA[i] = valor;
        }

        System.out.println("Ingresar valor para el vector B");
        for (int i = 0; i < vectorB.length; i++) {
            int valor = sc.nextInt();
            vectorB[i] = valor;
        }

        for (int i = 0; i < vectorSuma.length; i++) {
            vectorSuma[i] = vectorA[i] + vectorB[i];
        }

        System.out.println("Valores de la suma de los vectores A y B: ");
        for (int i = 0; i < vectorSuma.length; i++) {
            System.out.print(vectorSuma[i] + ", ");
        }
        sc.close();
    }

}
