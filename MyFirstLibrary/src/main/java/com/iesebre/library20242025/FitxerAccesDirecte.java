package com.iesebre.library20242025;

import java.io.*;

public class FitxerAccesDirecte<T extends Serializable> {

    private String nom = "dades.dat";
    private RandomAccessFile raf;

    /**
     * Crea un fitxer d'accés directe en el nom especificat
     * @param nom especifica el nom que li posem al fitxer
     * @throws FileNotFoundException provocada per un error en el nom del fitxer que no el permet crear
     */
    public FitxerAccesDirecte(String nom) throws FileNotFoundException {
        this.nom = nom;
        raf = new RandomAccessFile(nom, "rw");
    }

    /**
     * Mostra el nom relatiu del fitxer
     * @return el nom relatiu del fitxer
     */
    public String getNom() {
        return nom;
    }

    /**
     * Escrivim un objecte nou a la posició especificada del fitxer
     * @param object instància de la classe T que guardem al fitxer
     * @param posicio un valor enter
     * @return true si s'ha pogut escriure l'objecte i false en cas contrari. La posició ha de ser major que 0.
     * @throws IOException provocada per un error d'entrada/sortida
     * @throws ClassNotFoundException provocada si no es troba la classe a la que pertany l'instància a guardar
     */
    public boolean writeObject(T object, int posicio) throws IOException, ClassNotFoundException {
        if (posicio < 1) return false;
        //Tractem l'objecte a insertar
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(object);
        oos.flush();
        byte[] data = bos.toByteArray();
        //Busquem la posicio on ha d'anar el nou objecte, saltant els objectes anteriors fins arribar a la posició o al
        // final del fitxer (en este darrer cas la posicio serà l'última, i pot no coincidir en l'especificada)
        int compt = 1;
        long punter = -1;
        raf.seek(0);
        do {
            try {
                punter = raf.getFilePointer();
                this.readObject(compt);  //Hem trobat un objecte
                if (posicio == compt) {
                    reordenar(data.length + 4, punter);  //Tamany de l'objecte més 4 bytes per l'enter del tamany
                    break;
                }
                compt++;
            } catch (EOFException e) {
                punter = -1;
                break;
            }
        } while (true);

        if (punter != -1) raf.seek(punter);

        raf.writeInt(data.length); // Write the length of the object
        raf.write(data); // Write the object data
        return true;
    }

    private void reordenar(long dixarLLiure, long punter) throws IOException, ClassNotFoundException {
        // Desplaçar el contingut del fitxer per deixar espai lliure
        long fileLength = raf.length();
        byte[] buffer = new byte[1];
        long currentPos = raf.getFilePointer();
        long readPos = fileLength - 1;
        long writePos = readPos + dixarLLiure;

        while (readPos >= punter) {
            raf.seek(readPos);
            int bytesRead = raf.read(buffer);
            raf.seek(writePos);
            raf.write(buffer, 0, bytesRead);
            readPos -= bytesRead;
            writePos -= bytesRead;
        }

        // Ajustar la longitud del fitxer
        raf.setLength(fileLength + dixarLLiure);
    }

    /**
     * Escrivim un objecte nou al final del fitxer
     * @param object instància de la classe T que guardem al fitxer
     * @throws IOException provocada per un error d'entrada/sortida
     * @throws ClassNotFoundException provocada si no es troba la classe a la que pertany l'instància a guardar
     */
    public void writeObject(T object) throws IOException, ClassNotFoundException {
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
    }

    /**
     * Obté del fitxer la instància que està a la posició indicada
     * @param posicio un valor enter
     * @return l'objecte llegit del fitxer, o null si la posició no és major que 0, o és inexistent
     * @throws IOException provocada per un error d'entrada/sortida
     * @throws ClassNotFoundException provocada si no es troba la classe a la que pertany l'instància a guardar
     */
    private T readObject(int posicio) throws IOException, ClassNotFoundException {
        if (posicio < 1) return null;


        int compt = 1;
        raf.seek(0);
        do {
            try {
                int length = raf.readInt(); // Read the length of the object
                if (posicio == compt) {
                    byte[] data = new byte[length];
                    raf.readFully(data); // Read the object data
                    ByteArrayInputStream bis = new ByteArrayInputStream(data);
                    ObjectInputStream ois = new ObjectInputStream(bis);
                    return ((T) ois.readObject());
                }
                raf.seek(raf.getFilePointer() + length);
                compt++;
            } catch (EOFException e) {
                break;
            }
        } while (true);

        //Si no hem trobat un objecte a la posicio indicada retornem null
        return null;
    }


}
