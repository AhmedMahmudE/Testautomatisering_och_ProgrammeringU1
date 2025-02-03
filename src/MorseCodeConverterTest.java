import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
//Alla tester fungerar nu
public class MorseCodeConverterTest {
    private final MorseCodeConverter converter = new MorseCodeConverter();

    @Test
    public void testEnglishToMorse() {
        assertEquals(".- .... -- . -..", converter.toMorse("AHMED"));
        assertEquals(".- .... -- . -..", converter.toMorse("AHMED"));
    }

    @Test
    public void testMorseToEnglish() {
        assertEquals("HELLO", converter.toEnglish(".... . .-.. .-.. ---"));
        assertEquals("WORLD", converter.toEnglish(".-- --- .-. .-.. -.."));
    }

    @Test
    public void  testInvalidInputInEnglishToMorse() {
        assertEquals("1", converter.toMorse("1"));
        assertEquals("", converter.toMorse(""));
    }

    @Test
    public void testInvalidInputInMorseToEnglish() {
        assertEquals("?", converter.toEnglish("?"));
        assertEquals("", converter.toEnglish(""));
    }

    @Test
    public void testSpecialfall() {
        assertEquals("", converter.toMorse(""));
        assertEquals("", converter.toEnglish(""));
    }
}