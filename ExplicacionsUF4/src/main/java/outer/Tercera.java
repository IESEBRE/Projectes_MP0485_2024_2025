package outer;

import org.example.AlumnePublic;

public class Tercera {

    public static void main(String[] args) {
        AlumnePublic a=new AlumnePublic();
        //dni és protected i només puc accedir des de classes del mateix paquet on se troba AlumnePublic
        //System.out.println(a.dni);
    }
}
