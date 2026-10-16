import java.util.TreeMap;

public class RemoveFirstLastEntry {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();

        map.put(10, "Java");
        map.put(20, "Python");
        map.put(30, "React");
        map.put(40, "Node");

        System.out.println("Original: " + map);

        System.out.println("Removed first: " + map.pollFirstEntry());
        System.out.println("Removed last: " + map.pollLastEntry());

        System.out.println("Remaining: " + map);
    }
}