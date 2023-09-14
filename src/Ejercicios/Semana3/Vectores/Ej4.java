package Ejercicios.Semana3.Vectores;

import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        /*
        i -> provincias (orden alfabetico) {Bs. As, CABA, Catamarca, ... ,Tucuman}
        j -> meses {enero, febrero, marzo, abril, ... ,diciembre}
        */
        Scanner sc = new Scanner(System.in);

        int[][] matriz = {
            {4,5,2,6},
            {4,6,2,4},
            {3,7,6,5}
        };

        //int[][] matriz = new int[3][4];
        int[] provincias = new int[3];
        int[] meses = new int[4];
        int acumulador = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length - 1; j++) {
                //obtener la cantidad total de cada provincia
                acumulador += matriz[i][j];
                if (i == matriz.length - 1) {
                    provincias[i] = acumulador;
                    acumulador = 0;
                }
            }
        }

        for (int i = 0; i < provincias.length; i++) {
            System.out.println(provincias[i]);
        }
        System.out.println("Cantidad del Mes con mas lluvia:");
    }
}
