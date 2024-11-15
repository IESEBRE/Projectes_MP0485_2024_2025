package problemesjoel;

import java.util.Scanner;

public class SumaFilesColumnes {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        //1. Llegim dimensions
        int f=ent.nextInt();
        int c=ent.nextInt();

        //2. Declarem la matriu
        int[][] m=new int[f][c];

        //3. Omplir la matriu
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j]=ent.nextInt();
            }
        }

        //4. Llegim el valor a calcular
        int v=ent.nextInt();

        //5. Calculem el resultat i el mostrem

        //Primer fem la suma de la fila
        int suma=0;
        for (int i = 0; i < m[v].length; i++) {
            suma+=m[v][i];
        }
        System.out.print(suma);

        //Ara mostro la suma de la columna
        suma=0;
        for (int i = 0; i < m.length; i++) {
            suma+=m[i][v];
        }
        System.out.format(" %d%n",suma);
    }

}
