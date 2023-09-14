package Ejercicios.Semana2.EstructurasSelectivasCondicionales;

import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese numero");
        int numero = sc.nextInt();
        if(numero % 2 == 0)
            System.out.println("El numero (" + numero + ") es par");
        else
            System.out.println("El numero (" + numero + ") no es par");
        sc.close();
    }
}
