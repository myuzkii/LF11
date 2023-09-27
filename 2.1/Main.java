import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            myList.add((int) (Math.random() * 9 + 1));
        }

        System.out.println("Liste mit 20 Zufallszahlen");
        printList(myList);

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Eine Zahl zwischen 1 und 9: ");
            int suchzahl = scanner.nextInt();

            int count = 0;
            for (int num : myList) {
                if (num == suchzahl) {
                    count++;
                }
            }
            System.out.println("Die Zahl " + suchzahl + " kommt " + count + " mal in der Liste vor.");

            System.out.println("Die Zahl kommt an folgenden Indices in der Liste vor:");
            for (int i = 0; i < myList.size(); i++) {
                if (myList.get(i) == suchzahl) {
                    System.out.printf("myList[%2d] : %d\n", i, myList.get(i));
                }
            }

            myList.removeIf(num -> num == suchzahl);

            System.out.println("Liste nach Enthaltung von " + suchzahl + ":");
        }
        printList(myList);

        for (int i = 0; i < myList.size(); i++) {
            if (myList.get(i) == 5) {
                myList.add(i + 1, 0);
                i++;
            }
        }

        System.out.println("Liste nach Einfuegen von 0 hinter jeder 5");
        printList(myList);
    }

    public static void printList(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.printf("myList[%2d] : %d\n", i, list.get(i));
        }
    }
}
