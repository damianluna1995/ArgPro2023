package Ejercicios.Semana3.Vectores;

import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresar cantidad de examenes");
        int cantExam = sc.nextInt();
        int[] notas = new int[cantExam];
        String[] nombreAlumnos = new String[cantExam];
        int notaMax = 0;
        int cantAlumnosConNotaMax = 0;

        System.out.println("Ingresar notas");
        for (int i = 0; i < notas.length; i++) {
            int nota = sc.nextInt();
            notas[i] = nota;
        }

        System.out.println("Ingresar nombre de alumnos");
        for (int i = 0; i < nombreAlumnos.length; i++) {
            String nombre = sc.nextLine();
            nombreAlumnos[i] = nombre;
        }

        //Encontrar la nota mas alta
        for (int i = 0; i < notas.length; i++) {
            if (notaMax > notas[i]){
                notaMax = notas[i];
                cantAlumnosConNotaMax = 1;
            }
            else if(notaMax == notas[i]){
                cantAlumnosConNotaMax++;
            }
        }

        //Asociar la nota mas alta con el/los alumno/s
        String[] alumnosConNotaMax;
        for (int i = 0; i < notas.length; i++) {
            if(notaMax == notas[i]){
                alumnosConNotaMax = new String[]{nombreAlumnos[i]};
            }
        }


    }
}
