package problemesjoel;

import java.util.Scanner;

public class MacarrismeAl100 {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int quantValors=ent.nextInt();

        //Mostrem el valor en format a mesura que els anem llegint
        for (int i = 0; i < quantValors; i++) {
            System.out.format("%.1f%% ", ent.nextDouble()*100);
        }
        System.out.println();
    }
}
