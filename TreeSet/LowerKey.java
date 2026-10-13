import java.util.TreeMap;

public class LowerKey {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();

        map.put(10, "Java");
        map.put(20, "Python");
        map.put(30, "React");
        map.put(40, "Node");

        System.out.println(map.lowerKey(30));
    }
}