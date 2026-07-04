package OOP.Collections;
import java.util.HashMap;

public class HashMapExample {

    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();

        map.put(101, "Himaja");
        map.put(102, "Rahul");
        map.put(103, "Priya");

        System.out.println("Student Details:");

        for (Integer key : map.keySet()) {
            System.out.println(key + " : " + map.get(key));
        }
    }
}