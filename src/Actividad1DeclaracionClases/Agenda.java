package Actividad1DeclaracionClases;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Agenda {


    private int anyo;
    private List<Pagina> paginas = new ArrayList<>();
    private int paginaActual = 0;

    public Agenda (){
        Scanner s = new Scanner(System.in);
        System.out.println("¿De que anyo es la agenda?");
        anyo = s.nextInt();
        boolean festivo = false;
        for (int i = 1; i < 10 ; i++) {
            if(i % 7 == 0){
                festivo=true;
            }

            Pagina p = new Pagina(i,9,false);
            paginas.add(p);
            festivo=false;
        }
        paginas.get(paginaActual);

    }
    void passaPagina( int pagina) {
        if(paginas.size() > paginaActual);
        paginaActual++;
    }

    void tornaPagina (int pagina){
        if(paginaActual >0){
            paginaActual--;
        }
    }

    public int getAnyo() {
        return anyo;
    }

    public void setAnyo(int anyo) {
        this.anyo = anyo;
    }

    public List<Pagina> getPaginas() {
        return paginas;
    }

    public void setPaginas(List<Pagina> paginas) {
        this.paginas = paginas;
    }
}