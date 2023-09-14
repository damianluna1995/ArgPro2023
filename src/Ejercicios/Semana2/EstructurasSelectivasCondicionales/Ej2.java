package Ejercicios.Semana2.EstructurasSelectivasCondicionales;

import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresar 1er numero");
        double num1 = sc.nextDouble();
        System.out.println("Ingresar 2do numero");
        double num2 = sc.nextDouble();
        if (num1 != num2){
            if(num1 > num2)
                System.out.println("El mayor es: " + num1);
            else
                System.out.println("El mayor es: " + num2);
        }
        else
            System.out.println("Ambos numeros son iguales");
        sc.close();
    }
}
