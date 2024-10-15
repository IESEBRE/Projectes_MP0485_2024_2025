package problemesjoel;

import java.util.Scanner;

public class DuraVidaAscensor {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        
        //Llegim els 3 valors enters inicials
        int petit=ent.nextInt();
        int gran=ent.nextInt();
        int ini=ent.nextInt();

        //Variables per mostrar la sortida del programa
        int qMovs=0;
        int qPisos=0;
        int fi=ini;     //Per si no hi ha moviments preparem el valor del pis final
        boolean hiHaIncorrectes=false;

        //Bucle per llegir els valors restants
        do{
            //Llegim un valor usant nextLine per què pot ser numèric o text
            String pisText=ent.skip("[\r\n]*").nextLine();
            if(pisText.equalsIgnoreCase("x")) break;    //Sortim del bucle per què hem rebut la X
            else{   //Hem entrat aquí per què pis és un número
                int pis=Integer.valueOf(pisText);

                //Fem els càlculs en el pis rebut
                if(pis<petit || pis > gran ) {    //Pis incorrecte
                    hiHaIncorrectes=true;
                }else{                             //Pis correcte
                    //Comprovem si canviem de pis
                    if(pis!=fi){
                        qMovs++;    //Incrementem el núymero de moviments
                        //Anem a calcular els pisos que ens desplacem
                        if(pis>fi) qPisos+=pis-fi;
                        else qPisos+=fi-pis;

                        //Actualitzem el pis on anem
                        fi=pis;
                    }
                }

            }
        }while(true);

        //Mostrem el resultat
        System.out.println(qMovs+" "+qPisos+" "+fi+(hiHaIncorrectes?" E":""));
    }
}
