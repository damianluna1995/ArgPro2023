package Ejercicios.Semana2.EstructurasRepetitivas;

import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese cantidad de valores");
        int num = sc.nextInt();
        int mayor = 0;
        int menor = 1000000; //Establecer un valor muy grande, con el objetivo de que el valor ingresado por el usuario reemplace el valor de menor.
        int mayorVeces = 0;
        int menorVeces = 0;
        while(num > 0) {
            System.out.println("Ingrese valor");
            int valor = sc.nextInt();
            if (valor > mayor) {
                mayor = valor;
                mayorVeces = 1;
            } else if (valor == mayor)
                mayorVeces++;
            if (valor < menor) {
                menor = valor;
                menorVeces = 1;
            } else if (valor == menor)
                menorVeces++;
            num--;
        }
        System.out.println("El valor maximo es: " + mayor + " y aparece: " + mayorVeces + " veces");
        System.out.println("El valor minimo es: " + menor + " y aparece: " + menorVeces + " veces");
        sc.close();
    }
}
