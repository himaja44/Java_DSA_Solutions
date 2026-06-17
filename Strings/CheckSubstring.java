public class CheckSubstring {

    public static void main(String[] args) {

        String str = "Java Programming";

        if (str.contains("Program")) {
            System.out.println("Substring Found");
        } else {
            System.out.println("Substring Not Found");
        }
    }
}