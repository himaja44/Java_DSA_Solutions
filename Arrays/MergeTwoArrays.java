public class MergeTwoArrays {

    public static void main(String[] args) {

        int[] arr1 = {10, 20, 30};
        int[] arr2 = {40, 50, 60};

        int[] merge = new int[arr1.length + arr2.length];

        int k = 0;

        for (int i = 0; i < arr1.length; i++) {
            merge[k++] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++) {
            merge[k++] = arr2[i];
        }

        System.out.print("Merged Array: ");

        for (int i = 0; i < merge.length; i++) {
            System.out.print(merge[i] + " ");
        }
    }
}