package problemesjoel;

import java.util.Scanner;

public class BloodborneArraySenseArray {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int numCasos = ent.nextInt();

        while (numCasos-- > 0) {
            //Tractament de cada cas
            int caselles=ent.nextInt();
            boolean trobat = false;

            //Tractem els repetits a un bucle només si tenim més d'1 valor
            if(caselles>1) {
                //Busquem si hi ha caselles repetides
                int anterior=ent.nextInt();
                while(--caselles > 0) {
                    int actual=ent.nextInt();
                    if(anterior==actual) trobat = true;
                    //Una vegada hem comparat els 2 elements actualitzem el valor de l'anterior
                    anterior=actual;
                }
            }
            //Mostrem el resultat
            System.out.println(trobat?"SI":"NO");

        }
    }
}

//Recursos 0,170s, 40.68 MB
//Puntuación total: 4,00/4 (4.0/4 points)