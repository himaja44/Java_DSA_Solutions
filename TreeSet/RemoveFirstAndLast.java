import java.util.TreeSet;

public class RemoveFirstAndLast {
    public static void main(String[] args) {

        TreeSet<Integer> set = new TreeSet<>();

        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);

        System.out.println("Original: " + set);

        set.pollFirst();

        System.out.println("After removing first: " + set);

        set.pollLast();

        System.out.println("After removing last: " + set);
    }
}