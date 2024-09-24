package problemesjoel;

import java.util.Scanner;

public class AnyTraspas {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int any;
        any= ent.nextInt();

        if(any%4==0 && any%100 != 0 || any%400 == 0) System.out.println("SI");
        else System.out.println("NO");
    }
}
