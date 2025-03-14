package abstractes;

public abstract class Abstracta {

    //Mètodes abstractes --> no té implementació
    public abstract int metodeAbstracte();

    public static void main(String[] args) {
        //Abstracta a=new Abstracta();
    }

}

abstract class FillaAbstracta1 extends Abstracta{

}

class FillaAbstracta2 extends Abstracta{

    @Override
    public int metodeAbstracte() {
        return 0;
    }
}