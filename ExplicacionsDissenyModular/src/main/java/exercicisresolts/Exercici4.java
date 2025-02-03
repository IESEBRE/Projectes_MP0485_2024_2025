package exercicisresolts;

public class Exercici4 {

    /**
     * Inserta una subcadena dins d'un text a partir d'una posició
     * @param text text on volem insertar la sucadena
     * @param subcadena tetx que volem insertar
     * @param pos posició a partir de la qual volem insertar
     * @return La cadena fruit d'insertar la subcadena dins del text a partir de la posició indicada. Si els 2 strings
     *  són null el mètode retornarà null, si només un d'ells és null retornarà l'String no null, si el número és
     *  negatiu se farà el mateix que si valguès 0, si el número és superior a la llargada del primer String, se farà el
     *  mateix que si valgués la llargada.
     */
    public static String insertaCadena(String text, String subcadena, int pos){
        //Casos especials
        /*
        si els 2 Strings són null el mètode retornarà null,
        si només un d'ells és null retornarà l'String no null,
        si el número és negatiu se farà el mateix que si valguès 0,
        si el número és superior a la llargada del primer String, se farà el mateix que si valgués la llargada.
         */
        if(text==null && subcadena==null) return null;
        if(subcadena==null) return text;
        if(text==null) return subcadena;
        if(pos<0) pos=0;
        if(pos>text.length()) pos=text.length();



        //Casos normals
        return text.substring(0,pos)+subcadena+text.substring(pos);
    }

    public static void main(String[] args) {
        System.out.println(insertaCadena(null, "Hello World", 0));
    }
}