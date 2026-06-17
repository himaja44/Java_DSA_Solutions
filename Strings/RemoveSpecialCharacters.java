public class RemoveSpecialCharacters {

    public static void main(String[] args) {

        String str = "Java@123#Code!";

        String result = str.replaceAll("[^a-zA-Z0-9]", "");

        System.out.println(result);
    }
}