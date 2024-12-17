package exercicisresolts;

public class Exercici20 {
    /*
    Programeu un mètode en Java anomenat reemplassaMultiplesCaracters que rebigue els següents paràmetres en l'ordre especificat:
    un String,
    un primer caràcter,
    un segon caràcter,
    un número variable de caràcters,
    El mètode retornarà un String producte de reemplaçar de l'String qualsevol dels caràcters del paràmetre variable o
    el segon caràcter, pel primer caràcter. Els casos especials a tractar seran:
    si l'String és null o la cadena buida, el mètode retornarà el primer String,
    Nota: aneu en compte ja que el número variable de caràcters pot ser null!!
    */

    //Mètode que retorna una cadena formada pels caràcters que rep com a paràmetre i sense repetits
    public static String construixCadena(char buscat, char... buscats){
        String resultat=""+buscat;
        if(buscats!=null){
            for (int j=0 ; j<buscats.length ; j++)
                //Conactenem el caràcter actual només si no està contingut dins del resultat
                if(!resultat.contains(buscats[j]+"")) resultat+=buscats[j];
        }
        return resultat;
    }


    public static String reemplassaMultiplesCaractersVersioLlarga(String text, char subst, char buscat, char... buscats){
        //Tractem casos especials --> tractar sempre la condició null primer!!
        if(text==null || text.isEmpty()) return text;


        //Tractem el cas general
        String resultat="";
        for (int i = 0; i < text.length(); i++) {
            char c=text.charAt(i);  //caràcter que tractem
            if(c==buscat) resultat+=subst;
            else {
                //Falta mirar si el caràcter actual és un dels buscats
                if(buscats!=null){
                    //Anem a buscar a c dins del vector buscats
                    int j=0;
                    for ( ; j<buscats.length && buscats[j]!=c ; j++);
                    if(j<buscats.length)    //caràcter actual trobat dins del vector
                        resultat+=subst;
                    else                    //caràcter no trobat disn del vector
                        resultat+=c;
                }else resultat+=c;
            }
//            resultat+=(c==buscat?subst:c);
        }
        return resultat;
    }

    public static String reemplassaMultiplesCaracters(String text, char subst, char buscat, char... buscats){
        //Tractem casos especials --> tractar sempre la condició null primer!!
        if(text==null || text.isEmpty()) return text;

        //Tractem el cas general
        String resultat="";
        String textBuscat=construixCadena(buscat, buscats);
        for (int i = 0; i < text.length(); i++) {
            char c=text.charAt(i);  //caràcter que tractem
            resultat+=(  textBuscat.contains(construixCadena(c)) ? subst: c);
        }
        return resultat;
    }


    public static void main(String[] args) {
        System.out.println(reemplassaMultiplesCaracters(null,' ', ' '));
        System.out.println(reemplassaMultiplesCaracters("",' ', ' '));
        System.out.println(reemplassaMultiplesCaracters("Hola",'p', 'o'));
        System.out.println(reemplassaMultiplesCaracters("Hola",'p', 'o', null));
        System.out.println(reemplassaMultiplesCaracters("Hola",'p', 'o', new char[]{}));
        System.out.println(reemplassaMultiplesCaracters("xHoclab",'p', 'o', new char[]{'H','l','a'}));

        System.out.println(reemplassaMultiplesCaracters("", 'p', 't'));
        System.out.println(reemplassaMultiplesCaracters(null, 'p', 't'));
        System.out.println(reemplassaMultiplesCaracters("textexans", 'p', 't', 'e', 'x'));
        System.out.println(reemplassaMultiplesCaracters("textexans", 'p', 't'));

    }
}
