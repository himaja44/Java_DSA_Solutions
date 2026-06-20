public class SearchCharacter {

    public static void main(String[] args) {

        String str="Programming";

        char ch='g';

        boolean found=false;

        for(int i=0;i<str.length();i++){

            if(str.charAt(i)==ch){

                System.out.println("Character Found");

                found=true;

                break;
            }
        }

        if(!found)
            System.out.println("Character Not Found");
    }
}