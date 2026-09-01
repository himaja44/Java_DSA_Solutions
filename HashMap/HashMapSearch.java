import java.util.HashMap;

public class HashMapSearch {

    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();

        students.put(101, "Himaja");
        students.put(102, "Rahul");
        students.put(103, "Priya");

        int key = 102;

        if (students.containsKey(key)) {
            System.out.println("Student Found: " + students.get(key));
        } else {
            System.out.println("Student Not Found");
        }
    }
}