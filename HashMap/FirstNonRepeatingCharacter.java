import java.util.HashMap;

public class FirstNonRepeatingCharacter {

    public static void main(String[] args) {

        String str = "aabbcde";

        HashMap<Character, Integer> frequency = new HashMap<>();

        for (char ch : str.toCharArray()) {
            frequency.put(ch, frequency.getOrDefault(ch, 0) + 1);
        }

        for (char ch : str.toCharArray()) {

            if (frequency.get(ch) == 1) {
                System.out.println("First Non-Repeating Character: " + ch);
                break;
            }
        }
    }
}