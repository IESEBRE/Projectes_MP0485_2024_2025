package problemesjoel;

import java.util.Scanner;

public class AgujasEscondidas {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        String temps=ent.nextLine();
        int hora=Integer.parseInt(temps.split(":")[0]);
        int minuts=Integer.parseInt(temps.split(":")[1]);

        System.out.println((hora%12)*5+minuts/12 == minuts?"SI":"NO");

    }
}
