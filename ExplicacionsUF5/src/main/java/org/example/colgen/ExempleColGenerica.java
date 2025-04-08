package org.example.colgen;

import java.util.*;

public class ExempleColGenerica {

    public static void main(String[] args) {
        ArrayList<String> llista=new ArrayList<>();

        llista.add("bon dia");
        //llista.add(new Scanner(System.in));

        llista.get(0).length();

        ArrayList<Object> llista2=new ArrayList<>();
        llista2.add("bon dia");
        llista2.add(new Scanner(System.in));

        llista2.get(0).toString();

        //A la part esquerra de la declaració d'una col·lecció podem usar interficies

        Collection<String> list=new HashSet<>();

        list.add("kdrf");
        list.contains("ksdfjksdf");
        list.clear();
    }
}
