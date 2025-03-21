import java.util.HashSet;
import java.util.Set;

public class HashsetExample {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();

        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("Alice");

        System.out.println("Set elements: " + names);

        System.out.println("Is Bob in the set? " + names.contains("Bob"));

        names.remove("Charlie");

        System.out.println("Final Set elements:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}

