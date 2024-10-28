package problemesjoel;

import java.util.Scanner;

public class OperadoresRelacion {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        long al=ent.nextLong();
        long bo=ent.nextLong();

        if(al==bo) System.out.println("=");
        else if(al<bo) System.out.println("<");
        else System.out.println(">");
    }
}
