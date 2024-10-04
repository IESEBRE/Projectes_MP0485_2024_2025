package problemesjoel;

import java.util.Scanner;

public class DiesCorrectesII {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int dia, any;

        //System.out.println("Introduix un dia de l'any");
        dia = ent.nextInt();

        //System.out.println("Introduix un any");
        any = ent.nextInt();


        if (dia >= 1 && dia <= 365) System.out.println("Correcte i any qualsevol!");
        else if (dia == 366 && (any % 4 == 0 && any % 100 != 0 || any % 400 == 0))
            System.out.println("Correcte i any bixest!");
        else if (dia == 366 && !(any % 4 == 0 && any % 100 != 0 || any % 400 == 0))
            System.out.println("Incorrecte per any no bixest!");
        //Entrarem si dia < 1 || dia > 366
        else System.out.println("Incorrecte per qualsevol any!");
    }
}
