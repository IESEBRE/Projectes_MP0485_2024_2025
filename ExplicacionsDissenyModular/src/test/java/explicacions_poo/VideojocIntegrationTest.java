package explicacions_poo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class VideojocIntegrationTest {

    private Videojoc videojoc;

    @BeforeEach
    void setUp() {
        videojoc = new Videojoc("Minecraft", "1.21.4", "Aventura", "Microsoft", 29.99, true);
    }

    @Test
    void testIncrementaPreu() {
        videojoc.incrementaPreu(10);
        assertThat(videojoc.getPreu()).isEqualTo(32.989);
    }

    @Test
    void testSetMaxJugadors() {
        boolean result = videojoc.setMaxJugadors(10);
        assertThat(result).isTrue();
        assertThat(videojoc.getMaxJugadors()).isEqualTo(10);
    }

    @Test
    void testToString() {
        String expected = "Videojoc{nom='Minecraft', versio='1.21.4', creador='Microsoft', categoria='Aventura', maxJugadors=0, preu=29.99, És multiplataforma}";
        assertThat(videojoc.toString()).isEqualTo(expected);
    }
}