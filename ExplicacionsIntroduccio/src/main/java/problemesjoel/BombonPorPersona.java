package problemesjoel;

import java.util.Scanner;

public class BombonPorPersona {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int al=ent.nextInt();
        int bo=ent.nextInt();

        if(al==bo && al>0) System.out.println("OK");
        else if(al<bo && al>0) System.out.printf("OK: %d%n", bo-al);
        else if(al>bo) System.out.printf("KO: %d%n", al-bo);
        else System.out.println("KO: 0");
    }
}
