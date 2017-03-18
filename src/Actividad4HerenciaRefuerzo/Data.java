package Actividad4HerenciaRefuerzo;


public class Data {

    //#1
    private static final String SEPARADOR = "-";
    // private String data;
    private int anyo;
    private int mes;
    private int dia;

    public String getData() {
        return dia + SEPARADOR + mes + SEPARADOR + anyo;
    }

    public void setData(String data) throws Exception {
        //#2
        if (!data.contains(SEPARADOR)) throw new Exception();

        int[] dates = descomposaData(data);

        this.anyo = dates[2];
        this.dia =dates[0];
        this.mes = dates[1];
    }

    public int getAnyo(){
        return this.anyo;
    }

    private int[] descomposaData(String data){

        String[] dataDescomposada = data.split(SEPARADOR);
        int[] dataDescomposadaInt = new int[dataDescomposada.length];
        dataDescomposadaInt[0] = Integer.parseInt(dataDescomposada[0]);
        dataDescomposadaInt[1] = Integer.parseInt(dataDescomposada[1]);
        dataDescomposadaInt[2] = Integer.parseInt(dataDescomposada[2]);

        return dataDescomposadaInt;

    }

}



