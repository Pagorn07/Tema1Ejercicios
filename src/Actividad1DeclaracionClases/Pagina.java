package Actividad1DeclaracionClases;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Pagina {
    private int dia;
    private int mes;
    private boolean festivo;
    private List<Cita> cita = new ArrayList<>();

    public Pagina(int d, int m, boolean fes){
        dia = d;
        mes = m;
        festivo = fes;
    }
    void escriureCita(String escriure){
        String horaI, horaF;


        Scanner s = new Scanner (System.in);
        System.out.println("hora inici");
        horaI=s.nextLine();
        System.out.println("Hora final cita");
        horaF=s.nextLine();
        System.out.println("inici "+ horaI +" final"+ horaF );

        Cita c = new Cita(horaI,horaF);

        c.writeContents();
        cita.add(c);
    }

    void esborraCita(){


    }

    public String data(){
        Scanner s =new Scanner(System.in);
        int m,d;
        String hora;
        System.out.println("Selecciona un mes");
        m=s.nextInt();
        System.out.println("¿Que dia?");
        d=s.nextInt();
        System.out.println("¿Hora de la cita?");
        hora=s.nextLine();
        hora = m + d + hora;
        return hora;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public boolean isFestivo() {
        return festivo;
    }

    public void setFestivo(boolean festivo) {
        this.festivo = festivo;
    }
}