import java.util.HashMap;
import java.util.Map;

public class MorseCodeConverter {
    // Morsekod tabellen
    private static final Map<Character, String> charToMorse = new HashMap<>();
    private static final Map<String, Character> morseToChar = new HashMap<>();

    static {
        charToMorse.put('A', ".-");
        charToMorse.put('B', "-...");
        charToMorse.put('C', "-.-.");
        charToMorse.put('D', "-..");
        charToMorse.put('E', ".");
        charToMorse.put('F', "..-.");
        charToMorse.put('G', "--.");
        charToMorse.put('H', "....");
        charToMorse.put('I', "..");
        charToMorse.put('J', ".---");
        charToMorse.put('K', "-.-");
        charToMorse.put('L', ".-..");
        charToMorse.put('M', "--");
        charToMorse.put('N', "-.");
        charToMorse.put('O', "---");
        charToMorse.put('P', ".--.");
        charToMorse.put('Q', "--.-");
        charToMorse.put('R', ".-.");
        charToMorse.put('S', "...");
        charToMorse.put('T', "-");
        charToMorse.put('U', "..-");
        charToMorse.put('V', "...-");
        charToMorse.put('W', ".--");
        charToMorse.put('X', "-..-");
        charToMorse.put('Y', "-.--");
        charToMorse.put('Z', "--..");

        // En omvänd tabell
        for (Map.Entry<Character, String> entry : charToMorse.entrySet()) {
            morseToChar.put(entry.getValue(), entry.getKey());
        }
    }

    // Kommer konvertera från engelska till morsekod
    public String toMorse(String text) {
        StringBuilder result = new StringBuilder();
        text = text.toUpperCase(); // Gör allt till stora bokstväer

        for (char c : text.toCharArray()) {
            if (charToMorse.containsKey(c)) {
                result.append(charToMorse.get(c)).append(" "); // Lägg till morsekod
            } else {
                result.append(c).append(" "); // Behåll ogiltiga tecken
            }
        }

        return result.toString().trim(); // Ta bort onödiga mellanslag om det finns
    }

    // Konvertera från morsekod till engelska
    public String toEnglish(String morseCode) {
        StringBuilder result = new StringBuilder();
        String[] codes = morseCode.split(" "); // Dela upp Morsekoden vid mellanslag :)

        for (String code : codes) {
            if (morseToChar.containsKey(code)) {
                result.append(morseToChar.get(code)); // Lägg till motsvarande bokstav
            } else {
                result.append(code); // Behåll ogiltiga tecken
            }
        }

        return result.toString();
    }
}