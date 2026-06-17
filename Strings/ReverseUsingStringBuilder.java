public class ReverseUsingStringBuilder {

    public static void main(String[] args) {

        String str = "Programming";

        StringBuilder sb = new StringBuilder(str);

        System.out.println(sb.reverse());
    }
}