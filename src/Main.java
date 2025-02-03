import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MorseCodeConverter converter = new MorseCodeConverter();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Välj vad du vill göra:");
        System.out.println("1. Konvertera från engelska till morsekod");
        System.out.println("2. Konvertera från morsekod till engelska");

        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1:
                System.out.println("Skriv text:");
                String englishText = scanner.nextLine();
                String morseCode = converter.toMorse(englishText);
                System.out.println("Morsekod: " + morseCode);
                break;

            case 2:
                System.out.println("Skriv morsekod (använd mellanslag mellan varje bokstav):");
                String morseInput = scanner.nextLine();
                String englishOutput = converter.toEnglish(morseInput);
                System.out.println("Engelska: " + englishOutput);
                break;

            default:
                System.out.println("Ogiltigt val.");
        }

        scanner.close();
    }
}