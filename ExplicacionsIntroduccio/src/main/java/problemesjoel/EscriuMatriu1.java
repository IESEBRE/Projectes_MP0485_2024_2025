package problemesjoel;

import java.util.Scanner;

public class EscriuMatriu1 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int n1 = ent.nextInt();
        int n2 = ent.nextInt();
        int[][] matriu;

        matriu = new int[n1][n2];

        for (int i = 0; i < matriu.length; i++) {
            for (int j = 0; j < matriu[i].length; j++) {
                matriu[i][j]=ent.nextInt();
                System.out.format("%d ",matriu[i][j]);
            }
            System.out.println();
        }
        int fila = ent.nextInt();
        int columna = ent.nextInt();
        System.out.format("%d%n", matriu[fila][columna]);
    }
}