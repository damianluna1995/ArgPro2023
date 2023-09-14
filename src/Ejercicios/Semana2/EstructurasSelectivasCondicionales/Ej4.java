package Ejercicios.Semana2.EstructurasSelectivasCondicionales;

import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        /*
        En matemáticas se dice que un número es divisible entre otro siempre y cuando su división sea exacta,
        es decir, el resto sea cero. Así por ejemplo, 20 es divisible entre 4 porque
        nos da 5 de cociente y cero en el resto.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero entero");
        int m = sc.nextInt();
        System.out.println("Ingrese otro numero entero");
        int n = sc.nextInt();
        if(m % n == 0)
            System.out.println(m + ", es divisible por " + n);
        else
            System.out.println(m + ", NO es divisible por " + n);
        sc.close();
    }
}
