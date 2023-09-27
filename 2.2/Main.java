import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    private static Map<String, String> telefonbuch = new HashMap<>();

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String auswahl;

            telefonbuch.put("Max", "12345");
            telefonbuch.put("Max", "67890");
            System.out.println("Max's Nummer nach Überschreiben: " + telefonbuch.get("Max"));

            telefonbuch.put("Anna", "67890");
            System.out.println("Anzahl der Einträge mit der Nummer 67890: " + countValues("67890"));

            do {
                System.out.println("\n--- Telefonbuch ---");
                System.out.println("1. Nummer hinzufügen/überschreiben");
                System.out.println("2. Nummer löschen");
                System.out.println("3. Nummer auslesen");
                System.out.println("4. Überprüfen, ob Name vorhanden ist");
                System.out.println("5. Überprüfen, ob Nummer vorhanden ist");
                System.out.println("6. Beenden");
                System.out.print("Auswahl: ");
                auswahl = scanner.nextLine();

                switch (auswahl) {
                    case "1":
                        System.out.print("Name: ");
                        String name = scanner.nextLine();
                        System.out.print("Nummer: ");
                        String nummer = scanner.nextLine();
                        telefonbuch.put(name, nummer);
                        break;
                    case "2":
                        System.out.print("Name: ");
                        name = scanner.nextLine();
                        telefonbuch.remove(name);
                        break;
                    case "3":
                        System.out.print("Name: ");
                        name = scanner.nextLine();
                        System.out.println("Nummer: " + telefonbuch.get(name));
                        break;
                    case "4":
                        System.out.print("Name: ");
                        name = scanner.nextLine();
                        System.out.println(telefonbuch.containsKey(name) ? "Name vorhanden." : "Name nicht gefunden.");
                        break;
                    case "5":
                        System.out.print("Nummer: ");
                        nummer = scanner.nextLine();
                        System.out.println(
                                telefonbuch.containsValue(nummer) ? "Nummer vorhanden." : "Nummer nicht gefunden.");
                        break;
                    case "6":
                        System.out.println("Programm beendet.");
                        break;
                    default:
                        System.out.println("Ungültige Auswahl.");
                }
            } while (!auswahl.equals("6"));
        }
    }

    private static int countValues(String value) {
        int count = 0;
        for (String v : telefonbuch.values()) {
            if (v.equals(value)) {
                count++;
            }
        }
        return count;
    }
}