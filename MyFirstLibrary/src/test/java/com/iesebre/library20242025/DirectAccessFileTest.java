package com.iesebre.library20242025;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class DirectAccessFileTest {


    @Test
    void writeObject_atSpecificPosition() throws IOException, ClassNotFoundException {
        DirectAccessFile<Pojo> file = new DirectAccessFile<>();
        file.deleteAll();
        Pojo pojo = new Pojo("test", 100);
        assertTrue(file.writeObject(pojo, 0));
        //Este mètode d'AssertJ mira si els objectes són una còpia dèbil (shallow) i no el mateix objecte
        assertThat(pojo).usingRecursiveComparison().isEqualTo(file.readObject(0));
        //assertEquals(pojo, file.readObject(0));
    }

    @Test
    void writeObject_atEndOfFile() throws IOException, ClassNotFoundException {
        DirectAccessFile<Pojo> file = new DirectAccessFile<>();
        file.deleteAll();
        Pojo pojo = new Pojo("test", 100);
        file.writeObject(pojo);
        assertThat(pojo).usingRecursiveComparison().isEqualTo(file.readObject(file.size() - 1));
        //assertEquals(pojo, file.readObject(file.size() - 1));
    }

    @Test
    void readObject_fromInvalidPosition() throws IOException, ClassNotFoundException {
        DirectAccessFile<Pojo> file = new DirectAccessFile<>();
        file.deleteAll();
        assertNull(file.readObject(-1));
        assertNull(file.readObject(1));
    }

    @Test
    void deleteObject_fromValidPosition() throws IOException, ClassNotFoundException {
        DirectAccessFile<Pojo> file = new DirectAccessFile<>();
        file.deleteAll();
        Pojo pojo = new Pojo("test", 100);
        file.writeObject(pojo);
        assertThat(pojo).usingRecursiveComparison().isEqualTo(file.deleteObject(0));
        //assertEquals(pojo, file.deleteObject(0));
        assertNull(file.readObject(0));
    }

    @Test
    void deleteObject_fromInvalidPosition() throws IOException, ClassNotFoundException {
        DirectAccessFile<Pojo> file = new DirectAccessFile<>();
        file.deleteAll();
        assertNull(file.deleteObject(-1));
        assertNull(file.deleteObject(1));
    }

    @Test
    void size_afterMultipleOperations() throws IOException, ClassNotFoundException {
        DirectAccessFile<Pojo> file = new DirectAccessFile<>();
        file.deleteAll();
        assertEquals(0, file.size());
        file.writeObject(new Pojo("test1", 100));
        file.writeObject(new Pojo("test2", 200),0);
        file.writeObject(new Pojo("test3", 200),1);
        assertEquals(3, file.size());
        file.deleteObject(0);
        assertEquals(2, file.size());
    }

    @Test
    void check_ReadObjectWithNoParams() throws IOException {
        DirectAccessFile<Pojo> file = new DirectAccessFile<>();
        file.deleteAll();
        Pojo pojo=new Pojo("cien", 100);
        file.writeObject(pojo);
        file.goToBeginning();
        assertThat(pojo).usingRecursiveComparison().isEqualTo(file.readObject());
        //assertEquals(p, file.readObject());


    }
}