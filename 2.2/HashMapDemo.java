import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class HashMapDemo {

    public static void main(String[] args) {

        HashMap<Integer, String> passportsAndNames = new HashMap<Integer, String>();

        Scanner ms = new Scanner(System.in);

        passportsAndNames.put(212133, "Bridget Logan");
        passportsAndNames.put(162348, "Iwan der Große");
        passportsAndNames.put(8082771, "Donald John Trump");
        System.out.println(passportsAndNames + "\n\n");

        String lidiaName = passportsAndNames.get(212133);
        System.out.println(lidiaName + "\n\n");

        passportsAndNames.remove(162348);
        System.out.println(passportsAndNames + "\n\n");

        System.out.println(
                "Passnummer 11111 unter den Daten vorhanden? " + passportsAndNames.containsKey(11111) + "\n\n");
        System.out.println(
                "Person \"Donald John Trump\" unter den Daten vorhanden?"
                        + passportsAndNames.containsValue("Donald John Trump") + "\n\n");

        // Man kann separate Listen mit allen Schl�sseln und allen Werten abrufen.
        // Die Schl�ssel werden in ein Set extrahiert.
        Set keys = passportsAndNames.keySet();
        System.out.println("Schlüssel: " + keys);

        // Die Werte werden in einer gew�hnlichen ArrayList gespeichert.
        ArrayList<String> values = new ArrayList<String>(passportsAndNames.values());
        System.out.println("\n\nWerte: " + values);

        // Die size()-Methode gibt die Anzahl der Elemente zur�ck
        System.out.println("\n\nAnzahl von Einträge: " + passportsAndNames.size());

        // Um zu pr�fen, ob mindestens ein Element in unserer HashMap vorhanden ist,
        // kann man die Methode isEmpty() verwenden

        if (!passportsAndNames.isEmpty()) {

            System.out.println(passportsAndNames);
        }

        HashMap<Integer, String> passportsAndNames2 = new HashMap<Integer, String>();
        passportsAndNames2.put(917352, "Clifford Patrick");
        passportsAndNames2.put(925648, "Mitchell Salgado");

        // Man kann mit der Methode putAll() zwei Maps zu einer kombinieren.
        passportsAndNames.putAll(passportsAndNames2);
        System.out.println("\n\n" + passportsAndNames);

        for (Integer key : passportsAndNames.keySet()) {
            System.out.println("Key: " + key);
            System.out.println("Value: " + passportsAndNames.get(key) + "\n_____\n");
        }

        // eine andere M�glichkeit.

        for (Map.Entry<Integer, String> entry : passportsAndNames.entrySet()) {
            System.out.println(entry);
        }

        // Die clear()-Methode l�scht alle Elemente aus dem HashMap
        passportsAndNames.clear();
        System.out.println("\n\nDie leere Struktur nach dem Löschen aller Elementen: " + passportsAndNames);

    }
}