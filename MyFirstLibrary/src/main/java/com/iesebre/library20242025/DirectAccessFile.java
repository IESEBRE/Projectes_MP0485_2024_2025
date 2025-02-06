package com.iesebre.library20242025;

import java.io.*;
import java.util.Random;

public class DirectAccessFile<T extends Serializable> implements Closeable, AutoCloseable {

    // Properties
    private String name = "dades.dat";
    private RandomAccessFile raf;
    private int comptObjs = 0;

    // Constructors

    /**
     * Creates a direct access file with the specified name
     *
     * @param name the name given to the file
     * @throws FileNotFoundException if an error occurs with the file name that prevents its creation
     */
    public DirectAccessFile(String name) throws IOException {
        this.name = name;
        raf = new RandomAccessFile(name, "rw");
    }

    /**
     * Creates a direct access file with the default name
     *
     * @throws FileNotFoundException if an error occurs with the file name that prevents its creation
     */
    public DirectAccessFile() throws IOException {
        raf = new RandomAccessFile(name, "rw");
    }

    // Getters and setters

    /**
     * Shows the relative name of the file
     *
     * @return the relative name of the file
     */
    public String getName() {
        return name;
    }

    // Class methods

    /**
     * Writes a new object at the specified position in the file
     *
     * @param object   instance of class T to be saved in the file
     * @param position an integer value
     * @return true if the object was successfully written, false otherwise. The position must be greater than or equal to 0.
     * @throws IOException            if an input/output error occurs
     * @throws ClassNotFoundException if the class of the instance to be saved is not found
     */
    public boolean writeObject(T object, int position) throws IOException, ClassNotFoundException {
        if (position < 0) return false;

        // Find the position where the new object should go, skipping previous objects until reaching the position or the end of the file (in this case, the position will be the last one, and may not match the specified one)
        if (position < this.size()) {
            // Process the object to be inserted
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(object);
            oos.flush();
            byte[] data = bos.toByteArray();

            // Find the insertion position
            int compt = 1;
            long punter = 0;
            do {
                raf.seek(punter);
                int tamany = raf.readInt(); // Read the length of the object

                if (position + 1 == compt) {  // we are at the desired object
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
            // Increment the object counter of the file
            comptObjs++;

        } else this.writeObject(object);

        return true;
    }

    private void moveForward(int leaveFree, long initialPosition) throws IOException {
        // Move the file content to leave free space
        long fileLength = raf.length();

        long readPos = fileLength - 4; // We will read the size of the last object by placing readPos at its final block

        while (readPos > initialPosition) {
            raf.seek(readPos); // where we store its size (this 4 is correct)
            int tamany = raf.readInt();
            readPos = readPos - tamany - 4; // Place readPos at the beginning of the last object
            long writePos = readPos + leaveFree;
            raf.seek(readPos);
            byte[] buffer = new byte[tamany + 8]; // number of bytes to read, the size of an object including sizes
            int bytesRead = raf.read(buffer);
            raf.seek(writePos);
            raf.write(buffer, 0, bytesRead);
            readPos -= 4; // place at the end of the previous object
        }
    }

    /**
     * Writes a new object at the end of the file
     *
     * @param object instance of class T to be saved in the file
     * @throws IOException if an input/output error occurs
     */
    public void writeObject(T object) throws IOException {
        // Place at the end of the file
        raf.seek(raf.length());

        // Write the object
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(object);
        oos.flush();
        byte[] data = bos.toByteArray();
        raf.writeInt(data.length); // Write the length of the object
        raf.write(data); // Write the object data
        raf.writeInt(data.length); // Write the length of the object
        comptObjs++; // Increment the object counter of the file
    }

    /**
     * Retrieves the instance at the specified position in the file
     *
     * @param position an integer value
     * @return the object read from the file, or null if the position is not greater than or equal to 0, or is nonexistent, or there are no objects
     * @throws IOException            if an input/output error occurs
     * @throws ClassNotFoundException if the class of the instance to be saved is not found
     */
    public T readObject(int position) throws IOException, ClassNotFoundException {
        // If there are no objects or the position is incorrect, return null
        if (position < 0 || comptObjs == 0 || position >= comptObjs) return null;

        // Find the position in the file of the object, skipping previous objects until reaching
        int compt = 1;
        long punter = 0;

        do {
            raf.seek(punter);
            int length = raf.readInt(); // Read the length of the object

            if (position + 1 == compt) {  // we are at the desired object
                byte[] data = new byte[length];
                raf.readFully(data); // Read the object data
                ByteArrayInputStream bis = new ByteArrayInputStream(data);
                ObjectInputStream ois = new ObjectInputStream(bis);
                return ((T) ois.readObject());
            }
            compt++;
            punter += length + 8; // 4 bytes for each size variable we put before and after the object
        } while (true);
    }

    /**
     * Retrieves the instance at the current position of the file pointer
     *
     * @return the object read from the file, or null if the current position of the pointer is incorrect or there are no objects
     * @throws IOException            if an input/output error occurs
     */
    public T readObject() throws IOException {
        // If there are no objects
        if (comptObjs == 0) return null;

        // Find the position in the file of the object, skipping previous objects until reaching
        try {
            int length = raf.readInt(); // Read the length of the object

            byte[] data = new byte[length];
            raf.readFully(data); // Read the object data
            raf.seek(raf.getFilePointer() + 4);
            ByteArrayInputStream bis = new ByteArrayInputStream(data);
            ObjectInputStream ois = new ObjectInputStream(bis);
            return ((T) ois.readObject());
        } catch (ClassNotFoundException | EOFException e) {
            // If the position was incorrect
        }
        return null;
    }

    /**
     * Deletes all content of the file
     *
     * @throws IOException if an input/output error occurs
     */
    public void deleteAll() throws IOException {
        raf.setLength(0L);
        comptObjs = 0; // Set the object counter of the file to 0
    }

    /**
     * Returns the number of objects in the file
     *
     * @return an integer indicating the number of objects in the file
     */
    public int size() {
        return comptObjs;
    }

    /**
     * Moves to the beginning of the file
     * @throws IOException if an input/output error occurs
     */
    public void goToBeginning() throws IOException {
        raf.seek(0);
    }

    /**
     * Moves to the end of the file
     * @throws IOException if an input/output error occurs
     */
    public void goToEnd() throws IOException {
        raf.seek(raf.length());
    }

    /**
     * Deletes the object at the specified position in the file
     *
     * @param position an integer value
     * @return the deleted object if found, null otherwise. The position must be greater than or equal to 0 and less than the number of objects in the file.
     * @throws IOException            if an input/output error occurs
     * @throws ClassNotFoundException if the class of the instance to be deleted is not found
     */
    public T deleteObject(int position) throws IOException, ClassNotFoundException {
        if (position < 0 || comptObjs == 0 || position >= comptObjs) return null;

        // Retrieve the object to be deleted
        T resultat = (T) this.readObject(position); // We found an object

        // Find the deletion position
        int compt = 1;
        long punter = 0;
        do {
            raf.seek(punter);
            int tamany = raf.readInt(); // Read the length of the object

            if (position + 1 == compt) { // we are at the desired object
                moveBackwards(tamany + 8, punter);
                break;
            }
            compt++;
            punter += tamany + 8;
        } while (true);

        // Decrement the object counter of the file
        comptObjs--;

        return resultat;
    }

    private void moveBackwards(int movementSize, long initialPosition) throws IOException {
        // Move the file content to leave free space
        long fileLength = raf.length();
        long readPos = initialPosition + movementSize;
        long writePos = initialPosition;

        while (readPos < fileLength) {
            raf.seek(readPos);
            int length = raf.readInt(); // Read the length of the object
            byte[] buffer = new byte[length + 8];
            raf.seek(readPos);
            int bytesRead = raf.read(buffer);
            raf.seek(writePos);
            raf.write(buffer, 0, bytesRead);
            readPos += bytesRead;
            writePos += bytesRead;
        }
    }

    /**
     * Closes this resource, relinquishing any underlying resources.
     * This method is invoked automatically on objects managed by the
     * {@code try}-with-resources statement.
     *
     * <p>While this interface method is declared to throw {@code
     * Exception}, implementers are <em>strongly</em> encouraged to
     * declare concrete implementations of the {@code close} method to
     * throw more specific exceptions, or to throw no exception at all
     * if the close operation cannot fail.
     *
     * <p> Cases where the close operation may fail require careful
     * attention by implementers. It is strongly advised to relinquish
     * the underlying resources and to internally <em>mark</em> the
     * resource as closed, prior to throwing the exception. The {@code
     * close} method is unlikely to be invoked more than once and so
     * this ensures that the resources are released in a timely manner.
     * Furthermore it reduces problems that could arise when the resource
     * wraps, or is wrapped, by another resource.
     *
     * <p><em>Implementers of this interface are also strongly advised
     * to not have the {@code close} method throw {@link
     * InterruptedException}.</em>
     * <p>
     * This exception interacts with a thread's interrupted status,
     * and runtime misbehavior is likely to occur if an {@code
     * InterruptedException} is {@linkplain Throwable#addSuppressed
     * suppressed}.
     * <p>
     * More generally, if it would cause problems for an
     * exception to be suppressed, the {@code AutoCloseable.close}
     * method should not throw it.
     *
     * <p>Note that unlike the {@link Closeable#close close}
     * method of {@link Closeable}, this {@code close} method
     * is <em>not</em> required to be idempotent.  In other words,
     * calling this {@code close} method more than once may have some
     * visible side effect, unlike {@code Closeable.close} which is
     * required to have no effect if called more than once.
     * <p>
     * However, implementers of this interface are strongly encouraged
     * to make their {@code close} methods idempotent.
     *
     * @throws IOException if this resource cannot be closed
     */
    @Override
    public void close() throws IOException {
        raf.close();
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


    public static void main(String[] args) throws IOException, ClassNotFoundException {
        DirectAccessFile f = new DirectAccessFile();
        f.deleteAll();

        f.writeObject(new Pojo("primer",70),4);
        for (int i = 0; i < 10; i++) {
            int pos=new Random().nextInt(f.size()+1);
            System.out.println("Anem a insertar l'objecte: "+pos);
            f.writeObject(new Pojo("nom"+i, i+new Random().nextInt(100)),pos);
            f.writeObject(new Pojo("nom_final" + i, new Random().nextInt(100)));
        }
        f.goToBeginning();
        for (int i = 0; i < f.size(); i++) {
            System.out.println(f.readObject());
        }

        for (int i = 0; i <10 ; i++) {
            int pos=new Random().nextInt(f.size()+1);
            System.out.println("Anem a borrar l'objecte: "+pos);
            f.deleteObject(pos);

        }

        for (int i = 0; i < f.size(); i++) {
            System.out.println(f.readObject(i));
        }

        f.close();

    }

}