import java.util.ArrayList;
import java.util.List;
public class ArrayExample {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Apple"); 

        System.out.println("List elements: " + fruits);

        System.out.println("Element at index 1: " + fruits.get(1));

        fruits.remove("Cherry");

        System.out.println("Final List elements:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
