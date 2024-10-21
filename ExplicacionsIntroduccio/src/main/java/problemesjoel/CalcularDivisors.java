package problemesjoel;

import java.util.Scanner;

public class CalcularDivisors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int casos = scanner.nextInt();

        for (int i = 0; i < casos; i++) {
            int n = scanner.nextInt();
            int[] divisors=new int[n];
            int index=0;

            for (int j = 1; j <= n; j++) {
                if (n % j == 0) {
                    System.out.print(j + " ");
                    divisors[index]=j;
                    index++;
                }
            }
            for (int j = index; j < divisors.length; j++) {
                divisors[j]=-1;
            }
        } System.out.println();
    }
}