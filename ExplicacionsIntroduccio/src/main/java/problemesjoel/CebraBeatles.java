package problemesjoel;

import java.util.Scanner;

public class CebraBeatles {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        
        //Llegim els 3 valors enters inicials
        int files=ent.nextInt();
        int columnes=ent.nextInt();
        int ini=ent.nextInt();
        char c;                 //variable per escriure els valors de les files

        //Assigno 1 o 0 a c depenent de si el valor ini és parell o imparell
        c = ini % 2 == 0 ? '1':'0';

        //Bucle de creació de cada fila
        for (int i = 0; i < files; i++) {
            //Bucle per dibuixar les columnes
            for (int j = 0; j < columnes; j++) {
                System.out.print(c);
                System.out.print(' ');
            }

            //Preparem c i sortida per la següent iteració
//            if(c=='1') c='0';
//            else c='1';
            c= c=='1' ? '0':'1';
            System.out.println();
        }
        
    }
}
