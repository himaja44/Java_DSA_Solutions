import java.util.TreeMap;

public class TreeMapDescending {
    public static void main(String[] args) {

        TreeMap<Integer, String> map = new TreeMap<>();

        map.put(1, "Java");
        map.put(2, "Python");
        map.put(3, "JavaScript");
        map.put(4, "React");

        System.out.println(map.descendingMap());
    }
}