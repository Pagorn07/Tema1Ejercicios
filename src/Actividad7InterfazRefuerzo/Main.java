package Actividad7InterfazRefuerzo;


public class Main {
    public static void main (String[] args){
        Student student = new Student();


        Interfaz i1 = new Miquel();
        Interfaz i2 = new Pep();

        i1.addStudent(student);
        i2.addStudent(student);
    }
}