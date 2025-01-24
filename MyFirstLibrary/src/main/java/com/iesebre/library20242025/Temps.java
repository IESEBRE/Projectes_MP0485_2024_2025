package com.iesebre.library20242025;

import static com.iesebre.library20242025.Data.esBixest;

public class Temps {

    //Propietats
    private int dia = 1;
    private int mes = 1;
    private int any;
    private int hora;
    private int minut;
    private int segon;
    //Indiquem si volem treballar en data i hora (true), o només en data (false)
    private boolean dataHora = true;

    //Mètodes constructors
    public Temps() {
    }

    //Per poder establir si volem data i hora o només data al moment de crear un objecte
    public Temps(boolean dataHora) {
        this.dataHora = dataHora;
    }

    public Temps(int dia, int mes, int any, boolean dataHora) {
        this(dia, mes, any);
        this.dataHora = dataHora;
    }

    public Temps(int dia, int mes, int any) {
        dataHora = false;
        if(Data.dataCorrecta(dia,mes,any)) {
            this.setDia(dia);
            this.setMes(mes);
            this.any = any;
        }
    }

    public Temps(int dia, int mes, int any, int hora, int minut, int segon) {
        this(dia, mes, any);
        dataHora = true;
        this.setHora(hora);
        this.setMinut(minut);
        this.setSegon(segon);
    }

    //Getters i setters
    public int getDia() {
        return dia;
    }

    public boolean setDia(int dia) {
        if (dia >= 1 && dia <= 31) {
            this.dia = dia;
            return true;
        }
        return false;
    }

    public int getMes() {
        return mes;
    }

    public boolean setMes(int mes) {
        if (mes >= 1 && mes <= 12) {
            this.mes = mes;
            return true;
        }
        return false;
    }

    public int getAny() {
        return any;
    }

    public void setAny(int any) {
        this.any = any;
    }

    public int getHora() {
        return hora;
    }

    public boolean setHora(int hora) {
        if (hora >= 0 && hora <= 23) {
            this.hora = hora;
            return true;
        }
        return false;
    }

    public int getMinut() {
        return minut;
    }

    public boolean setMinut(int minut) {
        if (minut >= 0 && minut <= 59) {
            this.minut = minut;
            return true;
        }
        return false;
    }

    public int getSegon() {
        return segon;
    }

    public boolean setSegon(int segon) {
        if (segon >= 0 && segon <= 59) {
            this.segon = segon;
            return true;
        }
        return false;
    }

    public boolean isDataHora() {
        return dataHora;
    }

    //El fem private per no poder canviar la propietat una vegada hem creat l'objecte
    private void setDataHora(boolean dataHora) {
        this.dataHora = dataHora;
    }

    //Mètodes normals
    public String mostrar() {
        if (dataHora)
            return String.format("%02d/%02d/%04d %02d-%02d-%02d", dia, mes, any, hora, minut, segon);
        else
            return String.format("%02d/%02d/%04d", dia, mes, any);
    }

    public String mostrar(boolean mostrarHora) {
        if (mostrarHora) return String.format("%02d-%02d-%02d", hora, minut, segon);
        return "";
    }

    public boolean modificar(int dia, int mes, int any){
        this.setAny(any);
        return this.setDia(dia) && this.setMes(mes);
    }

    public boolean modificar(int dia, int mes, int any, int hora, int minut, int segon){
        boolean resultat=this.modificar(dia, mes, any); //Canviem la data
        if(!this.dataHora) return resultat;             //Si l'objecte només té data acabem
        return resultat && this.setHora(hora) && this.setMinut(minut) && this.setSegon(segon);
    }

    /**
     * Indica si la data de l'objecte és o no correcta
     * @return true si la data és correcta i false en cas contrari
     */
    public boolean dataCorrecta(){
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
     * @return Un nou objecte contenint el dia, mes i any de demà si la data rebuda és correcta, sinó retornem null
     */
    public Temps diaSeguent(){
        if(!dataCorrecta()) return null; //Si la data rebuda és incorrecta no cal fer res

        //Copiem el dia, mes i any de l'objecte a un nou objecte, i així no modificarem el valor de les propietats del this
        Temps dema=new Temps(dia, mes, any);

        //Incremento un dia a la data actual
        dema.dia++;
        if(dema.dataCorrecta()){
            return dema;
        }

        //Provem si s'arregla passant al primer dia del mes següent
        dema.dia=1;
        dema.mes++;
        if(dema.dataCorrecta()) return dema;

        //Estem a l'ultim dia de l'any, per tany de mà serà 1 de gener de l'any que ve
        dema.mes=1;
        dema.any++;
        return dema;
    }

    /**
     * Diu si les dates que rep són diferents o iguals
     * @param data2 un objecte que conté el dia, mes i any de la segona data
     * @return 1 si la data de l'objecte actual és major que la segona, 0 si són iguals, -1 si és menor, i -2 si alguna data és
     * incorrecta (incloent nuls)
     */
    public int comparaDates(Temps data2){
        //Primer tractem els casos on l'objecte o el paràmetre donen problemes
        if(!this.dataCorrecta() || data2==null || !data2.dataCorrecta()) return -2;

        return Data.comparaDates(this.dia, this.mes, this.any, data2.dia, data2.mes, data2.any);
    }

    /**
     * Diu quants dies hi ha entre 2 dates
     * @param data2 un objecte número que representa la segona data
     * @return El número de dies entre la data de l'objecte actual i la segona data si estes són correctes, i -1 si hi ha alguna data incorrecta
     */
    public int diferenciaDies(Temps data2) {
        //Tracto els casos problemàtics
        if(data2==null) return -1;

        //Retornem el número de dies entre ambdues dates
        return Data.diferenciaDies(this.dia, this.mes, this.any, data2.dia, data2.mes, data2.any);
    }

}

class Proves {

    public static void main(String[] args) {
        Temps avui = new Temps(24, 1, 2025);
        System.out.println(avui.mostrar());

        Temps t1 = new Temps(true);
        if(t1.modificar(12,12,1212, 0,100,0))
            System.out.println(t1.mostrar());
        else System.out.println("No s'ha pogut modificar la data.");


        Temps t2 = new Temps(1, 1, 2025, 0, 0, 1);
        System.out.println(t2.mostrar());
        System.out.println(t2.mostrar(true));

        Temps dema=avui.diaSeguent();
        System.out.println(dema.dataCorrecta()?"Data correcta!!":"Ho sento, la data és incorrecta");
        System.out.println(dema.mostrar());

        System.out.println(avui.comparaDates(dema)); //-1
        System.out.println(dema.comparaDates(avui)); //1
        System.out.println(dema.comparaDates(dema)); //0
        System.out.println(avui.comparaDates(null)); //-2

        System.out.println(avui.diferenciaDies(dema)); //1
        System.out.println(avui.diferenciaDies(avui)); //0
        System.out.println(dema.diferenciaDies(avui)); //1
        System.out.println(avui.diferenciaDies(null)); //-1

        int diesfaltenPerFinalitzarCurs=avui.diferenciaDies(new Temps(27,5,2025));
        for (int i = 0; i < diesfaltenPerFinalitzarCurs; i++) {
            avui=avui.diaSeguent();
        }

        System.out.format("D'aquí %d dies serà %s%n",diesfaltenPerFinalitzarCurs, avui.mostrar());
    }

}