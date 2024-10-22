package problemesjoel;

import java.util.Scanner;

public class FisicAlimentSerpCamell {

    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);
        int numCasos = ent.nextInt();

        while (numCasos-- > 0) {
            //Tractament de cada cas
            char lletra=ent.skip("[\n\r]*").nextLine().charAt(0);
            String[] paraules=ent.skip("[\n\r]*").nextLine().split(" ");
            String resultat="";     //inicialitzem en element neutre de la concatenació, que és la cadena buida
            //Tractem cadascuna de les lletres possibles
            switch(lletra){
                case 'P':
                    for (int i = 0; i < paraules.length; i++) {
                        resultat+=paraules[i].toUpperCase().charAt(0)+paraules[i].toLowerCase().substring(1);
                    }
                    break;
                case 'K':
                    for (int i = 0; i < paraules.length; i++) {
                        resultat+=paraules[i].toLowerCase();
                        //Afegim guió excepte quan tractem l'última paraula
                        if(i!= paraules.length-1) resultat+='-';
                    }
                    break;
                case 'S':
                    for (int i = 0; i < paraules.length; i++) {
                        resultat+=paraules[i].toLowerCase();
                        //Afegim guió baix excepte quan tractem l'última paraula
                        if(i!= paraules.length-1) resultat+='_';
                    }
                    break;
                case 'C':
                    for (int i = 0; i < paraules.length; i++) {
                        //Tractem la primera paraula diferent a la resta
                        if( i== 0 ) resultat+=paraules[i].toLowerCase();
                        else resultat+=paraules[i].toUpperCase().charAt(0)+paraules[i].toLowerCase().substring(1);
                    }
                    break;
            }
            //Mostrem el resultat del cas actual
            System.out.println(resultat);
        }
    }
}
