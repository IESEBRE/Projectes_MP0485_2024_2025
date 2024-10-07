package problemesjoel;

import java.util.Scanner;

public class ButlletiNotes {

    public static void main(String[] args) {    //psvm
        Scanner ent = new Scanner(System.in);   //Necessari per poder llegir dades del teclat
        //System.out.println("Introduix un número enter del 0 al 10:");
        int n = ent.nextInt();

        //Ho farem en un switch per ser requisit del programa
        switch(n){
            case 0:            case 1:            case 2:            case 3:
            case 4:
                System.out.println("Suspes"); //sout
                break;
            case 5:            case 6:
                System.out.println("Aprovat"); //sout
                break;
            case 7:            case 8:
                System.out.println("Notable"); //sout
                break;
            case 9:            case 10:
                System.out.println("Excelent"); //sout
                break;
        }
    }






}
