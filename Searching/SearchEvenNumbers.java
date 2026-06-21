public class SearchEvenNumbers {

    public static void main(String[] args) {

        int[] arr = {10, 15, 22, 35, 40, 55};

        System.out.print("Even Numbers: ");

        for(int i = 0; i < arr.length; i++) {

            if(arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}