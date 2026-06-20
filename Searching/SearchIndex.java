public class SearchIndex {

    public static void main(String[] args) {

        int[] arr={11,22,33,44,55};

        int key=44;

        int index=-1;

        for(int i=0;i<arr.length;i++){

            if(arr[i]==key){

                index=i;

                break;
            }
        }

        if(index!=-1)
            System.out.println("Index: "+index);
        else
            System.out.println("Element Not Found");
    }
}