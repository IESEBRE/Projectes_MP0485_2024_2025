package problemesjoel;

import java.util.Scanner;

public class ProblemasComerciantes {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int x=ent.nextInt();
        int y=ent.nextInt();

        if(x==0 && y==1) System.out.println("OK");
        else if(y==1) System.out.println("KO");
        else System.out.printf("%.6f%n",(double)-x/(y-1));
    }
}
