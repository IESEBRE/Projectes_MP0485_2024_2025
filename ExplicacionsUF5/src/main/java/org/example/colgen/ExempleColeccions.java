package org.example.colgen;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ExempleColeccions {

    public static void main(String[] args) {

        ArrayList llista=new ArrayList();

        llista.add(45); //element nº 0 de la col·lecció
        llista.add("Hola"); //element 1
        llista.add(new Scanner(System.in)); //element 2

        System.out.println(llista.get(1));

        //recorregut de la col·lecció
        for (int i = 0; i < llista.size(); i++) {
            System.out.println(llista.get(i));
        }

        Iterator it=llista.iterator();
        while(it.hasNext())
            System.out.println(it.next());
    }

}


class Problemes{

    public static void main(String[] args) {
        ArrayList l=new ArrayList();
        l.add("Bon dia");
        l.add(new Scanner(System.in));

        if(l.get(1) instanceof String) ((String)l.get(1)).length();
        if(l.get(0) instanceof Scanner) ((Scanner)l.get(0)).hasNext();

    }

}
