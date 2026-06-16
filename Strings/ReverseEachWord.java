public class ReverseEachWord {

    public static void main(String[] args) {

        String str = "Java is Easy";
        String[] words = str.split(" ");

        System.out.print("Reversed Each Word: ");

        for (String word : words) {

            for (int i = word.length() - 1; i >= 0; i--) {
                System.out.print(word.charAt(i));
            }

            System.out.print(" ");
        }
    }
}