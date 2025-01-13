package com.iesebre.library20242025;

import java.util.Random;

public class Cadena {

    /*
    Comentari multilínia
    normal i corrent,
    no pertany al Javadoc
     */
    public static char retornaCaracter() {
        //Generem un caracter aleatori entre ' ' i '}'
        Random r=new Random();
        return (char)(r.nextInt('}'-' '+1)+' ');
    }

    /**
     * Genera un caràcter aleatori entre un caracter mínim i un màxim
     * @param caracterMinim el caracter aleatori generat més menut possible
     * @param caracterMaxim el caracter aleatori generat més gran possible
     * @return el caràcter generat aleatòriament entre un mínim i un màxim.
     */
    public static char retornaCaracter(char caracterMinim, char caracterMaxim) {
        //Primer comprovem si els paràmetres estan ordenats correctament, i sinó els intercanviem
        if(caracterMinim>caracterMaxim){
            char temp=caracterMinim;
            caracterMinim=caracterMaxim;
            caracterMaxim=temp;
        }
        //Generem un caracter aleatori entre ' ' i '}'
        Random r=new Random();
        return (char)(r.nextInt(caracterMaxim-caracterMinim+1)+caracterMinim);
    }
}
