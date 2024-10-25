package problemesjoel;

import java.util.Scanner;

public class BolasLobas1 {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int numCasos = ent.nextInt();

        while (numCasos-- > 0) {
            //Tractament de cada cas
            String text=ent.skip("[\n\r]*").nextLine();
            int pos1=ent.nextInt();
            int pos2=ent.nextInt();
            for (int i = 0; i <text.length() ; i++) {
                if(i!=pos1 && i!=pos2) System.out.printf("%c", text.charAt(i));
                else if(i==pos1) System.out.printf("%c", text.charAt(pos2));
                else System.out.printf("%c", text.charAt(pos1));
            }
            System.out.println();
        }
    }
}
