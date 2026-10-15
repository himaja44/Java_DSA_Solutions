import java.util.TreeMap;

public class FloorKey {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();

        map.put(10, "Java");
        map.put(20, "Python");
        map.put(30, "React");
        map.put(40, "Node");

        System.out.println(map.floorKey(25));
        System.out.println(map.floorKey(30));
    }
}