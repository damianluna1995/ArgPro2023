package ActividadesPorClase.Excepciones;
import java.util.*;


public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        /*
        int[] valores = {3, 2, 4, 8, 4, 0, 6};
        System.out.println("Elija dos indices de la lista: ");
        try {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int division = valores[x - 1] / valores[y - 1];
            System.out.println("La division es " + division);
        }
        catch (ArithmeticException ae) {
            System.out.println("Error aritmetico");
        }
        catch (IndexOutOfBoundsException ioobe) {
            System.out.println("Error de indice fuera de rango");
        }
        catch (Exception e) {
            System.out.println("Algun otro error");
        }
        */

        /*
        try {
            int i = -5;
            if(i < 0)
                throw new NumeroNegativoException();
            else
                System.out.println(i);
        } catch (NumeroNegativoException nge) {
            System.out.println("¡Error! " + nge.getMensaje());
        }
        */

        int[] valores = {3, 2, -4, 8, 4, 0, 6};
        System.out.println("Elija un indice de la lista: ");
        try{
            int i = sc.nextInt();
            if(i < 0){
                throw new NumeroNegativoException();
            } else {
                int division = valores[i - 1] / valores[i];
                System.out.println("La division es " + division);
            }
        }
        catch (ArithmeticException ae) {
            System.out.println("Error aritmetico");
        }
        catch (IndexOutOfBoundsException ioobe) {
            System.out.println("Error de indice fuera de rango");
        }
        catch (NumeroNegativoException nne){
            System.out.println(nne.getMensaje());
        }
        catch (Exception e){
            System.out.println(e);
        }


    }

}
