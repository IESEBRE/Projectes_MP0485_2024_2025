package problemesjoel;

import java.util.Scanner;

public class QuadratFormat {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        double numero=ent.nextDouble();
        System.out.format("%015.3f%n",numero*numero);
    }
}
