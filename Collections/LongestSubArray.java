
public class LongestSubarray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 0, 1, 1, 0};
        int k = 4;

        int left = 0;
        int sum = 0;
        int maxLength = 0;

        for (int right = 0; right < arr.length; right++) {
            sum += arr[right];

            while (sum > k) {
                sum -= arr[left];
                left++;
            }

            maxLength = Math.max(
                maxLength, right - left + 1
            );
        }

        System.out.println("Longest length: " + maxLength);
    }
}
