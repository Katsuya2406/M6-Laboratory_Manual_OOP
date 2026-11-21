// ClinicQueue.java
import java.util.ArrayDeque;
import java.util.Queue;

public class ClinicQueue {
    public static void main(String[] args) {
        Queue<String> waiting = new ArrayDeque<>();
        waiting.offer("Ana");
        waiting.offer("Ben");
        waiting.offer("Cara");

        System.out.println("Waiting: " + waiting);
        System.out.println("Next up: " + waiting.peek());
        System.out.println("In line: " + waiting.size());

        while (!waiting.isEmpty()) {
            System.out.println("Seen: " + waiting.poll());
        }

        System.out.println("poll() on empty: " + waiting.poll());
        waiting.remove();
    }
}