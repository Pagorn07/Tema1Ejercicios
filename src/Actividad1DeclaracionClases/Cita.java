package Actividad1DeclaracionClases;

import java.util.Scanner;

class Cita{
    private String motivo;
    private String horaInicio;
    private String horaFinal;

    public Cita(String horaI,String horaF){
        this.horaInicio = horaI;
        this.horaFinal = horaF;
    }

    public void writeContents (){

        Scanner s = new Scanner (System.in);
        motivo =s.nextLine();

        System.out.println(motivo);
    }

    void motivo(String motiu){

    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public String getHoraFinal() {
        return horaFinal;
    }

    public void setHoraFinal(String horaFinal) {
        this.horaFinal = horaFinal;
    }
}