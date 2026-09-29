import java.util.HashSet;

public class CheckEmptyHashSet {
    public static void main(String[] args) {

        HashSet<Integer> set = new HashSet<>();

        System.out.println("Is HashSet empty? " + set.isEmpty());

        set.add(10);
        set.add(20);

        System.out.println("Is HashSet empty? " + set.isEmpty());
        System.out.println("HashSet: " + set);
    }
}