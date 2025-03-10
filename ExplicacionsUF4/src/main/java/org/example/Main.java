package org.example;

public class Main {

    //Mètode main
    public static void main(String[] args) {
        Alumne objecte=new Alumne("Joan");
        //objecte.setNom("Capullo");
        System.out.println("Nom: "+objecte.getNom());
        System.out.println("DNI: "+objecte.dni);
    }
}

class Alumne {
    //Propietats
    private String nom="Josep";
    protected String dni;
    String cicle="DAM";         //package-private --> no se sol fer mai
    public String curs="1r";    //no hem de fer mai propietats public

    //Mètodes

    //Mètodes constructors
    public Alumne(){
    }

    public Alumne(String nom){
        this.setNom(nom);
    }

    //Mètodes accessors

    public String getNom() {
        return nom;
    }

    private void setNom(String nom) {
        if(nom.contains("Capullo")) return;
        //Propietat=paràmetre
        this.nom = nom;
    }
}