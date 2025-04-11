package org.example.colgen;

import java.util.Comparator;
import java.util.TreeSet;

public class ExempleTreeSet {

    public static void main(String[] args) {
        TreeSet<Pojo> col=new TreeSet<>(new Comparator<Pojo>() {
            @Override
            public int compare(Pojo o1, Pojo o2) {
                return o2.nom.compareTo(o1.nom);
            }
        });

        col.add(new Pojo("A"));
        col.add(new Pojo("B"));
        col.add(new Pojo("C"));

        for(Pojo p:col){
            p.contingut++;
            System.out.println(p);
        }

    }

}

class Pojo implements Comparable<Pojo>{

    int contingut=0;
    String nom;

    public Pojo(int contingut) {
        this.contingut = contingut;
    }

    public Pojo(String nom) {
        this.nom = nom;
    }



    @Override
    public String toString() {
        return "Pojo{" +
                "contingut=" + contingut +
                ", nom='" + nom + '\'' +
                '}';
    }

    @Override
    public int compareTo(Pojo o) {
        return this.nom.compareTo(o.nom);
    }
}
