package problemesjoel;

import java.util.Scanner;

public class AireCondicionatSenseBucles {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int graus = ent. nextInt();

        System.out.println( graus%180 != 0 ? "BRONCA" : "OK");
    }
}
