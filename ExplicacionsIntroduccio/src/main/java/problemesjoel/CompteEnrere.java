package problemesjoel;

import java.util.Scanner;

public class CompteEnrere {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int num= ent.nextInt();

        while(num >= 0){
            System.out.println(num);
            num--;
        }
    }

}

