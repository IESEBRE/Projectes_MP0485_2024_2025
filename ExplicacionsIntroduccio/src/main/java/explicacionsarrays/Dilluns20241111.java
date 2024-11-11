package explicacionsarrays;

public class Dilluns20241111 {

    public static void main(String[] args) {

        //Declaració + instanciació d'un array unidimensional
        int[] diesMesosAny={31,28,31,30,31,30,31,31,30,31,30,31};   //sense new només la moment de declarar
        int[] copia=diesMesosAny;

        copia[1]=29;
        System.out.println(diesMesosAny[1]);        //vorem un 29

        //diesMesosAny={31,28,31,30,31,30,31,31,30,31,30,31}; --> no es pot fer
        diesMesosAny=new int[]{31,31,30,31};    //en new ho podem fer en qualsevol moment
        System.out.println(diesMesosAny[1]);        //vorem un 31


        //Declaració + instanciació d'un array bidimensional
        int[][] diesMesosAnyBi={{31},{28,31,30,31,30,31,31,30,31,30,31}};   //sense new només la moment de declarar
        //diesMesosAnyBi={{31},{28,31,30,31,30,31,31,30,31,30,31}};
        diesMesosAnyBi=new int[][]{{31},{30,31,30,31}};

        //Arrays multidimensionals
        int[][][][][][] cosa=new int[5][][][][][];
        //int[][][][][][] cosa=new int[5][][][3][][]; __> no podem tindre dimensions buides per mig de plenes
        int[][][][][][] cosa2=new int[5][3][4][][][];
        cosa[0]=new int[3][][][][];

    }
}
