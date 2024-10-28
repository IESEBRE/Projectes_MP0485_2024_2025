package problemesjoel;

import java.util.Scanner;

public class DetectorLenguaje {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        switch(ent.nextLine().trim().toUpperCase()){
            case  "ADIOS":
                System.out.println("ES");
                break;
            case "GOOD BYE":
                System.out.println("UK");
                break;
            case "AU REVOIR":
                System.out.println("FR");
                break;
            case "CIAO":
                System.out.println("IT");
                break;
            case "DOEI":
                System.out.println("NL");
                break;
            case "TSCHUSS":
                System.out.println("DE");
                break;
            default:
                System.out.println("??");
        }
    }
}
