import java.util.TreeMap;
import java.util.Map;

public class TreeMapIteration {
    public static void main(String[] args) {

        TreeMap<Integer, String> map = new TreeMap<>();

        map.put(30, "C");
        map.put(10, "Java");
        map.put(20, "Python");

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(
                entry.getKey() + " : " + entry.getValue()
            );
        }
    }
}