package problemesjoel;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BloodborneStringTest {


    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outContent));
    }


    @Test
    void singleCaseNoRepeatedCharacters() {
        String input = "1\nabcde\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        BloodborneString.main(new String[]{});
        assertEquals("NO\n", outContent.toString());
    }

    @Test
    void singleCaseWithRepeatedCharacters() {
        String input = "1\nabccde\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        BloodborneString.main(new String[]{});
        assertEquals("SI\n", outContent.toString());
    }

    @Test
    void multipleCasesMixedResults() {
        String input = "2\nabcde\nabccde\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        BloodborneString.main(new String[]{});
        assertEquals("NO\nSI\n", outContent.toString());
    }

    @Test
    void edgeCaseEmptyString() {
        String input = "1\n\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        BloodborneString.main(new String[]{});
        assertEquals("NO\n", outContent.toString());
    }

    @Test
    void edgeCaseSingleCharacter() {
        String input = "1\na\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        BloodborneString.main(new String[]{});
        assertEquals("NO\n", outContent.toString());
    }

    @Test
    void edgeCaseAllCharactersSame() {
        String input = "1\naaaaa\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        BloodborneString.main(new String[]{});
        assertEquals("SI\n", outContent.toString());
    }

}