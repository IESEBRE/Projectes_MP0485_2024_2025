package problemesjoel;

import java.util.Scanner;

public class DesiertoSinaiSolucio2 {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int numCasos = ent.nextInt();

        while (numCasos-- > 0) {
            //Tractament de cada cas
            int numMapes = ent .nextInt();  //número de mapes a llegir, a l'enunciat li diu k
            //Tractem a banda el cas en que no tinguem mapes
            if(numMapes==0){
               continue;
            }
            BattleField[] mapes=new BattleField[numMapes];

            //Llegim els mapes i comptem els vots de cadascun
            while (numMapes-- > 0) {
                String nomMapa=ent.skip("[\r\n]*").nextLine();
                //Anem a buscar el nom del mapa al vector
                int i;      //declarem l'index fora del for per poder-lo usar a l'if següent
                for (i=0    ; i < mapes.length && mapes[i]!=null && !mapes[i].nom.equals(nomMapa); i++) ;
                if(mapes[i]==null){     //No hem trobat el mapa, per tant l'insertem al vector com a nou objecte BattleField
                    BattleField mapa= new BattleField();
                    mapa.nom=nomMapa;
                    mapa.numVots=1;     //és el primer vot que rep este mapa
                    mapes[i]=mapa;
                }else {                 //Hem trobat el mapa, per tant incrementem els seus vots
                    mapes[i].numVots++;
                }
            }

            //Anem a buscar qui és el guanyador
            int maximVots=0, indexMaxim=-1;
            for (int i = 0; i < mapes.length && mapes[i]!=null; i++) {
                if(mapes[i].numVots>maximVots) {     //Si això és true vol dir que tenim un nou màxim
                    maximVots=mapes[i].numVots;
                    indexMaxim=i;
                }
            }
            //El resultat serà el nom de la casella indexMaxim
            System.out.println(mapes[indexMaxim].nom);
        }
    }
}

class BattleField{

    //Propietats de la classe
    String nom;
    int numVots=0;


}
