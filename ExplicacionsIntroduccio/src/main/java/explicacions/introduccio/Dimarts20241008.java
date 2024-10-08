package explicacions.introduccio;

import java.util.Scanner;

public class Dimarts20241008 {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        System.out.println("Escriu un text qualsevol:");
        String text = ent.nextLine();

        //Declarem un index per recorrer el text --> controlador del bucle
        int index=0;

        //Faig un bucle per recorrer el text d'esquerra a dreta
        while(index < text.length()){
            //Mostrem un caracter
            System.out.println(text.charAt(index));
            //Incrementem l'índex per canviar de lletra a cada iteració
            index++;
        }

        index=text.length()-1;

        //Faig un bucle per recorrer el text de dreta a esquerra
        while(index >= 0){
            //Mostrem un caracter
            System.out.println(text.charAt(index));
            //Decrementem l'índex per canviar de lletra a cada iteració
            index--;
        }

    }
}
