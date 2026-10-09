import java.util.TreeMap;

public class TreeMapSearch {
    public static void main(String[] args) {

        TreeMap<Integer, String> map = new TreeMap<>();

        map.put(101, "Ravi");
        map.put(102, "Priya");
        map.put(103, "Himaja");

        int key = 102;

        if (map.containsKey(key)) {
            System.out.println("Value: " + map.get(key));
        } else {
            System.out.println("Key not found");
        }
    }
}