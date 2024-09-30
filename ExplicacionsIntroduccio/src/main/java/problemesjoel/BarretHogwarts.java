package problemesjoel;

import java.util.Scanner;

public class BarretHogwarts {

    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);

        //System.out.println("Introduix una paraula:"); --> només el posariem en cas de ser executat per una persona
        String paraula = ent.nextLine();

        //Com comparem objectes utlitzem el mètode equals, no l'operador ==
        if (paraula.equals("Coratge")) {
            System.out.println("Gryffindor");
        } else {
            if (paraula.equals("Coneixement")) {
                System.out.println("Ravenclaw");
            } else {
                if (paraula.equals("Ambicio")) {
                    System.out.println("Slytherin");
                } else {
                    System.out.println("Hufflepuff");
                }
            }
        }
    }
}
