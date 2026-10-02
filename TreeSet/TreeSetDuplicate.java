import java.util.TreeSet;

public class TreeSetDuplicate {
    public static void main(String[] args) {

        TreeSet<Integer> set = new TreeSet<>();

        set.add(10);
        set.add(20);
        set.add(10);
        set.add(30);
        set.add(20);

        System.out.println("TreeSet: " + set);
    }
}