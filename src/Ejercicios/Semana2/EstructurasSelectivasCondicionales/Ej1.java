package Ejercicios.Semana2.EstructurasSelectivasCondicionales;

import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresar un numero");
        double num = sc.nextDouble();
        if(num == 0)
            System.out.println(num + ", es igual a 0");
        else{
            if(num > 0)
                System.out.println(num + ", es mayor a 0");
            else
                System.out.println(num + ", es menor a 0");
        }
        sc.close();
    }
}
