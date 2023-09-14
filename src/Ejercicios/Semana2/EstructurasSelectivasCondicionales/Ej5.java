package Ejercicios.Semana2.EstructurasSelectivasCondicionales;

import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresar un numero");
        int num1 = sc.nextInt();
        System.out.println("Ingresar otro numero");
        int num2 = sc.nextInt();
        System.out.println("Elegir opcion del 1 al 4 \n" +
                "1) Suma \n" +
                "2) Resta \n" +
                "3) Multiplicacion \n" +
                "4) Division");
        int opcion = sc.nextInt();
        if(opcion == 1)
            System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        else if (opcion == 2)
            System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        else if (opcion == 3)
            System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
        else if (opcion == 4)
            System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
        else
            System.out.println("Opcion Incorrecta");
        sc.close();
    }
}
