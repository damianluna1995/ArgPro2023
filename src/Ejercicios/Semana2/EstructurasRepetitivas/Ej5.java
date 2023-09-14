package Ejercicios.Semana2.EstructurasRepetitivas;

import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0;
        int min = 1000000;
        int posMax = 1;
        int posMin = 1;
        int pos = 1;
        System.out.println("Ingresar numero ? (true/false)");
        boolean opcion = sc.nextBoolean();
        while(opcion){
            System.out.println("Ingresar numero");
            int valor = sc.nextInt();
            if (valor > max) {
                max = valor;
                posMax = pos;
            } else if (valor == max)
                posMax = pos;
            if (valor < min) {
                min = valor;
                posMin = pos;
            } else if (valor == min)
                posMin = pos;
            pos++;
            System.out.println("Ingresar numero ? (true/false)");
            opcion = sc.nextBoolean();
        }
        System.out.println("El valor Maximo es: " + max + ", y su posicion: " + posMax);
        System.out.println("El valor Minimo es: " + min + ", y su posicion: " + posMin);
        sc.close();
    }
}
