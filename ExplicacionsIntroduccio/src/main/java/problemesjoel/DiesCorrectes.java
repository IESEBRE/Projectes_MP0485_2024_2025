package problemesjoel;

import java.util.Scanner;

public class DiesCorrectes {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int dia;
        dia = ent.nextInt();

        if(dia>=1 && dia<=365) System.out.println("Correcte per un any no bixest!");
        else
            if(dia==366) System.out.println("Correcte per un any bixest!");
            else System.out.println("Incorrecte!");
    }
}
