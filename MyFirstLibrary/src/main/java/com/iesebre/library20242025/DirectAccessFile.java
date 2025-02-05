package com.iesebre.library20242025;

import java.io.*;
import java.util.Random;

public class DirectAccessFile<T extends Serializable> {

    //Propietats
    private String name = "dades.dat";
    private RandomAccessFile raf;
    private int comptObjs = 0;


    //Constructors

    /**
     * Crea un fitxer d'accés directe en el nom especificat
     *
     * @param name el nom que li posem al fitxer
     * @throws FileNotFoundException provocada per un error en el nom del fitxer que no el permet crear
     */
    public DirectAccessFile(String name) throws IOException {

        this.name = name;
        raf = new RandomAccessFile(name, "rw");
    }

    /**
     * Crea un fitxer d'accés directe en el nom per defecte
     *
     * @throws FileNotFoundException provocada per un error en el nom del fitxer que no el permet crear
     */
    public DirectAccessFile() throws IOException {
        raf = new RandomAccessFile(name, "rw");
    }

    //Getters i setters

    /**
     * Mostra el nom relatiu del fitxer
     *
     * @return el nom relatiu del fitxer
     */
    public String getName() {
        return name;
    }

    //Mètodes de la classe

    /**
     * Escrivim un objecte nou a la posició especificada del fitxer
     *
     * @param object   instància de la classe T que guardem al fitxer
     * @param position un valor enter
     * @return true si s'ha pogut escriure l'objecte i false en cas contrari. La posició ha de ser major o igual que 0.
     * @throws IOException            provocada per un error d'entrada/sortida
     * @throws ClassNotFoundException provocada si no es troba la classe a la que pertany l'instància a guardar
     */
    public boolean writeObject(T object, int position) throws IOException, ClassNotFoundException {
        if (position < 0) return false;

        //Busquem la posicio on ha d'anar el nou objecte, saltant els objectes anteriors fins arribar a la posició o al
        // final del fitxer (en este darrer cas la posicio serà l'última, i pot no coincidir en l'especificada)
        if (position < this.size()) {
            //Tractem l'objecte a insertar
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(object);
            oos.flush();
            byte[] data = bos.toByteArray();

            //Anem a buscar la posició d'inserció
            int compt = 1;
            long punter = 0;
            do {
                    raf.seek(punter);
                    int tamany = raf.readInt(); // Read the length of the object

                    if (position + 1 == compt) {  //estem a l'objecte buscat
                        moveForward(data.length + 8, punter);
                        break;
                    }
                    compt++;
                    punter += tamany + 8;
            } while (true);

            raf.seek(punter);
            raf.writeInt(data.length); // Write the length of the object
            raf.write(data); // Write the object data
            raf.writeInt(data.length); // Write the length of the object
            //Incremento el comptador d'objectes del fitxer
            comptObjs++;

        } else this.writeObject(object);

        return true;
    }

    private void moveForward(int leaveFree, long initialPosition) throws IOException {
        // Desplaçar el contingut del fitxer per deixar espai lliure
        long fileLength = raf.length();

        long readPos = fileLength-4;        //Lligirem el tamany de l'últim objecte col·locant readPos al seu bloc final


        while (readPos > initialPosition) {
            raf.seek(readPos);                  //on guardem el seu tamany (este 4 és correcte)
            int tamany = raf.readInt();
            readPos=readPos-tamany-4;                  //Situem readPos a l'inici de l'últim objecte
            long writePos = readPos+leaveFree;
            raf.seek(readPos);
            byte[] buffer = new byte[tamany+8]; //cantitat de bytes a llegir, el d'un objecte en tamanys inclosos
            int bytesRead = raf.read(buffer);
            raf.seek(writePos);
            raf.write(buffer, 0, bytesRead);
            readPos-=4;                         //ens situem al final de l'anterior objecte
        }

    }

    private void moveBackwards(int movementSize, long initialPosition) throws IOException {
        // Desplaçar el contingut del fitxer per deixar espai lliure
        long fileLength = raf.length();
        byte[] buffer = new byte[movementSize];
        long readPos = initialPosition + movementSize;
        long writePos = initialPosition;

        while (readPos < fileLength) {
            raf.seek(readPos);
            int bytesRead = raf.read(buffer);
            raf.seek(writePos);
            raf.write(buffer, 0, bytesRead);
            readPos += bytesRead;
            writePos += bytesRead;
        }

        // Ajustar la longitud del fitxer
        //raf.setLength(fileLength - movementSize);
    }

    /**
     * Escrivim un objecte nou al final del fitxer
     *
     * @param object instància de la classe T que guardem al fitxer
     * @throws IOException provocada per un error d'entrada/sortida
     */
    public void writeObject(T object) throws IOException {
        // Ens situem al final del fitxer
        raf.seek(raf.length());

        //Escrivim l'objecte
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(object);
        oos.flush();
        byte[] data = bos.toByteArray();
        raf.writeInt(data.length); // Write the length of the object
        raf.write(data); // Write the object data
        raf.writeInt(data.length); // Write the length of the object
        comptObjs++;    //Incremento el comptador d'objectes del fitxer
    }

    /**
     * Obté la instància que està a la posició indicada del fitxer
     *
     * @param position un valor enter
     * @return l'objecte llegit del fitxer, o null si la posició no és major o igual que 0, o és inexistent o no hi ha
     * objectes
     * @throws IOException            provocada per un error d'entrada/sortida
     * @throws ClassNotFoundException provocada si no es troba la classe a la que pertany l'instància a guardar
     */
    public T readObject(int position) throws IOException, ClassNotFoundException {
        //Si no hi ha objectes o la posició és incorrecta retornem null
        if (position < 0 || comptObjs == 0 || position >= comptObjs) return null;

        //Busquem la posicio al fitxer de l'objecte, saltant els objectes anteriors fins arribar
        int compt = 1;
        long punter = 0;

        do {
            raf.seek(punter);
            int length = raf.readInt(); // Read the length of the object

            if (position + 1 == compt) {  //estem a l'objecte buscat
                byte[] data = new byte[length];
                raf.readFully(data); // Read the object data
                ByteArrayInputStream bis = new ByteArrayInputStream(data);
                ObjectInputStream ois = new ObjectInputStream(bis);
                return ((T) ois.readObject());
            }
            compt++;
            punter += length + 8;       //4 bytes per cada variable de tamany que posem abans i després de l'objecte
        } while (true);

    }

    /**
     * Obté la instància que està a la posició actual del punter del fitxer
     *
     * @return l'objecte llegit del fitxer, o null si la posició actual del punter no és correcta o no hi ha objectes
     * @throws IOException            provocada per un error d'entrada/sortida
     * @throws ClassNotFoundException provocada si no es troba la classe a la que pertany l'instància
     */
    public T readObject() throws IOException  {
        //Si no hi ha objectes
        if ( comptObjs == 0 ) return null;

        //Busquem la posicio al fitxer de l'objecte, saltant els objectes anteriors fins arribar
        try {
            int length = raf.readInt(); // Read the length of the object

            byte[] data = new byte[length];
            raf.readFully(data); // Read the object data
            raf.seek(raf.getFilePointer()+4);
            ByteArrayInputStream bis = new ByteArrayInputStream(data);
            ObjectInputStream ois = new ObjectInputStream(bis);
            return ((T) ois.readObject());
        }catch(ClassNotFoundException | EOFException e){
            //Si la posició no era correcta
        }
        return null;
    }

    /**
     * Borra tot el contingut del fitxer
     *
     * @throws IOException provocada per un error d'entrada/sortida
     */
    public void deleteAll() throws IOException {
        raf.setLength(0L);
        comptObjs = 0;    //Poso a 0 el comptador d'objectes del fitxer
    }

    /**
     * Diu quants objectes conté el fitxer
     *
     * @return un enter indicant la quantitat d'objectes del fitxer
     */
    public int size() {
        return comptObjs;
    }

    /**
     * Ens situa al principi del fitxer
     * @throws IOException  provocada per un error d'entrada/sortida
     */
    public void goToBeggining() throws IOException {
        raf.seek(0);
    }

    /**
     * Ens situa al final del fitxer
     * @throws IOException  provocada per un error d'entrada/sortida
     */
    public void goToEnd() throws IOException {
        raf.seek(raf.length());
    }

    /**
     * Borrem l'objecte de la posició especificada del fitxer
     *
     * @param position un valor enter
     * @return l'objecte borrat si s'ha trobat i null en cas contrari. La posició ha de ser major o igual que 0 i menor
     * que el número d'objectes del fitxer.
     * @throws IOException            provocada per un error d'entrada/sortida
     * @throws ClassNotFoundException provocada si no es troba la classe a la qual pertany la instància a borrar
     */
    public T deleteObject(int position) throws IOException, ClassNotFoundException {
        if (position < 0 || comptObjs == 0 || position >= comptObjs) return null;

        //Recuperem l'objecte a borrar
        T resultat = (T) this.readObject(position);  //Hem trobat un objecte

        /// /////////////////////////////////////////////////////////////
        //Tractem l'objecte a insertar
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(object);
        oos.flush();
        byte[] data = bos.toByteArray();

        //Anem a buscar la posició de borrat
        int compt = 1;
        long punter = 0;
        do {
            raf.seek(punter);
            int tamany = raf.readInt(); // Read the length of the object

            if (position + 1 == compt) {  //estem a l'objecte buscat

                moveBackwards(tamany + 8, punter + tamany + 8);
                break;
            }
            compt++;
            punter += tamany + 8;
        } while (true);

        //Decremento el comptador d'objectes del fitxer
        comptObjs--;

        return resultat;

    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        DirectAccessFile f = new DirectAccessFile();
        f.deleteAll();
//
//        f.writeObject(new Pojo("primer",70),4);
        for (int i = 0; i < 100; i++) {
            int pos=new Random().nextInt(f.size()+1);
//            System.out.println("Anem a insertar l'objecte: "+pos);
            f.writeObject(new Pojo("nom"+i, i+new Random().nextInt(100)),pos);
            f.writeObject(new Pojo("nom_final" + i, new Random().nextInt(100)));
        }
        f.goToEnd();
        for (int i = 0; i < f.size(); i++) {
            System.out.println(f.readObject());
        }

//        for (int i = 0; i <10 ; i++) {
//            int pos=new Random().nextInt(f.size()+1);
//            System.out.println("Anem a borrar l'objecte: "+pos);
//            f.deleteObject(pos);
//
//        }
//
//        for (int i = 0; i < f.size(); i++) {
//            System.out.println(f.readObject(i));
//        }

    }
}

class Pojo implements Serializable {

    private String nom;
    private int pes;

    public Pojo(String nom, int pes) {
        this.nom = nom;
        this.pes = pes;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getPes() {
        return pes;
    }

    public void setPes(int pes) {
        this.pes = pes;
    }

    @Override
    public String toString() {
        return "Pojo{" +
                "nom='" + nom + '\'' +
                ", pes=" + pes +
                '}';
    }
}