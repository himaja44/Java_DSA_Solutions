public class SearchMinimumElement {

    public static void main(String[] args) {

        int[] arr={10,55,32,90,25};

        int min=arr[0];

        for(int i=1;i<arr.length;i++){

            if(arr[i]<min)
                min=arr[i];
        }

        System.out.println("Minimum Element: "+min);
    }
}