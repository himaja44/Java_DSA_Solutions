import java.util.TreeSet;

public class FloorElement {
    public static void main(String[] args) {

        TreeSet<Integer> set = new TreeSet<>();

        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);

        System.out.println("Floor of 25: " + set.floor(25));
        System.out.println("Floor of 30: " + set.floor(30));
    }
}