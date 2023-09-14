package Ejercicios.Semana2.EstructurasRepetitivas;

import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresar numero");
        int numero = sc.nextInt();
        int resultado = 0;
        while (numero != 0){
            resultado += numero;
            System.out.println("Suma Parcial = " + resultado);
            System.out.println("Ingresar numero");
            numero = sc.nextInt();
        }
        System.out.println("Resultado Final = " + resultado);
        sc.close();
    }
}
