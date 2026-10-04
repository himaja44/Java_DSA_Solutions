import java.util.TreeSet;

public class HigherAndLower {
    public static void main(String[] args) {

        TreeSet<Integer> set = new TreeSet<>();

        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);

        System.out.println("Higher than 30: " + set.higher(30));
        System.out.println("Lower than 30: " + set.lower(30));
    }
}