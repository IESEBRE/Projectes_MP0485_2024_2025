package problemesjoel;

import java.util.Scanner;

public class AmanecerDelUltimoDia {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int segons= ent.nextInt();

        System.out.format("%s del dia %d",
           segons%86400 < 43200     ?"mati":"nit",
                (segons/86400)+1
        );
    }
}
