import java.util.TreeSet;

public class CielingElement {
    public static void main(String[] args) {

        TreeSet<Integer> set = new TreeSet<>();

        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);

        System.out.println("Ceiling of 25: " + set.ceiling(25));
        System.out.println("Ceiling of 30: " + set.ceiling(30));
    }
}