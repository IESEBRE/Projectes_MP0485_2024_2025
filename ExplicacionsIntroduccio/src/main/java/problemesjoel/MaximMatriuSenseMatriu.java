package problemesjoel;

import java.util.Scanner;

public class MaximMatriuSenseMatriu {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int numCasos = ent.nextInt();

        while (numCasos-- > 0) {
            //Tractament de cada cas
            int files=ent.nextInt();
            int columnes=ent.nextInt();
            int maxim=0,      //guardem el valor màxim trobat
                    fMax=1,   //fila del valor màxim trobat
                    cMax=1;   //columna del valor màxim trobat

            for (int i = 0; i < files; i++) {
                for (int j = 0; j < columnes; j++) {
                    int valor=ent.nextInt();
                    if(i==0 && j==0) {    //tractem la primera casella de la matriu -> actualitzem el màxim
                        maxim=valor;
                        //la fila i columna màximes serà l'actual incrementada en 1
                    }else{
                        //Mirem si la casella actual conté el màxim --> actualitzem el màxim
                        if(valor>maxim){
                            maxim=valor;
                            fMax=i+1;
                            cMax=j+1;    //la fila i columna màximes serà l'actual incrementada en 1
                        }
                    }
                }
            }

            System.out.format("%d %d%n", fMax,cMax);
        }
    }
}