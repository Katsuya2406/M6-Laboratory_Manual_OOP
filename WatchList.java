// WatchList.java
import java.util.ArrayList;
import java.util.List;

public class WatchList {
    public static void main(String[] args) {
        List<String> titles = new ArrayList<>();
        titles.add("Spirited Away");
        titles.add("Your name");
        titles.add("Spirited Away");
        
        titles.add (1, "Wheathering with You");
        System.out.println(titles);

        System.out.println("First: " + titles.get(0));

        titles.set(3, "Suzume");
        titles.remove("Your Name");
        System.out.println(titles);

        System.out.println(titles.size() + " titles");

        System.out.println(titles.contains("Spirited Away") + " " + titles.indexOf("Spirited Away"));
        
        List<Integer> ratings = new ArrayList<>();
ratings.add(9);
ratings.add(7);
ratings.add(1);
System.out.println(ratings);

int firstRating = ratings.get(0);
System.out.println("First rating plus one: " + (firstRating + 1));

ratings.remove(1);
System.out.println(ratings);

ratings.remove(Integer.valueOf(1));
System.out.println(ratings);
    }
}
