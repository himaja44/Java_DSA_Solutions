public class FindLastOccurrence {

    public static void main(String[] args) {

        int[] arr={10,20,30,20,40,20};

        int key=20;

        for(int i=arr.length-1;i>=0;i--){

            if(arr[i]==key){
                System.out.println("Last Occurrence Position: "+(i+1));
                break;
            }
        }
    }
}