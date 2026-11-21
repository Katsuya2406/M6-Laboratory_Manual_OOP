// MedicineStock.java
import java.util.HashSet;
import java.util.Set;

public class MedicineStock {
    public static void main(String[] args) {
       Set<Medicine> shelf = new HashSet<>();

       shelf.add(new Medicine("PAR500", "Paracetamol 500mg", 40));
       shelf.add(new Medicine("PAR500", "Paracetamol 500mg", 40));
       shelf.add(new Medicine("AMO250", "Amoxicillin 250mg", 25));

       System.out.println("Items on shelf: " + shelf.size());

       Medicine para = new Medicine("PAR500", "Paracetamol 500mg", 40);
       System.out.println("Already stocked? " + shelf.contains(para));

       for (Medicine med : shelf){
              System.out.println(" " + med);
       }
    }
}
