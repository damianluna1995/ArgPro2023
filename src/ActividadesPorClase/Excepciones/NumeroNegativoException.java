package ActividadesPorClase.Excepciones;

public class NumeroNegativoException extends Exception{
    private String mensaje;

    public String getMensaje(){
        return "Ingresaste un numero negativo";
    }
}
