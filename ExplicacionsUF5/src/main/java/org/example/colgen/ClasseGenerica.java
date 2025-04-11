package org.example.colgen;

import java.util.Scanner;

public class ClasseGenerica <T>{

    //Propietats
    private T contingut;

    //Constructors
    public ClasseGenerica() {
    }

    public ClasseGenerica(T contingut) {
        this.contingut = contingut;
    }

    //Mètode no genèric d'una classe genèrica
    public T getContingut() {
        return contingut;
    }

    //Mètode no genèric d'una classe genèrica
    @Override
    public String toString() {
        return "ClasseGenerica{" +
                "contingut=" + contingut +
                '}';
    }

    //Mètode no genèric d'una classe genèrica
    public void setContingut(T contingut) {
        this.contingut = contingut;
    }

    //Mètode genèric dins d'una classe genèrica
    public <U> void metodeGeneric(){

    }


}

class Prova{

    public static void main(String[] args) {
        ClasseGenerica c=new ClasseGenerica();
        c.setContingut("hola");
        c.setContingut(23);

        System.out.println(((Integer)c.getContingut()+34));   //Problema pk no sabemquin tipo retornarà el getter

        ClasseGenerica<Integer> cg=new ClasseGenerica<>(45);
        System.out.println(cg.getContingut()+34);

        cg.<Scanner>metodeGeneric();
        //cg.<Scanner>metodeGeneric2();
    }

}
