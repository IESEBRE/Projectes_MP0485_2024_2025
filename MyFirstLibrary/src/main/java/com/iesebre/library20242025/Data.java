package com.iesebre.library20242025;

public class Data {

    /**
     * Diu si l'any que rep com a paràmetre és o no bixest (any de traspàs)
     * @param any el que volem avaluar
     * @return true si any és bixest i false en cas contrari
     */
    public static boolean esBixest(int any){
        return any>=1582 && (any%4==0 && any%100!=0 || any%400==0);
    }

    /**
     * Indica si la data rebuda és o no correcta
     * @param dia un número que representa el dia de la data
     * @param mes un número que representa el mes de la data
     * @param any un número que representa l'any de la data
     * @return true si la data és correcta i false en cas contrari
     */
    public static boolean dataCorrecta(int dia, int mes, int any){
        //Vector que conté la durada dels 12 mesos d'un any
        int[] mesos={31,28,31,30,31,30,31,31,30,31,30,31};

        //Mirem si l'any és bixest per modificar la durada del febrer
        if(esBixest(any)) mesos[1]=29;

        //Mirem si el més correcte
        if(mes<1 || mes>12) return false;

        //Mirem si el dia és correcte
        return dia>=1 && dia<=mesos[mes-1];
    }

    /**
     * Obtenim la data de demà
     * @param dia un número que representa el dia de la data
     * @param mes un número que representa el mes de la data
     * @param any un número que representa l'any de la data
     * @return Un vector d'enters contenint el dia, mes i any de demà si la data rebuda és correcta, sinó retornem null
     */
    public static int[] diaSeguent(int dia, int mes, int any){
        if(!dataCorrecta(dia,mes,any)) return null; //Si la data rebuda és incorrecta no cal fer res

        if(dataCorrecta(dia+1,mes,any)) return new int[]{dia+1, mes ,any};
        if(dataCorrecta(1,mes+1,any)) return new int[]{1, mes+1 ,any};
        return new int[]{1,1,any+1};
    }




}
