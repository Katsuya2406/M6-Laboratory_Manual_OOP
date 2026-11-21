// FlavorReport.java
import java.util.HashMap;
import java.util.Map;

public class FlavorReport {
    public static void main(String[] args) {
        Map<String, Integer> priceByFlavor = new HashMap<>();
        priceByFlavor.put("Ube", 45);
        priceByFlavor.put("Mango", 50);
        priceByFlavor.put("Cheese", 55);

        System.out.println("Ube costs " + priceByFlavor.get("Ube"));

        Integer old = priceByFlavor.put("Ube", 48);
        System.out.println(old + " -> " + priceByFlavor.get("Ube"));

        System.out.println("Has Durian? " + priceByFlavor.containsKey("Durian"));
        System.out.println("Durian Price: " + priceByFlavor.get("Durian"));
        System.out.println("Durian or 0: " + priceByFlavor.getOrDefault("Durian", 0));

        System.out.println(priceByFlavor.size() + " flavors");

        for (Map.Entry<String, Integer> entry : priceByFlavor.entrySet()) {
            System.out.println(" " + entry.getKey() + " = " + entry.getValue());

        }

        String[] orders = {"Ube", "Mango", "Ube", "Cheese", "Ube", "Mango"};
        Map<String, Integer> orderCount = new HashMap<>();

        for (String flavor : orders){
            orderCount.put(flavor, orderCount.getOrDefault(flavor, 0) + 1);
        }

        System.out.println("Ube orders: " + orderCount.get("Ube"));
        System.out.println("Durian orders: " + orderCount.getOrDefault("Durian", 0));
    }    
}
