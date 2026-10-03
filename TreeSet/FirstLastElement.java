import java.util.TreeSet;

public class FirstLastElement {
    public static void main(String[] args) {

        TreeSet<Integer> set = new TreeSet<>();

        set.add(45);
        set.add(10);
        set.add(30);
        set.add(5);
        set.add(80);

        System.out.println("Smallest element: " + set.first());
        System.out.println("Largest element: " + set.last());
    }
}