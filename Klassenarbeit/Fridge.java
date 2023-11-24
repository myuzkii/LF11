import java.util.HashMap;
import java.util.Map;

public class Fridge {
    private Map<String, Integer> foodItems;

    public Fridge() {
        foodItems = new HashMap<>();
    }

    public boolean addFood(String food, int quantity) {
        if (foodItems.containsKey(food)) {
            int currentQuantity = foodItems.get(food);
            foodItems.put(food, currentQuantity + quantity);
        } else {
            foodItems.put(food, quantity);
        }
        return true;
    }

    public boolean removeFood(String food, int quantity) {
        if (foodItems.containsKey(food)) {
            int currentQuantity = foodItems.get(food);
            if (currentQuantity >= quantity) {
                if (currentQuantity == quantity) {
                    foodItems.remove(food);
                } else {
                    foodItems.put(food, currentQuantity - quantity);
                }
                return true;
            }
        }
        return false;
    }

    public void printQuantity(String food) {
        if (foodItems.containsKey(food)) {
            int quantity = foodItems.get(food);
            System.out.println(food + ": " + quantity);
        } else {
            System.out.println(food + " nicht im Kühlschrank.");
        }
    }

    public void printQuantities() {
        for (Map.Entry<String, Integer> entry : foodItems.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        Fridge fridge = new Fridge();

        fridge.addFood("Eier", 12);
        fridge.addFood("Milch", 2);
        fridge.addFood("Käse", 1);

        fridge.addFood("Eier", 6);
        fridge.addFood("Milch", 3);

        fridge.printQuantity("Eier");
        fridge.printQuantity("Kartoffeln");

        fridge.removeFood("Eier", 2);
        fridge.removeFood("Kartoffeln", 3);

        fridge.printQuantities();
    }
}
