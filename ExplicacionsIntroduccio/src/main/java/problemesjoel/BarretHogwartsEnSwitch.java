package problemesjoel;

import java.util.Scanner;

public class BarretHogwartsEnSwitch {

    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);

        //System.out.println("Introduix una paraula:"); --> només el posariem en cas de ser executat per una persona
        String paraula = ent.nextLine();

        //Com comparem objectes utlitzem el mètode equals, no l'operador ==
        switch (paraula) {
            case "Coratge":
                System.out.println("Gryffindor");
                break;
            case "Coneixement":
                System.out.println("Ravenclaw");
                break;
            case "Ambicio":
                System.out.println("Slytherin");
                break;
            default:
                System.out.println("Hufflepuff");
        }
    }
}
