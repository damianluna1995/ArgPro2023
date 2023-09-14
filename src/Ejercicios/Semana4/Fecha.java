package Ejercicios.Semana4;

public class Fecha {
    private int anio;
    private int mes;
    private int dia;

    public Fecha(int dia, int mes, int anio){
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public Fecha(){
        this(1,1,2000);
    }

    public String mostrar(){
        return this.dia + "/" + this.mes + "/" + this.anio;
    }

    public void cambiarDia(){
        switch (dia){
            case 28:{ //Febrero
                switch (mes){
                    case 2: { this.dia = 1; this.mes++; } break;
                }
            }break;
            case 30:{ //Abril, Junio, Septiembre, Noviembre
                switch (mes) {
                    case 4, 6, 9, 11: { this.dia = 1; this.mes++; } break;
                }
            }break;
            case 31:{ //Enero, Marzo, Mayo, Julio, Agosto, Octubre, Diciembre
                switch (mes){
                    case 1, 3, 5, 7, 8, 10: { this.dia = 1; this.mes++; }break;
                    case 12: { this.dia = 1; this.mes = 1; this.anio++; } break;
                }
            }break;
            default: { this.dia++; } break;
        }
    }

}
