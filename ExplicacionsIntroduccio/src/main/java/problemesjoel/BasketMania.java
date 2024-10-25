package problemesjoel;

import java.util.Scanner;

public class  BasketMania{
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int partits = ent.skip("[\r\n]*").nextInt();

        for (int j = 0; j < partits; j++) {
            int casos = ent.skip("[\r\n]*").nextInt();
            int lTeam = 0;
            int vTeam = 0;
            for (int i = 0; i < casos; i++) {
                String[] str = ent.skip("[\r\n]*").nextLine().split(" ");
                if (str[0].equalsIgnoreCase("V")) vTeam += Integer.valueOf(str[1]);
                else lTeam += Integer.valueOf(str[1]);
            }
            if (lTeam > vTeam) System.out.format("L %d %d%n", lTeam, vTeam);
            else if (lTeam < vTeam) System.out.format("V %d %d%n", lTeam, vTeam);
            else System.out.format("E %d %d%n", lTeam, vTeam);
        }
    }
}