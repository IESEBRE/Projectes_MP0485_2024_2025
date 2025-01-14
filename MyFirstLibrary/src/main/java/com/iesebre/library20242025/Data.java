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

    /**
     * Diu si les dates que rep són diferents o iguals
     * @param data1 un vector que conté el dia, mes i any de la primera data
     * @param data2 un vector que conté el dia, mes i any de la segona data
     * @return 1 si la primera data és major que la segona, 0 si són iguals, -1 si és menor, i -2 si alguna data és
     * incorrecta (incloent vectors nuls o en un número de caselles diferent que 3)
     */
    public static int comparaDates(int[] data1, int[] data2){
        //Primer tractem els casos on els vectors paràmetre donen problemes
        if(data1==null || data2==null || data1.length!=3 || data2.length!=3) return -2;

        return comparaDates(data1[0],data1[1],data1[2],data2[0],data2[1],data2[2]);
    }

    /**
     * Diu si les dates que rep són diferents o iguals
     * @param dia1 un número que representa el dia de la primera data
     * @param mes1 un número que representa el mes de la primera data
     * @param any1 un número que representa l'any de la primera data
     * @param dia2 un número que representa el dia de la segona data
     * @param mes2 un número que representa el mes de la segona data
     * @param any2 un número que representa l'any de la segona data
     * @return 1 si la primera data és major que la segona, 0 si són iguals, -1 si és menor, i -2 si alguna data és incorrecta
     */
    public static int comparaDates(int dia1, int mes1, int any1, int dia2, int mes2, int any2) {
        //Primer comprovem si la dates són correctes
        if(!dataCorrecta(dia1, mes1, any1) || !dataCorrecta(dia2, mes2, any2)) return -2;

        //primer comparem els anys
        if(any1>any2) return 1;
        else if(any1<any2) return -1;

        //Aquí arribem si els anys són iguals, per tant ara comparem els mesos
        if(mes1>mes2) return 1;
        else if(mes1<mes2) return -1;

        //Aquí arribem si els mesos també són iguals, per tant ara comparem els dies
        if(dia1>dia2) return 1;
        else if(dia1<dia2) return -1;

        //Aquí arribem si les 2 dates eren idèntiques
        return 0;
    }

    /**
     * Diu quants dies hi ha entre 2 dates
     * @param dia1 un número que representa el dia de la primera data
     * @param mes1 un número que representa el mes de la primera data
     * @param any1 un número que representa l'any de la primera data
     * @param dia2 un número que representa el dia de la segona data
     * @param mes2 un número que representa el mes de la segona data
     * @param any2 un número que representa l'any de la segona data
     * @return El número de dies entre les dates si estes són correctes, i -1 si hi ha alguna data incorrecta
     */
    public static int diferenciaDies(int dia1, int mes1, int any1, int dia2, int mes2, int any2) {
        //Primer comprovem si la dates són correctes
        if(!dataCorrecta(dia1, mes1, any1) || !dataCorrecta(dia2, mes2, any2)) return -1;

        //Ara comprovem quina data és major i, si cal, fem que la primera sigue menor que la segona
        switch(comparaDates(dia1,mes1,any1,dia2,mes2,any2)){
            case 0:
                //En este cas les 2 dates eren la mateixa, per tant acabem retornant 0
                return 0;
            case 1:
                //En este cas la primera data és major que la segona, per tant les intercanviem
                int temp=dia1;
                dia1=dia2;
                dia2=temp;
                temp=mes1;
                mes1=mes2;
                mes2=temp;
                temp=any1;
                any1=any2;
                any2=temp;
        }

        //Si arribem aquí segur que la primera data és  menor que la segoan, per tant comptarem els dies que hi ha entre ambdues
        int compt=0;
        while(comparaDates(dia1,mes1,any1,dia2,mes2,any2)!=0){
            //Calculem data del dia següent de la data1, i l'actualitzem
            int[] dema=diaSeguent(dia1,mes1,any1);
            dia1=dema[0];
            mes1=dema[1];
            any1=dema[2];

            //Comptem que ha passat un dia
            compt++;
        }

        //Retornem el número de dies entre ambdues dates
        return compt;
    }

}
