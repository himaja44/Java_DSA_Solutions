public class CountSpecialCharacters {

    public static void main(String[] args) {

        String str = "Java@123#Code!";

        int count = 0;

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (!Character.isLetterOrDigit(ch)) {
                count++;
            }
        }

        System.out.println("Special Characters: " + count);
    }
}