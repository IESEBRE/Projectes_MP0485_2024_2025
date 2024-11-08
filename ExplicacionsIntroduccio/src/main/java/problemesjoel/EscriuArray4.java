package problemesjoel;

import java.util.Scanner;

public class EscriuArray4 {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int numCaselles;
        int[] array;
        int sumant;

        //1. llegim el número de caselles
        numCaselles=ent.nextInt();
        //A partir d'aquí podem instanciar l'array
        array=new int[numCaselles];

        //2. Omplir array en valors
        for (int i = 0; i < array.length; i++) {
            array[i]= ent.nextInt();
        }

        //3. llegir el valor a sumar
        sumant=ent.nextInt();

        //4. recorrem el vector i mostrem la suma de sumant a cada casella
        for (int i = 0; i < array.length; i++) {
            System.out.format("%d ",array[i]+sumant); //print((array[i]+sumant)+" ")
        }
        System.out.println();
    }
}
