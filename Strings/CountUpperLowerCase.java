public class CountUpperLowerCase {

    public static void main(String[] args) {

        String str = "Java Programming";

        int upper = 0, lower = 0;

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (Character.isUpperCase(ch))
                upper++;
            else if (Character.isLowerCase(ch))
                lower++;
        }

        System.out.println("Uppercase Letters: " + upper);
        System.out.println("Lowercase Letters: " + lower);
    }
}