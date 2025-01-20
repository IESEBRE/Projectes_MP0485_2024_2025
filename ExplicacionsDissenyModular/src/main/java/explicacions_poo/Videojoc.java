package explicacions_poo;

//POJO: plain old Java object
public class Videojoc {

    //Propietats dels videojocs --> definixen l'estat dels objectes
    private String nom="Nom per defecte";
    private String versio="1.0";
    private String creador="Naughty Dog";
    private String categoria="Acción";
    private int maxJugadors;
    private double preu;
    private boolean multiplataforma;

    //Mètodes de la classe --> definixen el comportament dels objectes

    //Mètodes constructors --> els usem per instanciar/construir/crear els objectes
    public Videojoc(){}

    public Videojoc(String nom, String versio, String categoria, String creador, double preu, boolean multiplataforma){
        this.nom=nom;
        this.versio=versio;
        this.categoria=categoria;
        this.creador=creador;
        this.preu=preu;
        this.multiplataforma=multiplataforma;
    }

    public Videojoc(String nom, String versio){
        this.nom=nom;
        this.versio=versio;
    }

    public Videojoc(String nom, int maxJugadors, boolean multiplataforma) {
        this.nom = nom;
        this.maxJugadors = maxJugadors;
        this.multiplataforma = multiplataforma;
    }

    //Mètodes accessors --> getters i setters
    public String getNom(){
        return nom;
    }

    public void setNom(String nom){
        this.nom=nom;   // el this.nom apunta a la propietat de l'objecte mentre que nom apunta al paràmetre
    }

    public String getVersio() {
        return versio;
    }

    public void setVersio(String versio) {
        this.versio = versio;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getMaxJugadors() {
        return maxJugadors;
    }

    public void setMaxJugadors(int maxJugadors) {
        this.maxJugadors = maxJugadors;
    }

    public double getPreu() {
        return preu;
    }

    public void setPreu(double preu) {
        this.preu = preu;
    }

    public boolean isMultiplataforma() {    //--> els getters de les propietats booleanes se diuen is....
        return multiplataforma;
    }

    public void setMultiplataforma(boolean multiplataforma) {
        this.multiplataforma = multiplataforma;
    }

    //Mètodes "normals"

    /**
     * Incrementa el preu del joc segons el percentatge que li passem
     * @param percentatge un número enter
     */
    public void incrementaPreu(int percentatge){
        this.preu=this.preu+(this.preu*percentatge/100);
    }

    //Mètodes heredats

    @Override
    public String toString() {
        return "Videojoc{" +
                "nom='" + nom + '\'' +
                ", versio='" + versio + '\'' +
                ", creador='" + creador + '\'' +
                ", categoria='" + categoria + '\'' +
                ", maxJugadors=" + maxJugadors +
                ", preu=" + preu +
                (multiplataforma ? ", És multiplataforma":", No és multiptaforma") +
                '}';
    }
}

class Creadora{

    public static void main(String[] args) {
        //Instanciem videojocs --> crear objectes de la classe Videojoc
        Videojoc joc=new Videojoc();
        joc.setNom("Minecraft");      //Canviem el nom al nou videojoc
        joc.setCategoria("Aventura");
        joc.setVersio("1.21.4");
        joc.setCreador("Microsoft");
        joc.setPreu(29.99);
        joc.setMultiplataforma(true);
        System.out.println(joc.getNom());

        joc=new Videojoc("LOL","14.20","Rol","Riot Games", 0, false);
        System.out.println(joc.getNom());

        Videojoc[] jocs=new Videojoc[100];

        jocs[0]=joc;
        jocs[1]=new Videojoc();
        jocs[2]=joc;

        System.out.println(joc.toString());

    }



}


