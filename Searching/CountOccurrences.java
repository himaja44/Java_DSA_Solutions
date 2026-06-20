public class CountOccurrences {

    public static void main(String[] args) {

        int[] arr={5,10,5,15,5,20};

        int key=5;

        int count=0;

        for(int num:arr){

            if(num==key)
                count++;
        }

        System.out.println("Occurrences: "+count);
    }
}