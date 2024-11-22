package problemesjoel;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DesiertoSinaiSolucio2Test {


    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    void singleCaseSingleMap() {
        String input = "1\n1\nMap1\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        DesiertoSinaiSolucio2.main(new String[]{});
        assertEquals("Map1\n", outContent.toString());
    }

    @Test
    void singleCaseMultipleMaps() {
        String input = "1\n3\nMap1\nMap2\nMap1\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        DesiertoSinaiSolucio2.main(new String[]{});
        assertEquals("Map1\n", outContent.toString());
    }

    @Test
    void multipleCases() {
        String input = "2\n2\nMap1\nMap2\n3\nMap3\nMap3\nMap2\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        DesiertoSinaiSolucio2.main(new String[]{});
        assertEquals("Map1\nMap3\n", outContent.toString());
    }

    @Test
    void edgeCaseNoMaps() {
        String input = "1\n0\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        DesiertoSinaiSolucio2.main(new String[]{});
        assertEquals("\n", outContent.toString());
    }

    @Test
    void edgeCaseAllMapsSameVotes() {
        String input = "1\n3\nMap1\nMap2\nMap3\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        DesiertoSinaiSolucio2.main(new String[]{});
        assertEquals("Map1\n", outContent.toString());
    }

    @Test
    void multiplesMapes() {
        String input = "1\n3\nMap3\nMap3\nMap3\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        DesiertoSinaiSolucio2.main(new String[]{});
        assertEquals("Map3\n", outContent.toString());
    }
}