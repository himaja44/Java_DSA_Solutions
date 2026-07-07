public class SumOfNaturalNumbers {

    static int sum(int n) {

        if (n == 1)
            return 1;

        return n + sum(n - 1);
    }

    public static void main(String[] args) {

        int num = 10;

        System.out.println("Sum = " + sum(num));
    }
}