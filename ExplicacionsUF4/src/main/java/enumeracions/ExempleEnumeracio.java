package enumeracions;

public enum ExempleEnumeracio {
    DAVANT, DARRERA, ESQUERRA, DRETA
}

class Vehicle{

    //PROPIETATS DE LA CLASSE
    private String nom="Cotxe";
    private double cilindrada=600.0;
    //Davant, darrera, esquerra, dreta
    private String direccio="NO ESTABLERTA";

    private ExempleEnumeracio direction=ExempleEnumeracio.DAVANT;

    public String getDireccio() {
        return direccio;
    }

    public void setDireccio(String direccio) {
        switch(direccio){
            case "davant":
            case "darrera":
            case "esquerra":
            case "dreta":
                this.direccio = direccio;
                break;
        }

    }

    public ExempleEnumeracio getDirection() {
        return direction;
    }

    public void setDirection(ExempleEnumeracio direction) {
        this.direction = direction;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "nom='" + nom + '\'' +
                ", cilindrada=" + cilindrada +
                ", direccio='" + direccio + '\'' +
                ", direction=" + direction +
                '}';
    }

    public static void main(String[] args) {
        Vehicle v=new Vehicle();
        v.setDireccio("adelante");

        v.setDirection(ExempleEnumeracio.DRETA);

        System.out.println(v);
    }
}
