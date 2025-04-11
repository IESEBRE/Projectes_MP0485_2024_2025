package org.example.colgen;

import java.io.Serializable;
import java.util.Scanner;

public class ClasseGenerica2 <T extends String & Serializable>{
}

class Prova2{

    public static void main(String[] args) {

        ClasseGenerica2<String> c=new ClasseGenerica2<>();
        //ClasseGenerica2<Scanner> c2=new ClasseGenerica2<>();


    }

}