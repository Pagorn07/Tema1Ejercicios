package Actividad6Interfaz;

public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();
        Docente docente = new Docente();
        pagaAlTrabajador(docente);
        Primaria primaria = new Primaria();
        pagaAlTrabajador(primaria);
    }

    public static void pagaAlTrabajador(Trabajador trabajador) {
        String ccc = trabajador.getCcc();
    }
}
