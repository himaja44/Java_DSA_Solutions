package Sorting;


public class FindSecondSmallest {

    public static void main(String[] args) {

        int[] arr = {10, 5, 20, 8, 15};

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int num : arr) {

            if (num < smallest) {
                secondSmallest = smallest;
                smallest = num;
            } else if (num < secondSmallest && num != smallest) {
                secondSmallest = num;
            }
        }

        System.out.println("Second Smallest: " + secondSmallest);
    }
}