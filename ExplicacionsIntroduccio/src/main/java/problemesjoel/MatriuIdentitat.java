package problemesjoel;

import java.util.Scanner;

public class MatriuIdentitat {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        //Llegim la grandària de la matriu
        int grand=ent.nextInt();

        //Simulem que mostrem el contingut d'una hipotètica matriu
        for (int i = 0; i <grand ; i++) {
            for (int j = 0; j < grand; j++) {
                //Mirem si la casella forma part de la diagonal principal --> i==j
                //if(i==j || (i+j==grand-1) || i==0 || i==grand-1 || j==0 || j==grand-1 ) System.out.print("1 ");
                if( i==j ) System.out.print("1 ");
                else  System.out.print("0 ");
            }
            System.out.println();
        }
    }
}
