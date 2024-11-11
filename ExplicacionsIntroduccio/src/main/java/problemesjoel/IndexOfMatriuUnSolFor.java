package problemesjoel;

import java.util.Scanner;

public class IndexOfMatriuUnSolFor {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        //Tractament de cada cas
        int files = ent.nextInt();
        int columnes = ent.nextInt();
        int[] matriu = new int[files * columnes];
        int buscat,      //guardem el valor buscat
                fTrobat = -1,   //fila del valor trobat
                cTrobat = -1;   //columna del valor trobat

        //Omplim la matriu
        for (int i = 0; i < files * columnes; i++) {
            matriu[i] = ent.nextInt();

        }
        //llegim el buscat
        buscat = ent.nextInt();
        for (int i = 0; i < files * columnes; i++) {
            //Mirem si la casella actual conté el màxim --> actualitzem el màxim
            if (matriu[i] == buscat) {
                fTrobat = (i / columnes);
                cTrobat = (i % columnes);    //la fila i columna màximes serà l'actual incrementada en 1
            }
        }

        System.out.format("%d %d%n", fTrobat, cTrobat);
    }
}
