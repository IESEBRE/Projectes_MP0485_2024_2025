package interficies;

import java.io.Serializable;

public interface Ampliacio {

    void nofaigRes();

    //void ampliacio();

}

interface NovaAmpliacio extends Ampliacio, Serializable{    //les interfícies tenen herència múltiple

    void ampliacio();
}


class Classe extends Object implements NovaAmpliacio, Serializable {   //les classe tenen herència simple
                                                                      //i implementació múltiple
    @Override
    public void nofaigRes() {
    }

    @Override
    public void ampliacio() {

    }
}