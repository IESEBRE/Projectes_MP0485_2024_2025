package explicacions_poo;

import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class VideojocTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        System.out.println("Comença test");
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
        System.out.println("Acaba test");
    }

    @org.junit.jupiter.api.Test
    void incrementaPreu() {
        Videojoc j=new Videojoc("Prova","Prova","Prova", "Prova", 10.0, true);
        j.incrementaPreu(5);

        Assertions.assertEquals(10.5, j.getPreu());
    }
}