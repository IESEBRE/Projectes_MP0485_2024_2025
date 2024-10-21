package problemesjoel;

import java.util.Scanner;

public class Lalafel {

    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);
        int numCasos = ent.nextInt();

        while (numCasos-- > 0) {
            //Tractament de cada cas
            String[] paraules=ent.skip("[\r\n]*").nextLine().split(", ");
            int necessaris=ent.nextInt();

            //Variables necessàries
            int comptLalafels=0;
            int telaranyesPlenes=0;

            for (int i = 0; i <paraules.length ; i++) {
                switch(paraules[i].toLowerCase()){
                    case "lalafel":
                        comptLalafels++;
                        break;
                    case "telaranya":
                        if(necessaris>0 && comptLalafels>=necessaris) {
                            telaranyesPlenes++;
                            comptLalafels -= necessaris;
                        }
                        break;
                    case "aranya":
                        comptLalafels=telaranyesPlenes=0;
                        break;
                }
            }
            //Mostrem el resultat
            //System.out.println("Hay "+telaranyesPlenes+" telaranyas llenas.");
            System.out.format("Hay %d telaranyas llenas.%n", telaranyesPlenes);

        }






    }
}
