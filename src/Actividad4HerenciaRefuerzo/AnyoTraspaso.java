package Actividad4HerenciaRefuerzo;


class AnyoTraspaso extends Data {
    boolean parell() {
        if (getAnyo() % 2 == 0) {
            return true;
        }
        return false;
    }
}