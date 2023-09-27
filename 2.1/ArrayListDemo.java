import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Collections;

public class ArrayListDemo {

    public static void main(String[] args) {
        ArrayList<String> liste = new ArrayList<String>();

        liste.add("eins");
        liste.add("zwei");
        liste.add("drei");
        liste.add("vier");
        liste.add("fuenf");

        System.out.println("\nAusgabe der String-Liste mit der foreach-Schleife:");
        for (String element : liste) {
            System.out.println(element);
        }

        ArrayList<Integer> liste2 = new ArrayList<Integer>();

        liste2.add(1);
        liste2.add(2);
        liste2.add(3);
        liste2.add(4);
        liste2.add(5);

        System.out.println("\nAusgabe der Integer-Liste mit der foreach-Schleife:");
        for (Integer temp : liste2) {
            System.out.println(temp);
        }

        System.out.println("\nAusgabe mit der for-Schleife:");
        for (int i = liste2.size() - 1; i >= 0; i--) {
            System.out.println(liste2.get(i));
        }
        liste.add(3, "Acht");
        liste.set(4, "Heinrich");
        ListIterator<String> li = liste.listIterator();
        System.out.println("\nAusgabe mit dem ListIterator und einer while-Schleife:");
        while (li.hasNext()) {
            System.out.println(li.next());
        }

        Collections.sort(liste);

        System.out.println("\nAusgabe der sortierten String-Liste mit der foreach-Schleife:");
        for (String element : liste) {
            System.out.println(element);
        }

        System.out.println(liste.contains("sieben"));
        System.out.println(liste.indexOf("sieben"));
        System.out.println(liste.contains("Heinrich"));
        System.out.println(liste.indexOf("zwei"));
    }

}