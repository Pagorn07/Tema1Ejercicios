package Actividad2GarbageCollection;

public class GarbageCollector {
    @Override
    protected void finalize() throws Throwable{

        System.out.println("Limpio charly");

    }

    public static void main(String[] args) throws Throwable {
        GarbageCollector gc =  new GarbageCollector();
        gc = null;
        System.gc();
    }
}