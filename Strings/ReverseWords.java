public class ReverseWords {

    public static void main(String[] args) {

        String str = "Java is Easy";
        String[] words = str.split(" ");

        System.out.print("Reversed Words: ");

        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i] + " ");
        }
    }
}