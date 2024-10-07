package problemesjoel;

import java.util.Scanner;

public class ParellesTriosComodi {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        //Declarem les variables i els assignem l'entrada
        int a = ent.nextInt(), b = ent.nextInt(), c = ent.nextInt();

        //Tractament de casos
        if (a == b && b == c) System.out.println("TRIO"); //i
        else if (a == 0 || b == 0 || c == 0) { //Hi ha algun comodí
            if (a == b || b == c || a == c) System.out.println("TRIO");
            else System.out.println("PARELLA");//o
        } else if (a == b || b == c || a == c) System.out.println("PARELLA");//o
        else System.out.println("RES");
    }
}
